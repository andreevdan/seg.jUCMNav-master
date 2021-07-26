# Meeting 2004-12-14

### Outil Actuel

  - Notation graphique de UCM via UCMNav. En évolution, on rajoute de la
    fonctionnalité peu à peu..
  - Impossible d'ajouter qqch à ce point, très peu documenté, difficile
    à miantenir. L'architecture a disparu :)
  - Recommençons à zero... Nouvel outil d'UCM.
  - Note projet n'inclut pas la réécriture totale ne 8 mois de UCMNav :)
  - On veut une meilleure architecture.
  - UCMNav est disponible, bien sûr, avec source.
      - C++
      - Routines en lexx, bison, C
  - Utilise Xforms pour le GUI. Utilisé pour la gestion d'événements,
    les aspects dessins sont faits directement en C\!

Problèmes:

  - Difficultés de déploiement, car nécessite un serveur X.
  - Outil original développé sous HP-UX. Fut ensuite peaufiné pour une
    thèse de maîtrise, sous SUN OS.

Maintenant:

  - Porté éventuellement sous Windows / Cygwin
  - Nettoyé un peu avec le temps, projet de nettoyage l'an dernier pour
    inclusion dans SUSE.
  - Dût donc éliminer les warnings C++, etc.
  - Environ 75kloc C++, ainsi que environ 25kloc de code GUI.
  - Classes surchargées, documentation technique n'est pas à jour

Amyot tentera de mettre à jour le manuel / documentation pendant le
temps des fêtes. Résultats d'une étude de reverse-engineering sont
disponibles également.

Le but n'était pas d'avoir un outil commercial, mais un outil
universitaire alors l'interface n'est pas très conviviale.

### Nouvel outil

Fonctionnalité \* Le format de fichiers a un DTD, etc, (XML). Nous
voulons conserver l'idée d'avoir un format de fichiers analysable par
outils automatisés. \* On veut aussi exporter des informations,
présentement à l'aide d'une couche intermédiaire qui supporte l'export
en EPS, SVG, etc. C'était facile d'ajouter des filtres supplémentaires.
\* L'outil fait aussi de la génération de documentation et crée des
fichiers PDF. \* L'outil comporte des fonctionnalités d'analyse det
d'exécuter le modèle, création de scénarios. Permet d'afficher des
scénarios. Affiche d'une couleur spécifique le chemin parcouru dans un
scénario. \* Exportation de modèles de performance. \* Exportation vers
DOORS. \* Etc...

L'outil doit avoir un pattern MVC, avec des mécanismes pour exporter les
modèles vers d'autres notations. La notation UCM, elle-même, est en
évolution\! \* Ce fut un challenge de supporter les formats de fichiers
différents avec le changement continuel. \* On veut supporter les
fichiers **actuels** (DTD actuel). \* Amyot Fournira plus en détail ce
qu'il veut dans l'outil.

JP: pquoi eclipse?

  - C'est une option, pas obligatoire. C'est une opportunité (et en même
    temps un risque).
  - Plateforme intéressante pour le développement
  - Support multi-plateforme intéressant.
  - En Java, donc permet d'éviter la dépendance à X.
  - Pquoi Eclipse?
      - Plus en plus populaire
      - Bonne idée d'investir dans cette architecture pour apprendre à
        intégrer des outils avec Eclipse. (Dev plugins)
  - Plugins: offrent des hooks pour brancher autre chose en arrière,
    donc permet l'interconnexion avec d'autres services.
  - Bien sûr, il y a une courbe d'apprentissage.
  - Eclipse n'est pas un environnement de développement Java, cela est
    un exemple de ce qu'on peut faire avec la plateforme.
  - Encore une fois, intéressant mais pas obligatoire.
  - Le client souhaite que c'est un plugin Eclipse, mais c'est à nous de
    voir les risques.
  - SWT serait bien au lieu d'utiliser AWT ou Swing. Agit comme une
    couche entre l'app et le OS. L'affichage est donc offert nativement
    par le OS. Offre donc une façon de développer facilement une
    interface multi-plateforme.
  - Ali pourrait nous donner un crash-course sur le dév Eclipse
  - Étudiant de Lethbridge pourrait aussi donner une session sur
    Eclipse.

Propriété intellectuelle

  - Résultat sera libre. Personne n'a d'objections.

### DOORS

  - Client-serveur
  - Utilise le système de fichiers comme backend
  - Le client ressemble un peu à Word, c'est convivial.
  - Doit voir si CCS peut nous donner accès au VPN.

### ETC

Comment va-t-on montrer à D. Amyot nos plans, nos directions?

  - Modélisation
  - Documentation

Amyot va donner un tutoriel sur UCMNav prochainement. Rencontre mercredi
prochain\! (22 déc, 15h00 - 16h30).

  - 20 min sur UCM
  - 1h sur UCMNav et son utilisation.
  - On devrait installer UCMNav avant ça.

À ce demo, Jason demandera une liste de ce qui intéresse vraiment
Damyot. Il veut une architecture sensée, ainsi qu'un prototype.
(peut-être un proof of concept demo de la nouvelle arch)

### Contacts

<jack@site.uottawa.ca> X4051

Étudiant: Jean-Francois Roy, à la maîtrise. Va nous aider un tout petit
peu, temps partiel, savoir où on met trop d'effort ou pas assez.
<jfroy@sagedelire.com>

\-- Main.JeanPhilippeDaigle - 16 Jan 2005
