# GEF pour les nuls

*Le projet est disponible sur CVS dans samples et dans le répertoire
seg.gefForDummies.*

Donc premièrement on se fait un nouveau projet de plug-in\! Première
étape qui est pas mal facile ;). J’ai donné le nom de seg.gefForDummies
à mon projet. Ne pas commencer votre package par une lettre majuscule ou
Eclipse va vous le dire à chaque fois que vous créer une nouvelle
classe:

\<center\> %ATTACHURL%/image002.jpg \</center\>

Ensuite, vous devez ajouter des dépendances à votre projet de plug-in.
Par défaut le plugin.xml est ouvert quand on fait un nouveau projet.
Simplement aller dans la page dependencies.

\<center\> %ATTACHURL%/image004.jpg \</center\>

Donc pour que votre projet sache où aller chercher certaines classes
vous devez ajouter les dépendances a draw2d, gef ainsi que quelques
autres avec le add... Pour une raison vraiment bizarre, ajoutez draw2d
avant GEF ou il ne trouvera pas draw2d plus tard.

\<center\> %ATTACHURL%/image006.jpg \</center\>

Dans le package explorer, cliquer sur le package seg.gefForDummies et
appuyer sur l’icône de création de package %ATTACHURL%/image007.jpg .
Créer trois package comme suis :

\<center\> %ATTACHURL%/image009.jpg \</center\>

Également créez un package appelé seg.gefForDummies.icons qui contiendra
tous les icônes inclus dans un .zip avec ce document. Expliquons un peu
plus chacun de ces package. Ces package sont divisé en une structure MVC
(Model View Controler). Le package model contiendra toutes les classes
de notre model. Dans notre cas nous avons seulement besoin d’une classe
représentant un rectangle et une classe représentant un diagramme,
c'est-à-dire plusieurs rectangle dans une même vue. Le premier package
global seg.gefForDummies contiendra l’éditeur dessinant le model (les
rectangles) et la classe de plug-in Eclipse. Donc en d’autre mot ce
package représente notre vue du model. Viens ensuite le package des
editParts. Dans ce package nous aurons toutes les classes permettant
d’interagir avec le model. Étant donné que nous ne voulons pas que la
vue (l’éditeur) change directement le modèle, nous avons besoin des
editParts qui agissent comme contrôleurs. Donc en gros les editParts
regarde les changement qui se produise dans le modèle et mettent à jour
la vue de l’éditeur et regarde ce que l’éditeur change dans le modèle et
mets a jour le modèle comme tel si j’ai bien compris.

# Création du modèle

Donc comme je le mentionnais plus tôt, nous avons seulement besoin d’un
rectangle dans notre modèle et d’une classe contenant plusieurs
rectangles, un diagramme. Ce diagramme représente en fait l’espace
éditable de notre éditeur en terme de modèle.

## ModelElement

Pour être plus structuré, nous allons faire une classe qui encapsulera
toutes les propriétés qu’un certain élément de notre modèle devrait
avoir dans un model pour GEF. Nous appellerons cette classe
ModelElement. Toutes les éléments de notre modèle doivent implémenter
l’interface IPropertySource qui est une interface pour tous les
éléments contenant des propriétés dans Eclipse. Donc quand vous allez
créer la classe ModelElement, ajoutez l’interface IPropertySource dans
le wizard. Également cette classe est une classe **abstraite**.

\<center\> %ATTACHURL%/image011.jpg \</center\>

\<div class=Comments\> Je ne pouvais pas effectuer cette étape car il ne
trouvait pas l'interface à utiliser IPropertySource dans le wizard. J'ai
fait right-click sur le projet (seg.gefForDummies) \> Properties \> Java
Build Path \> Libraries et j'ai ajouté (external jar)
org.eclipse.ui.views\_3.0.0\\views.jar. Tant qu'à être là, j'ai aussi
ajouté GEF et draw2d, me disant que ça allait me sauver du trouble plus
tard. Je ne sais pas si c'est ce qui était la bonne chose à faire.  
  
Plus tard, j'ai vu que j'avais un build problem à cause d'un duplicat de
gef.jar ... J'ai enlevé les trois références listées ici et ça a corrigé
le problème. Sérieusement, je pense qu'Eclipse devrait s'arrenger avec
ces affaires là lui même et il le fait, sauf pas au moment où on en a de
besoin. Ça revient au même problème que précédemment remarqué par moi,
Etienne et Daniel. -- Main.JasonKealey - 23 Jan 2005 \</div\>

\<div class=Comments\> J'ai réussi du premier coup... --
Main.JordanMcManus - 27 Jan 2005 \</div\>

Toutes les éléments doivent offrir la possibilité d’avertir des listener
qu’une certaine propriété a changé. Pour ce faire on doit inclure le
PropertyChangeSupport dans la classe ModelElement. Donc simplement
copier coller le code suivant dans votre classe.

## Code pour le PropertyChangeSupport

\<div class=Code\>

    /** Delegate used to implemenent property-change-support. */
    private transient PropertyChangeSupport pcsDelegate = new PropertyChangeSupport(this);
    
    public synchronized void addPropertyChangeListener(PropertyChangeListener l) {
       if (l == null) {
          throw new IllegalArgumentException();
       }
       pcsDelegate.addPropertyChangeListener(l);
    }
    
    protected void firePropertyChange(String property, Object oldValue, Object newValue) {
       if (pcsDelegate.hasListeners(property)) {
          pcsDelegate.firePropertyChange(property, oldValue, newValue);
       }
    }
    
    public synchronized void removePropertyChangeListener(PropertyChangeListener l) {
       if (l != null) {
          pcsDelegate.removePropertyChangeListener(l);
       }
    }

\</div\>

Un petit conseil quand vous copy/pastez du code dans Eclipse et que
plusieurs imports sont nécessaires pour que le code fonctionne, vous
pouvez faire organize imports (ctrl-shift-O) Cette fonctionnalité
cherche dans votre code et tente d’ajouter uniquement les imports que
vous avez besoin.

Pour l'instant on a pas vraiment besoin d'ajouter d'autre code dans
cette classe étant donné que nous allons faire une classe plus
spécifique pour des figure et nous implémenterons ces fonctions dans
cette sous-classe.

## Shape

Donc la prochaine étape est de faire une classe Shape qui descendra de
ModelElement. Cette classe représentera toutes les figures dans notre
modèle GEF.

Il faut inclure le code suivant pour que les sous-classes de Shape
puisse inclure un array qui contiendra les noms de toutes les propriétés
disponibles pour cet élément en particulier. Ce code défini des
constantes pour chacune des propriétés disponible pour une Shape. Ces
constantes seront utilisé ensuite pour savoir quelle propriété a changé
quand l’objet envoi un message qu’une propriété a changé. Le id de la
propriété est envoyé à chaque fois qu’on fait un message de ce genre
avec firePropertyChange. À remarquer aussi que IPropertyDescriptor est
un array static défini pour cet objet. L’array est initialisé également
dans une partie de code static{...}.

## Code pour initialiser les propriétés

\<div class=Code\>

    /** 
     * A static array of property descriptors.
     * There is one IPropertyDescriptor entry per editable property.
     * @see #getPropertyDescriptors()
     * @see #getPropertyValue(Object)
     * @see #setPropertyValue(Object, Object)
     */
    private static IPropertyDescriptor[] descriptors;
    /** ID for the Height property value (used for by the corresponding property descriptor). */
    private static final String HEIGHT_PROP = "Shape.Height";
    /** Property ID to use when the location of this shape is modified. */
    public static final String LOCATION_PROP = "Shape.Location";
    private static final long serialVersionUID = 1;
    /** Property ID to use then the size of this shape is modified. */
    public static final String SIZE_PROP = "Shape.Size";
    /** Property ID to use when the list of outgoing connections is modified. */
    public static final String SOURCE_CONNECTIONS_PROP = "Shape.SourceConn";
    /** Property ID to use when the list of incoming connections is modified. */
    public static final String TARGET_CONNECTIONS_PROP = "Shape.TargetConn";
    /** ID for the Width property value (used for by the corresponding property descriptor). */
    private static final String WIDTH_PROP = "Shape.Width";
    
    /** ID for the X property value (used for by the corresponding property descriptor).  */
    private static final String XPOS_PROP = "Shape.xPos";
    /** ID for the Y property value (used for by the corresponding property descriptor).  */
    private static final String YPOS_PROP = "Shape.yPos";
    
    /*
     * Initializes the property descriptors array.
     * @see #getPropertyDescriptors()
     * @see #getPropertyValue(Object)
     * @see #setPropertyValue(Object, Object)
     */
    static {
       descriptors = new IPropertyDescriptor[] { 
             new TextPropertyDescriptor(XPOS_PROP, "X"), // id and description pair
             new TextPropertyDescriptor(YPOS_PROP, "Y"),
             new TextPropertyDescriptor(WIDTH_PROP, "Width"),
             new TextPropertyDescriptor(HEIGHT_PROP, "Height"),
       };
       // use a custom cell editor validator for all four array entries
       for (int i = 0; i < descriptors.length; i++) {
          ((PropertyDescriptor) descriptors[i]).setValidator(new ICellEditorValidator() {
             public String isValid(Object value) {
                int intValue = -1;
                try {
                   intValue = Integer.parseInt((String) value);
                } catch (NumberFormatException exc) {
                   return "Not a number";
                }
                return (intValue >= 0) ? null : "Value must be >=  0";
             }
          });
       }
    } // static

\</div\>

Remplacer également la méthode incluse ci-dessous par la version de ce
document : \<div class=Code\>

    public IPropertyDescriptor[] getPropertyDescriptors() {
       return descriptors;
    }

\</div\> J’inclus cette fonction qui a rapport aux icônes car j’ai eu
des problème dans le passé quand je n’incluait pas le code qui as
rapport aux icônes. Donc vaut mieux l’inclure dans cette classe.

\<div class=Code\>

    protected static Image createImage(String name) {
          InputStream stream = GefForDummiesPlugin.class.getResourceAsStream(name);
          Image image = new Image(null, stream);
          try {
             stream.close();
          } catch (IOException ioe) {
          }
          return image;
       }
    /**
     * Return a pictogram (small icon) describing this model element.
     * Children should override this method and return an appropriate Image.
     * @return a 16x16 Image or null
     */
    public abstract Image getIcon();

\</div\>

Ensuite vient le temps de définir les propriétés d’une Shape. Une Shape
doit avoir une location x,y et également une hauteur et une largeur :

\<div class=Code\>

    /** Location of this shape. */
    private Point location = new Point(0, 0);
    /** Size of this shape. */
    private Dimension size = new Dimension(50, 50);

\</div\>

Après avoir inclus le code suivant, nous pouvons maintenant inclure les
get/set pour ces propriétés. Pour ce faire right-cliquez le nom de la
classe et allez dans le menu Source et choisissez l’option Generate
getter setters… Choissez location et size. Les méthodes get sont
correctes comme ça. Cependant nous devons changer les fonctions set pour
qu’il avertisse les classes qui écoutent pour des changements de
propriétés dans cette classe. Il y a également une méthod get et set
spéciale pour demander la valeur d’une propriété par le ID de cette
propriété qui sont défini.

\<div class=Comments\> Il y a une fonction set dans le bloc qui suit.
Erreur de copier-coller? -- Main.JasonKealey - 23 Jan 2005 \</div\>

## Get methods

\<div class=Code\>

``` 
   /**
    * @return Returns the location.
    */
   public Point getLocation() {
      return location;
   }
   /**
    * @param location The location to set.
    */
   public void setLocation(Point location) {
      this.location = location;
   }

/**
 * Return the property value for the given propertyId, or null.
 * <p>The property view uses the IDs from the IPropertyDescriptors array 
 * to obtain the value of the corresponding properties.</p>
 * @see #descriptors
 * @see #getPropertyDescriptors()
 */
public Object getPropertyValue(Object propertyId) {
   if (XPOS_PROP.equals(propertyId)) {
      return Integer.toString(location.x);
   }
   if (YPOS_PROP.equals(propertyId)) {
      return Integer.toString(location.y);
   }
   if (HEIGHT_PROP.equals(propertyId)) {
      return Integer.toString(size.height);
   }
   if (WIDTH_PROP.equals(propertyId)) {
      return Integer.toString(size.width);
   }
   return super.getPropertyValue(propertyId);
}
```

\</div\>

## Set methods

\<div class=Code\>

    public void setLocation(Point newLocation) {
       if (newLocation == null) {
          throw new IllegalArgumentException();
       }
       location.setLocation(newLocation);
       firePropertyChange(LOCATION_PROP, null, location);
    }
    
    public void setSize(Dimension newSize) {
       if (newSize != null) {
          size.setSize(newSize);
          firePropertyChange(SIZE_PROP, null, size);
       }
    }
    
    /**
     * Set the property value for the given property id.
     * If no matching id is found, the call is forwarded to the superclass.
     * <p>The property view uses the IDs from the IPropertyDescriptors array to set the values
     * of the corresponding properties.</p>
     * @see #descriptors
     * @see #getPropertyDescriptors()
     */
    public void setPropertyValue(Object propertyId, Object value) {
       if (XPOS_PROP.equals(propertyId)) {
          int x = Integer.parseInt((String) value);
          setLocation(new Point(x, location.y));
       }
       else if (YPOS_PROP.equals(propertyId)) {
          int y = Integer.parseInt((String) value);
          setLocation(new Point(location.x, y));
       }
       else if (HEIGHT_PROP.equals(propertyId)) {
          int height = Integer.parseInt((String) value);
          setSize(new Dimension(size.width, height));
       }
       else if (WIDTH_PROP.equals(propertyId)) {
          int width = Integer.parseInt((String) value);
          setSize(new Dimension(width, size.height));
       }
       else {
          super.setPropertyValue(propertyId, value);
       }
    }

\</div\>

On peut maintenant créer une nouvelle classe dans le package
seg.gefForDummies.model qui représentera le rectangle. Nous
l’appellerons RectangularShape (pour ne pas venir en conflit avec la
classe Rectangle de draw2d). Elle devra dériver Shape.

## Code pour la classe RectangularShape

\<div class=Code\>

    public class RectangularShape extends Shape {
       /** A 16x16 pictogram of a rectangular shape. */
       private static final Image RECTANGLE_ICON = createImage("icons/rectangle16.gif");
    
       private static final long serialVersionUID = 1;
    
       public Image getIcon() {
          return RECTANGLE_ICON;
       }
    
       public String toString() {
          return "Rectangle " + hashCode();
       }
    }

\</div\>

## Diagram

Cependant il nous reste maintenant à créer une classe qui représentera
le diagramme complet contenant un ou plusieurs rectangle. Donc encore
dans le package model, créer une classe s'appelant Diagram contenant le
code suivant:

\<div class=Code\>

    /** Property ID to use when a child is added to this diagram. */
       public static final String CHILD_ADDED_PROP = "ShapesDiagram.ChildAdded";
       /** Property ID to use when a child is removed from this diagram. */
       public static final String CHILD_REMOVED_PROP = "ShapesDiagram.ChildRemoved";
       private static final long serialVersionUID = 1;
       private Collection shapes = new Vector();
    
       /** 
        * Add a shape to this diagram.
        * @param s a non-null shape instance
        * @return true, if the shape was added, false otherwise
        */
       public boolean addChild(Shape s) {
          if (s != null && shapes.add(s)) {
             firePropertyChange(CHILD_ADDED_PROP, null, s);
             return true;
          }
          return false;
       }
    
       /** Return a List of Shapes in this diagram. */
       public List getChildren() {
          return new Vector(shapes);
       }
    
       /**
        * Remove a shape from this diagram.
        * @param s a non-null shape instance;
        * @return true, if the shape was removed, false otherwise
        */
       public boolean removeChild(Shape s) {
          if (s != null && shapes.remove(s)) {
             firePropertyChange(CHILD_REMOVED_PROP, null, s);
             return true;
          }
          return false;
       }

\</div\>

Ce code permet simplement d'ajouter et d'enlever des figure à notre
diagramme.

# Création des edits parts

Nous sommes maintenant rendu à faire les edit parts. C’est en fait la
partie centrale de notre petit projet. Ce sont eux qui communiquent
entre le modèle et les figures qui sont affiché dans l’éditeur que nous
implémenterons plus tard. En règle général nous devons avoir un edit
part par chose éditable dans notre diagramme. Donc dans notre cas nous
avons besoin d’un edit part seulement pour notre rectangle.

Créez une nouvelle classe dans le package editParts appelée
RectangleEditPart. Cette classe doit dériver AbstractGraphicalEditPart
et doit implémenter PropertyChangeListener. Ensuite aller dans le menu
contextuel source et dans overwrite/implement methods. Choisissez
d’implémenter les fonctions suivantes : activate, deactivate,
refreshVisuals. Les fonctions activate et deactivate sont appelés lors
de la création du edit part et servent à s’attacher et se détacher comme
écouteur de changements de propriétés (PropertyChangeListener). Voici ce
que vous devriez ajouter pour activate() et deactivate():

\<div class=Code\>

    /* (non-Javadoc)
        * @see org.eclipse.gef.EditPart#activate()
        */
       public void activate() {
          if(!isActive()) {
             super.activate();
             ((Shape)this.getModel()).addPropertyChangeListener(this);
          }
       }
       /* (non-Javadoc)
        * @see org.eclipse.gef.EditPart#deactivate()
        */
       public void deactivate() {
          if(isActive()){
             super.deactivate();
             ((Shape)getModel()).removePropertyChangeListener(this);
          }
       }

\</div\>

Ensuite nous voulons avoir un moyen tout dépendant si le modèle change
de pouvoir rafraîchir le modèle avec une certaine fonction. La fonction
qui sait quand le modèle change est la fonction propertyChange qui est
appelé lorsqu'une propriété du modèle change et qui rafraichi la vue.
J'ai également inclus une petite fonction getCastedModel() qui fait
simplement retourner le modèle casté en Shape:

\<div class=Code\>

    // Simply cast the model with the right class.
       private Shape getCastedModel() {
          return (Shape) getModel();
       }
    
    /* (non-Javadoc)
        * @see java.beans.PropertyChangeListener#propertyChange(java.beans.PropertyChangeEvent)
        */
       public void propertyChange(PropertyChangeEvent arg0) {
          String prop = arg0.getPropertyName();
          if (Shape.SIZE_PROP.equals(prop) || Shape.LOCATION_PROP.equals(prop)) {
             refreshVisuals();
          }
       }
    
    /* (non-Javadoc)
        * @see org.eclipse.gef.editparts.AbstractEditPart#refreshVisuals()
        */
       protected void refreshVisuals() {
    //       transfer the size and location from the model instance to the corresponding figure
          Rectangle bounds = new Rectangle(getCastedModel().getLocation(),
                getCastedModel().getSize());
          figure.setBounds(bounds);
          // notify parent container of changed position & location
          // if this line is removed, the XYLayoutManager used by the parent container 
          // (the Figure of the ShapesDiagramEditPart), will not know the bounds of this figure
          // and will not draw it correctly.
          ((GraphicalEditPart) getParent()).setLayoutConstraint(this, figure, bounds);
       }

\</div\>

Ensuite une fonction pour créer une nouvelle figure. Dans notre cas nous
nous occuperons seulement des rectangle. Donc en temps normal, si on
aurait une classe d'edit part qui s'occuperait de n'importe quelle
figure, on pourrait regarder quel est le modèle de ce edit part de
figure et on retournerait une figure appropriée tout dépendant du
modèle:

\<div class=Code\>

    protected IFigure createFigure() {
       IFigure f; 
       if (getModel() instanceof RectangularShape) {
          f = new RectangleFigure();
       } 
       else {
          // if Shapes gets extended the conditions above must be updated
          throw new IllegalArgumentException();
       }
       f.setOpaque(true); // non-transparent figure
       f.setBackgroundColor(ColorConstants.darkGray);
       return f;
    }

\</div\>

## DiagramEditPart

Maintenant, tout comme le rectangle, nous avons besoin d'un edit part
pour notre diagramme. Cet edit part est un peu plus compliqué et
contient des edit policies spéciales. Nous devrons également faire une
inner classe dans cette classe pour représenter un XYLayout plus
particulier qui overwrite certaines méthodes pour provoquer certaines
commandes spécifiques pour nous. J'expliquerai ça plus en détails rendu
à ce point.

### Activate/Deactivate, createFigure, propertyChange

\<div class=Code\>

``` 
   public void activate() {
      if (!isActive()) {
         super.activate();
         ((ModelElement) getModel()).addPropertyChangeListener(this);
      }
   }
   
   public void deactivate() {
      if (isActive()) {
         super.deactivate();
         ((ModelElement) getModel()).removePropertyChangeListener(this);
      }
   }

   protected IFigure createFigure() {
      Figure f = new Figure();
      f.setLayoutManager(new FreeformLayout());
      return f;
   }
   private Diagram getCastedModel() {
      return (Diagram) getModel();
   }
   
   protected List getModelChildren() {
      return getCastedModel().getChildren(); // return a list of shapes
   }

   /* (non-Javadoc)
    * @see java.beans.PropertyChangeListener#propertyChange(java.beans.PropertyChangeEvent)
    */
   public void propertyChange(PropertyChangeEvent evt) {
      String prop = evt.getPropertyName();
      // these properties are fired when Shapes are added into or removed from 
      // the ShapeDiagram instance and must cause a call of refreshChildren()
      // to update the diagram's contents.
      if (Diagram.CHILD_ADDED_PROP.equals(prop)
         || Diagram.CHILD_REMOVED_PROP.equals(prop)) {
         refreshChildren();
      }
   }
```

\</div\>

### Create edit policies

Cette fonction viens créer des règles d'édition pour le diagramme comme
tel. Première policy pour empêcher le diagramme d'être deleter, ensuite
un XYLayout que nous définierons comme inner class de DiagramEditPart
qui permettra de bouger le rectangle comme on veut avec des commandes
que nous définierons plus tard. Et ensuite la dernière policy empêche de
sélectionner le background de notre éditeur.

\<div class=Code\>

    /* (non-Javadoc)
        * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
        */
       protected void createEditPolicies() {
    //       disallows the removal of this edit part from its parent
          installEditPolicy(EditPolicy.COMPONENT_ROLE, new RootComponentEditPolicy());
          // handles constraint changes (e.g. moving and/or resizing) of model elements
          // and creation of new model elements
          XYLayout layout = (XYLayout) getContentPane().getLayoutManager();
          installEditPolicy(EditPolicy.LAYOUT_ROLE,  new ShapesXYLayoutEditPolicy(layout));
          // disable selection feedback for this edit part
          installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, null);
       }

\</div\>

\<div class="Comments"\> A noter: ShapesXYLayoutEditPolicy ne
fonctionnera pas, c'est à définir ensuite :) \</div\>

## ShapesXYLayoutEditPolicy

Nous devons donc définir une inner classe qui viendra définir notre
XYLayout qui lance une commande lorsqu'on bouge un élément. Pour ce
faire, simplement ajouter le code suivant dans votre classe
DiagramEditPart. Il n'y a qu'une seule fonction que nous allons utiliser
et qui vaut la peine d'être expliquer. Les autres doivent seulement être
définies mais ne seront pas utilisés. La fonction
createChangeConstraintCommand est appelée lorsqu'on bouge un élément.
Elle retourne une commande ShapeSetConstraintCommand capable de
s'occuper de bouger et de changer la grandeur du rectangle.

\<div class=Code\>

    private class ShapesXYLayoutEditPolicy extends XYLayoutEditPolicy {
          /** 
           * Create a new instance of this edit policy.
           * @param layout a non-null XYLayout instance. This should be the layout of the editpart's 
           *              figure where this instance is installed.
           * @throws IllegalArgumentException if layout is null 
           * @see DiagramEditPart#createEditPolicies()
           */
          ShapesXYLayoutEditPolicy(XYLayout layout) {
             if (layout == null) {
                throw new IllegalArgumentException();
             }
             setXyLayout(layout);
          }
    
          protected Command createChangeConstraintCommand(ChangeBoundsRequest request,
                EditPart child, Object constraint) {
             if (child instanceof RectangleEditPart && constraint instanceof Rectangle) {
                // return a command that can move and/or resize a Shape
                return new ShapeSetConstraintCommand(
                      (Shape) child.getModel(), request, (Rectangle) constraint);
             }
             return super.createChangeConstraintCommand(request, child, constraint);
          }
    
          protected Command getCreateCommand(CreateRequest request) {
             // Not used
             return null;
          }
    
          protected Command getDeleteDependantCommand(Request request) {
             // Not used
             return null;
          }
    
          protected Command createChangeConstraintCommand(EditPart child, Object constraint) {
             // Not used
             return null;
          }
     
          protected Command createAddCommand(EditPart child, Object constraint) {
             // Not used
             return null;
          }
       }

\</div\>

## ShapeSetConstraintCommand

Nous avons maintenant besoin de la commande qui s'occupera de bouger
notre figure dans l'éditeur. Pour ce faire nous créerons la classe
ShapeSetConstraintCommand dans le package
seg.gefForDummies.model.commands.

\<div class=Comments\> ShapeSetConstraintCommand doit hériter de la
classe org.eclipse.gef.commands.Command -- Main.JordanMcManus - 27 Jan
2005 \</div\>

### Propriétés à ajouter et le constructeur

\<div class=Code\>

``` 
   /** Stores the new size and location. */
   private final Rectangle newBounds;
   /** Stores the old size and location. */
   private Rectangle oldBounds;
   /** A request to move/resize an edit part. */
   private final ChangeBoundsRequest request;
   /** Shape to manipulate. */
   private final Shape shape;

public ShapeSetConstraintCommand(Shape shape, ChangeBoundsRequest req, 
         Rectangle newBounds) {
      if (shape == null || req == null || newBounds == null) {
         throw new IllegalArgumentException();
      }
      this.shape = shape;
      this.request = req;
      this.newBounds = newBounds.getCopy();
      setLabel("move / resize");
   }
```

\</div\>

Donc ensuite nous devons définir plusieurs fonction pour qu'une commande
puisse s'exécuter. Premièrement nous devons inclure la fonction
canExecute qui doit simplement retourner true si cette commande peut
être exécuter. Donc dans notre cas on fait simplement regarder si le
type de la requête demandé est supporté par notre commande et retourner
la réponse. Ensuite nous avons la méthode execute qui execute le travail
que doit faire la commande seulement si canExecute est vraie. Redo et
undo font le contraire l'un de l'autre comme on est habitué avec ctrl-z
et ctrl-y.

### Fonctions nécéssaires de la commande

\<div class=Code\>

    /* (non-Javadoc)
        * @see org.eclipse.gef.commands.Command#canExecute()
        */
       public boolean canExecute() {
          Object type = request.getType();
          // make sure the Request is of a type we support:
          return (RequestConstants.REQ_MOVE.equals(type)
                || RequestConstants.REQ_MOVE_CHILDREN.equals(type) 
                || RequestConstants.REQ_RESIZE.equals(type)
                || RequestConstants.REQ_RESIZE_CHILDREN.equals(type));
       }
       /* (non-Javadoc)
        * @see org.eclipse.gef.commands.Command#execute()
        */
       public void execute() {
          oldBounds = new Rectangle(shape.getLocation(), shape.getSize());
          redo();
       }
       /* (non-Javadoc)
        * @see org.eclipse.gef.commands.Command#redo()
        */
       public void redo() {
          shape.setSize(newBounds.getSize());
          shape.setLocation(newBounds.getLocation());
       }
       /* (non-Javadoc)
        * @see org.eclipse.gef.commands.Command#undo()
        */
       public void undo() {
          shape.setSize(oldBounds.getSize());
          shape.setLocation(oldBounds.getLocation());
       }

\</div\>

## EditPartFactory

Maintenant il reste une dernière partie pour les edit parts avant
d'arriver à l'éditeur en temps que tel. Maintenant nous devons fournoir
une classe qui agiera comme une factory pour savoir qu'elle classe
fournir lorsqu'on bâti le modèle dans l'éditeur. Dans notre cas notre
modèle est simple, mais il le deviendra beaucoup plus complexe. Donc
créez une classe RectEditPartFactory dans le package editParts qui
implémente l'interface EditPartFactory. Vous aurez seulement une
fonction a faire qui est createEditPart. Cette fonction fourni le bon
edit part pour une certaine partie du modèle. Il est intéressant de
noter aussi que c'est là que le modèle se fait assigner à son edit part.
Comme j'ai pu le constater en débuggant pendant 1h, si le modèle n'est
pas assigné correctement au edit part, eclipse n'aime pas ça ;).

\<div class=Code\>

    public EditPart createEditPart(EditPart context, Object modelElement) {
          EditPart part;
          
          if (modelElement instanceof Diagram) {
             part =  new DiagramEditPart();
          }
          else if (modelElement instanceof RectangularShape) {
             part = new RectangleEditPart();
          }
          else
             throw new RuntimeException("Can't create part for model element: "
          + ((modelElement != null) ? modelElement.getClass().getName() : "null"));
          
          // store model element in EditPart
          part.setModel(modelElement);
          return part;
       }

\</div\>

# L'éditeur

Pour l'éditeur, nous devons faire une classe RectangleEditor qui
dérivera de GraphicalEditor. Cette classe sera notre vue principale où
le modèle sera affiché. Premièrement l'éditeur doit avoir une référence
vers la racine du modèle. Cependant, l'éditeur ne doit PAS changer le
modèle directement étant donné que c'est le travail des edit parts.

### Propriétés et constructeur

\<div class=Code\>

    /** This is the root of the editor's model. */
       private Diagram diagram = new Diagram();
       
       /** KeyHandler with common bindings for both the Outline View and the Editor. */
       private KeyHandler sharedKeyHandler;
    
       /** Create a new ShapesEditor instance. This is called by the Workspace. */
       public RectangleEditor() {
          setEditDomain(new DefaultEditDomain(this));
       }

\</div\> \<div class=Comments\> commentez la ligne avec KeyHandler
\</div\> Ensuite la fonction suivante viens configurer la vue en
ajustant plusieurs paramètres. Premièrement on ajuste l'édit part root.
On utilise la classe ScalableRootEditPart. Voici la description de cette
classe prise dans la documentation de GEF: "A graphical root composed of
regular Layers. The layers are added to LayeredPane or
ScalableLayeredPane. All layers are positioned by StackLayouts, which
means that the diagrams preferred size is the union of the preferred
size of each layer, and all layers will be positioned to fill the entire
diagram.". Donc en d'autres mots, c'est simplement le viewport principal
de notre éditeur. Ensuite on dit à notre éditeur qu'elle classe de edit
part factory nous voulons utiliser pour que notre modèle utilisent les
edit parts qu'il leur sont destinés.

### configureGraphicalViewer()

\<div class=Code\>

    /**
        * Configure the graphical viewer before it receives contents.
        * <p>This is the place to choose an appropriate RootEditPart and EditPartFactory
        * for your editor. The RootEditPart determines the behavior of the editor's "work-area".
        * For example, GEF includes zoomable and scrollable root edit parts. The EditPartFactory
        * maps model elements to edit parts (controllers).</p>
        * @see org.eclipse.gef.ui.parts.GraphicalEditor#configureGraphicalViewer()
        */
       protected void configureGraphicalViewer() {
          super.configureGraphicalViewer();
          
          GraphicalViewer viewer = getGraphicalViewer();
          viewer.setRootEditPart(new ScalableRootEditPart());
          viewer.setEditPartFactory(new RectEditPartFactory());
          viewer.setKeyHandler(
                new GraphicalViewerKeyHandler(viewer).setParent(getCommonKeyHandler()));
       }

\</div\> \<div class=Comments\> commentez la ligne avec KeyHandler
\</div\>

Ensuite viennent plusieurs fonction que nous ne voulons pas implémenter
pour la simplicité de l'example mais que nous devons ajouter quand même.
Une seule est digne d'explication pour l'instant et c'est getAdapter().
getAdapter sert simplement à retourner une référence vers une classe
définie par notre plug-in pour certaines view standard de eclipse. Par
exemple eclipse pourrait appeler cette fonction en demander une
référence vers une page de outline définir pour notre modèle. Mais
pour la simplicité du tout, nous allons ommetre cette fonctionnalité.

\<div class=Code\>

    /* (non-Javadoc)
        * @see org.eclipse.ui.ISaveablePart#doSave(org.eclipse.core.runtime.IProgressMonitor)
        */
       public void doSave(IProgressMonitor monitor) {
          
       }
    
       /* (non-Javadoc)
        * @see org.eclipse.ui.ISaveablePart#doSaveAs()
        */
       public void doSaveAs() {
          
       }
       public boolean isDirty() {
          return getCommandStack().isDirty();
       }
    
       /* (non-Javadoc)
        * @see org.eclipse.ui.ISaveablePart#isSaveAsAllowed()
        */
       public boolean isSaveAsAllowed() {
          return true;
       }
    
       /* (non-Javadoc)
        * @see org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette#getAdapter(java.lang.Class)
        */
       public Object getAdapter(Class type) {
          return super.getAdapter(type);
       }

\</div\>

Cette classe doit overwriter la fonction getModel pour retourner notre
référence vers notre diagram lorsqu'on lui demande quel est son modèle.
Ensuite la fonction initializeGraphicalViewer initialise le tout en
mettant simplement le contenu dans l'éditeur.

\<div class=Code\>

    private Diagram getModel() {
          return diagram;
       }
       /**
        * Set up the editor's inital content (after creation).
        */
       protected void initializeGraphicalViewer() {
          GraphicalViewer graphicalViewer = getGraphicalViewer();
          graphicalViewer.setContents(getModel()); // set the contents of this editor
       }

\</div\>

Finalement, la dernière méthode mais non la moindre, est setInput et
fait simplement ajouter du contenu dans notre modèle. Ici je fait
simplement ajouter un rectangle qui sera positionné par défault.

\<div class=Code\>

    protected void setInput(IEditorInput input) {
          super.setInput(input);
          
          diagram.addChild(new RectangularShape());
          setPartName("Test");
       }

\</div\>

# L'étape finale

Pour terminer et faire fonctionner notre éditeur, nous devons changer
notre plugin.xml. Aller dans :

%ATTACHURL%/image013.jpg

Ensuite il faut ajouter un nouvel éditeur avec le bouton add et choisir
dans la liste org.eclipse.ui.editors. Ensuite créez un nouvel éditeur:

%ATTACHURL%/image014.jpg

Ensuite vous voulez remplir les propriétés de l'éditeur comme suis et
vous êtes maintenant prêt à faire rouler l'éditeur avec le bouton run
d'éclipse.

%ATTACHURL%/image015.jpg

Mais je considère que vous êtes capable de faire un RUN, je suis pu
capable d'éditer ce maudit document ;). Vous avez simplement a ouvrir
n'importe quel fichier .ucm qui est dans un projet et le tour est joué\!

\-- Main.EtienneTremblay - 21 Jan 2005

\<div class=Comments\> Suggestions? J'ai plein d'exceptions différentes
mais toujours sur la même ligne.

    java.lang.ExceptionInInitializerError
    at seg.gefForDummies.RectangleEditor.setInput(RectangleEditor.java:99)
    at org.eclipse.gef.ui.parts.GraphicalEditor.init(GraphicalEditor.java:292)
    at org.eclipse.ui.internal.EditorManager.createSite(EditorManager.java:718)
    at org.eclipse.ui.internal.EditorManager.openInternalEditor(EditorManager.java:777)
    at org.eclipse.ui.internal.EditorManager.openEditorFromDescriptor(EditorManager.java:582)
    at org.eclipse.ui.internal.EditorManager.openEditor(EditorManager.java:570)
    at org.eclipse.ui.internal.WorkbenchPage.busyOpenEditorBatched(WorkbenchPage.java:2244)
    at org.eclipse.ui.internal.WorkbenchPage.busyOpenEditor(WorkbenchPage.java:2177)
    at org.eclipse.ui.internal.WorkbenchPage.access$6(WorkbenchPage.java:2169)
    at org.eclipse.ui.internal.WorkbenchPage$9.run(WorkbenchPage.java:2156)
    at org.eclipse.swt.custom.BusyIndicator.showWhile(BusyIndicator.java:69)
    at org.eclipse.ui.internal.WorkbenchPage.openEditor(WorkbenchPage.java:2151)
    at org.eclipse.ui.ide.IDE.openEditor(IDE.java:299)
    at org.eclipse.ui.actions.OpenFileAction.openFile(OpenFileAction.java:96)
    at org.eclipse.ui.actions.OpenSystemEditorAction.run(OpenSystemEditorAction.java:94)
    at org.eclipse.ui.views.navigator.OpenActionGroup.runDefaultAction(OpenActionGroup.java:111)
    at org.eclipse.ui.views.navigator.MainActionGroup.runDefaultAction(MainActionGroup.java:293)
    at org.eclipse.ui.views.navigator.ResourceNavigator.handleOpen(ResourceNavigator.java:624)
    at org.eclipse.ui.views.navigator.ResourceNavigator$6.open(ResourceNavigator.java:388)
    at org.eclipse.jface.viewers.StructuredViewer$2.run(StructuredViewer.java:429)
    at org.eclipse.core.internal.runtime.InternalPlatform.run(InternalPlatform.java:616)
    at org.eclipse.core.runtime.Platform.run(Platform.java:747)
    at org.eclipse.jface.viewers.StructuredViewer.fireOpen(StructuredViewer.java:427)
    at org.eclipse.jface.viewers.StructuredViewer.handleOpen(StructuredViewer.java:635)
    at org.eclipse.jface.viewers.StructuredViewer$6.handleOpen(StructuredViewer.java:731)
    at org.eclipse.jface.util.OpenStrategy.fireOpenEvent(OpenStrategy.java:211)
    at org.eclipse.jface.util.OpenStrategy.access$2(OpenStrategy.java:206)
    at org.eclipse.jface.util.OpenStrategy$1.handleEvent(OpenStrategy.java:238)
    at org.eclipse.swt.widgets.EventTable.sendEvent(EventTable.java:82)
    at org.eclipse.swt.widgets.Widget.sendEvent(Widget.java:796)
    at org.eclipse.swt.widgets.Display.runDeferredEvents(Display.java:2772)
    at org.eclipse.swt.widgets.Display.readAndDispatch(Display.java:2431)
    at org.eclipse.ui.internal.Workbench.runEventLoop(Workbench.java:1377)
    at org.eclipse.ui.internal.Workbench.runUI(Workbench.java:1348)
    at org.eclipse.ui.internal.Workbench.createAndRunWorkbench(Workbench.java:254)
    at org.eclipse.ui.PlatformUI.createAndRunWorkbench(PlatformUI.java:141)
    at org.eclipse.ui.internal.ide.IDEApplication.run(IDEApplication.java:96)
    at org.eclipse.core.internal.runtime.PlatformActivator$1.run(PlatformActivator.java:335)
    at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:273)
    at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:129)
    at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
    at java.lang.reflect.Method.invoke(Unknown Source)
    at org.eclipse.core.launcher.Main.basicRun(Main.java:185)
    at org.eclipse.core.launcher.Main.run(Main.java:704)
    at org.eclipse.core.launcher.Main.main(Main.java:688)
    Caused by: java.lang.IllegalArgumentException: Argument cannot be null
    at org.eclipse.swt.SWT.error(SWT.java:2677)
    at org.eclipse.swt.SWT.error(SWT.java:2616)
    at org.eclipse.swt.SWT.error(SWT.java:2587)
    at org.eclipse.swt.graphics.ImageLoader.load(ImageLoader.java:122)
    at org.eclipse.swt.graphics.ImageData.<init>(ImageData.java:308)
    at org.eclipse.swt.graphics.Image.<init>(Image.java:668)
    at seg.gefForDummies.model.Shape.createImage(Shape.java:116)
    at seg.gefForDummies.model.RectangularShape.<clinit>(RectangularShape.java:20)
    ... 47 more

Finalement, j'ai copié indivuellement chaque fichier du projet d'Etienne
vers le mien, reparti, rien a changé. Quand j'avais tous les fichiers,
ça a fonctionné. J'ai donc remis ma vieille version (j'avais sauvé un
zip) pour tous les fichiers pour tester et là ça me niaisait avec un je
ne peux pas effacer bin/seg. J'ai trouvé Project \> Clean \> Clean all
projects. J'ai refait ça et boom, tout fonctionne dans ma version.
Weird?? Présage du futur? \</div\>
