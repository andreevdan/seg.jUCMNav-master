# Fact that others should know when they develop in Eclipse/GEF/EMF.

  - EditParts are thrown out as soon as the user removes the
    corresponding model object. **If the user undoes a delete, it is a
    different EditPart that is recreated** to represent the restored
    object. **This is why EditParts cannot contain long-term
    information, and should not be referenced by commands.**
  - Everything the user can do is done with Commands.
  - If someone could explain clearly what are edit policies in GEF,
    replace it here...
  - An EditPolicy defines what can be done with an EditPart. EditParts
    without EditPolicies will do nothing. They won’t even be selectable.
    EditPolicies are also responsible for feedback management (for
    example, what should be shown when an EditPart is moved or resized)
    and they are allowed to delegate work (forward requests) to other
    EditParts (for example, children).\<br/\>\<br/\>EditPolicies are
    categorized into roles (see constants in interface
    org.eclipse.gef.EditPolicy) and EditParts are limited to have only
    one EditPolicy per role.\<br/\>\<br/\>For more information on roles,
    consult the \<a
    href="<http://www.redbooks.ibm.com/redbooks/pdfs/sg246302.pdf>"\>Eclipse
    Development using the Graphical Editing Framework and the Eclipse
    Modeling Framework\</a\> red book at chapter 3.3.4.
  - From Chapter 5:\<br/\>\<br/\>As GEF is based on an MVC architecture,
    every GEF-based application uses a model to represent the state of
    the diagrams being created and edited. GEF allows you to use any
    objects as model objects within your application, however, using an
    EMF model provides some advantages over using arbitrary
    objects:\<br/\>\<br/\>You can use EMF’s code generation facilities
    to produce consistent, efficient and easily customizable
    implementations of your model objects. If your model evolves during
    development, you can regenerate the code to reflect changes to the
    model, while preserving your customizations.\<br/\>\<br/\>The MVC
    architecture used by GEF relies on controllers that listen for model
    changes and update the view in response. If you use an EMF model,
    notification of model change is already in place, as all EMF model
    objects notify change via EMF’s notification
    framework.\<br/\>\<br/\>The implementations generated for your model
    objects ensure that the model remains consistent, for example, when
    a reference is updated, the opposite reference is also
    updated.\<br/\>\<br/\>EMF provides support for persisting model
    instances, and the serialization format is easily
    customizable.\<br/\>\<br/\>Your applications can use the reflective
    API provided by EMF to work with any EMF model generically.

\-- Main.JordanMcManus - 19 Jan 2005

  - Tip: If you are using the model to drive code generation, we suggest
    that you follow Java conventions for naming model elements:
      - Heed Java case conventions:
        1.  **Use lower case for package names.**
        2.  Use lower case for the initial letter of feature and
            operation names.
        3.  Begin class names with an upper case letter.
      - Use the plural form for names of multi-valued features and the
        singular form for single-valued features.

### EMF Persistence

  - The EMF model can be persisted to disk using XMI (XML Metadata
    Interchange)
  - An instance of an EMF model can also be persisted using XMI.
  - All the plumbing is already in place to take an instance of an EMF
    model and save it.
  - You can rewrite methods for serializing/deserializing to another
    format. For example, XML with a particular DTD is an example.
  - There are java packages to simplify the parsing and creation of XML
    files.
  - We could read an UCM v0.23 XML file, dynamically build an EMF model,
    hook up the model with the appropriate edit parts and we would be
    ready to save in the new format. \* this will probably not be a
    trivial task.
  - XMI is much more powerful than what we would have coded from
    scratch. Model elements are associated to at most one resource set.
    If an element in a resource set references an element in another,
    they will still be able to be saved / reloaded properly. An element
    can be moved from one resource set to another extremely easily.

\-- Main.JasonKealey - 31 Jan 2005

### GEF + EMF class descriptions

(crap je l'ai fait en français... Je traduirais au courant de la
semaine)

  - La première chose à comprendre, c’est qu’une structure lightweight
    est employée (Encapsulation dans un seul heavy weight object). Donc,
    lorsqu’on lit du code source on ne voit qu’une façade light weight
    d’un objet beaucoup plus complexe.\<br/\>\<br/\>Il faut absolument
    pas oublier ce fait. Par exemple (Network) : un objet d’un modèle
    EMF implémente l’interface Notifer, le editPart regarde cet objet
    comme un Notifier, car il doit être avisé des changements dans le
    modèle. De plus, l’edit part utilise cet objet comme modèle. Ceci
    dit, on peut apprécier comment GEF et EMF gonfle artificiellement le
    code source. Dans une même classe on peut avoir plusieurs références
    au même objet mais qui donnent l’illusion qu’on travail avec
    plusieurs objets.\<br/\>\<br/\>Une grande partie de l’implementation
    d’un editeur GEF/EMF c’est de correctement lié les diverses façades
    entre-elles (Beaucoup de set\*(), de get\*(), de add\*(),
    etc.).\<br/\>\<br/\>Ce que je propose ici, c’est de dresser une
    liste des classes utilisées dans l’éditeur de Network et de les
    décrire (en essayant le plus possible d’expliquer leur rôle
    éventuel dans jUCMnav). Ceci est un processus très long, car pour
    bien comprendre une classe il faut aller voir toutes ces
    incarnations possibles dans sa hiérarchie (et possiblement
    cross-hiérarchies lorsqu’il s’agit d’une façade light weight).
    J’estime que ça prend 1/4 à 2 heures par classe dépendemment de sa
    complexité.\<br/\>\<br/\>Par contre, je ne crois pas que c’est la
    meilleur façon de présenté cette information. La liste va grandir
    très rapidement et elle va devenir inutile. Avant de commencé on
    devra déterminé une façon optimale de présenter l’information pour
    qu’on puisse l’accéder en O(1 ou, au minimum log n) \[n étant le
    nombre total de classes décrites\] tout au long du projet.

actions :

  - ActionBarContributor

commands :

  - Command

edit:

  - EditPartFactory

<!-- end list -->

  - AbstractConnectionEditPart

<!-- end list -->

  - ConnectionEditPolicy

<!-- end list -->

  - ConnectionEndpointEditPolicy

<!-- end list -->

  - SelectionHandlesEditPolicy

<!-- end list -->

  - NetworkEditPart extends AbstractGraphicalEditPart implements Adapter

import java.util.List;

Utilisé par la méthode getModelChildren() pour retourner la listes des
children du model

import org.eclipse.draw2d.FreeformLayer; import
org.eclipse.draw2d.FreeformLayout; import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;

Utilisé par la méthode createFigure() qui est appelé pour créer la
figure du EditPart. Voir chapitre 3.2.3 du redbook pour une bonne
explication sur les figures.

import org.eclipse.emf.common.notify.Adapter; import
org.eclipse.emf.common.notify.Notification; import
org.eclipse.emf.common.notify.Notifier;

Il est important de noter que la classe NetworkEditPart implemente
l’interface Adapter (A receiver of notifications). Lorsque l’editpart
sera activé, il doit être ajouté (en temps qu’Adapter et non en temps
qu’EditPart) à la liste des Adapter de son élément correspondant dans
le modèle (Network) afin d’être tenu au courant des changements qui ont
lieu dans le modèle. Les méthodes activate() et deactivate() s’occupe de
connecter l’Adapter (le edit part) au Network ex. :
((Notifier)getNetwork()).eAdapters().add(this);

La classe possède une référence vers le Notifier, mais je n’ai pas
trouvé qui (quelle classe) initialise cette référence TO DO ni pourquoi
elle possède cette référence. Pourquoi est-ce qu’on a besoin d’un
Notifier si on est inscrit à la liste des Adapteurs du modèle ?

import org.eclipse.gef.EditPolicy;

Les edit policies qui sont liées de cette façon :
installEditPolicy(ROLE, OBJECT); //template
installEditPolicy(EditPolicy.LAYOUT\_ROLE, new
NetworkXYLayoutEditPolicy());

L’interface EditPolicy défini une liste des différents rôles.

Voir chapitre 3.3.4 du redbook pour une bonne explication sur chacun des
rôles.

import org.eclipse.gef.editparts.AbstractGraphicalEditPart; import
org.eclipse.gef.editpolicies.RootComponentEditPolicy;

import org.eclipse.ui.views.properties.IPropertySource;

import com.ibm.itso.sal330r.network.Network;

Le modèle auquel le editpart est associé. La connection est spécifié
dans le constructeur à l’aide d’un setModel(network) où network est
passé en paramètre dans le constructeur.

import com.ibm.itso.sal330r.network.model.EObjectPropertySource;

  - Adapter

<!-- end list -->

  - ContainerEditPolicy

<!-- end list -->

  - GraphicalNodeEditPolicy

<!-- end list -->

  - XYLayoutEditPolicy

editor :

  - EditorPart

<!-- end list -->

  - CommandStack

<!-- end list -->

  - CommandStackListener

<!-- end list -->

  - ZoomManager

<!-- end list -->

  - ZoomListener

<!-- end list -->

  - MultiPageEditorPart

<!-- end list -->

  - IAdaptable

<!-- end list -->

  - AbstractEditorPage

<!-- end list -->

  - PaletteRoot

figures :

  - Ellipse

model :

  - PropertyDescriptor

<!-- end list -->

  - IPropertySource

<!-- end list -->

  - CreationFactory

\-- Main.JordanMcManus - 31 Jan 2005
