# History

  - Main.JeanPhilippeDaigle Submitted 2005-01-05
  - Main.EtienneTremblay Formatted 2005-01-13



# Livrable 0 - Proposition de projet

## UCMNav – Plug-in pour Eclipse

par [Olivier Clift-Noël](Main.OlivierCliftNoel)
[Jean-Philippe Daigle](Main.JeanPhilippeDaigle)
[Jason Kealey](Main.JasonKealey)[Jordan
McManus](Main.JordanMcManus)
[Etienne Tremblay](Main.EtienneTremblay)

L’équipe SoftwareEngineering.Ca

Travail présenté à Dr. Liam Peyton dans le cadre du 
Projet final du baccalauréat en génie logiciel


Université d’Ottawa 5 Janvier 2005 



## L’équipe de développement

<table>
<thead>
<tr class="header">
<th style="text-align: center;">Nom</th>
<th style="text-align: center;">Numéro Étudiant</th>
<th style="text-align: center;">Courriel</th>
<th style="text-align: center;">Statut</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td style="text-align: center;"><a href="Main.OlivierCliftNoel">Olivier Clift-Noël</a></td>
<td style="text-align: center;">2702098</td>
<td style="text-align: center;">ocliftnoel</td>
<td style="text-align: center;">Coop</td>
</tr>
<tr class="even">
<td style="text-align: center;"><a href="Main.JeanPhilippeDaigle">Jean-Philippe Daigle</a></td>
<td style="text-align: center;">2380006</td>
<td style="text-align: center;">jpdaigle</td>
<td style="text-align: center;">Coop</td>
</tr>
<tr class="odd">
<td style="text-align: center;"><a href="Main.JasonKealey">Jason Kealey</a></td>
<td style="text-align: center;">2657431</td>
<td style="text-align: center;">jkealey</td>
<td style="text-align: center;">Coop</td>
</tr>
<tr class="even">
<td style="text-align: center;"><a href="Main.JordanMcManus">Jordan McManus</a></td>
<td style="text-align: center;">2722815</td>
<td style="text-align: center;">jmcmanus</td>
<td style="text-align: center;">Coop</td>
</tr>
<tr class="odd">
<td style="text-align: center;"><a href="Main.EtienneTremblay">Etienne Tremblay</a></td>
<td style="text-align: center;">2672764</td>
<td style="text-align: center;">etremblay</td>
<td style="text-align: center;">Coop</td>
</tr>
<tr class="even">
<td style="text-align: center;">Tous les membres</td>
<td style="text-align: center;">-</td>
<td style="text-align: center;">projetseg</td>
<td style="text-align: center;">-</td>
</tr>
</tbody>
</table>

## Présentation du client

Dr Daniel Amyot  Université d'Ottawa – ÉITI  800 rue King
Edward, Ottawa, Ontario, Canada, K1N 6N5  Téléphone: +1 (613)
562-5800 poste 6947   Télécopieur: +1 (613) 562-5664   Bureau:
Édifice ÉITI, salle 5-021   Courriel: <damyot@site.uottawa.ca>
  

En février 2002, Daniel Amyot s’est joint à l'ÉITI à titre de Professeur
adjoint, après un séjour en milieu industriel (Mitel Networks) et la fin
de sa thèse portant sur la spécification et la validation de systèmes de
télécommunication avec des scénarios causaux et LOTOS (Prix
Pierre-Laberge 2002). Il est responsable du groupe d'intérêt sur les Use
Case Maps ainsi que Rapporteur à l'UIT-T (Commission d'études 17) sur
les langages d'exigences (User Requirements Notation et Message Sequence
Charts). Il détient un doctorat et une maîtrise de l'Université d'Ottawa
(2001 et 1994) ainsi qu'un baccalauréat en sciences de l'Université
Laval (1992). Objectifs UCMNav, Use Case Map Navigator de son nom
complet, est un outil construit en C++ qui permet de créer, modifier et
explorer des modèles Use Case Maps (UCM). La notation Use Case Map est
un langage d’exigence en cours de normalisation à l’UIT-T. La version
actuelle du système nécessite XForms, X Window, et une variante de
Linux/Unix ou Cygwin sous Windows. Le prototype a évolué grandement et
est aujourd’hui impossible à maintenir. De plus, l’interface n’est pas
conviviale et puisque c’est le seul outil sur le marché pour naviguer à
travers les Use Case Maps, cela ralentit l’adoption répandue de la
notation.

### Notre projet vise à remplir les buts suivants : 

1.  Se défaire des dépendances à l’environnement X Window et à la
    librairie XForms
2.  Refaire l’architecture du système pour assurer sa maintenabilité et
    son extensibilité
3.  Offrir une interface plus conviviale et standardisée pour accélérer
    l’adoption de la notation

## Système proposé

L’annexe propose un diagramme des cas d’utilisations de très haut niveau
de notre plug-in Eclipse. Sommairement, notre système permettra la
visualisation et l’édition des concepts généraux de la notation UCM. Les
fonctions plus avancées telles que les traces ne seront pas incluses.

Aussi inclus en annexe est une séquence d’actions schématisées
rapidement démontrant l’ajout d’une composante à un chemin existant, en
utilisant le menu contextuel du point vide placé à l’endroit où
l’insertion doit être effectuée.

## Description de l’architecture

Selon notre évaluation initiale, le meilleur moyen de satisfaire les
buts de notre client est de créer un plug-in Eclipse en Java. Eclipse
est un outil libre qui offre un environnement de développement pour tout
et rien à la fois. En somme, il offre une infrastructure d’édition
complexe et permet aux développeurs de se concentrer sur la logique de
leur application. Eclipse réduit le nombre d’outils nécessaires pour
accomplir une certaine tâche et standardise les interactions avec
ceux-ci. Nos recherches initiales nous indiquent que SWT (Standard
Widget Toolkit) et GEF (Graphical Editing Framework) seront très utiles
pour développer notre application rapidement.

[[img/image001.gif]]  

## Risques

Eclipse évolue rapidement, tout comme SWT et GEF. Ayant communiqué avec
un développeur expérimenté (Paul Wells de chez Modelistic.com), nous
savons que ceci risque d’être la plus grande difficulté qui affectera le
sujet de notre projet. De plus, nous allons utiliser plusieurs outils au
cours de notre projet pour optimiser nos processus dont certains avec
lesquels nous ne sommes pas encore familiers. Ant, BugZilla, CVS, DOORS,
Eclipse, JUnit, Rational XDE, Twiki et UCMNav sont ceux que nous
prévoyons utiliser fréquemment. La stratégie de minimisation de ces
risques compte sur le déploiement et l’utilisation des outils logiciels
mentionnés ci-haut aussi tôt que possible, et par le plus grand nombre
d’équipiers possible à chaque fois qu’une nouvelle technologie doit
être introduite.

Nous prévoyons également que l’effort offert par chacun des membres de
l’équipe soit différent au cours du projet. Un risque est qu’un (ou
plusieurs) des membres ne puisse(nt) produire au même niveau que les
autres pendant un laps de temps important. La personne la plus probable
pour ce genre de situation cette session est Olivier car il prend
beaucoup d’autres cours (7). Des problèmes de santé, des voyages, des
problèmes familiaux sont tous des facteurs qui risquent d’influencer
négativement notre projet. Nous comptons mitiger ces risques en
demeurant toujours en communication avec les autres développeurs, et
réassignant des tâches au besoin.

Le déploiement sera difficile pour deux raisons. Premièrement, notre
application doit être portable. Malgré que le code source sera offert
librement, des versions compilées facilement distribuables devront être
testées et distribuées. De plus, l’évolution d’Eclipse risque
d’augmenter le nombre de versions en distribution de notre plug-in.
Notre but sera de limiter ces versions en étudiant l’évolution d’Eclipse
pour s’assurer la compatibilité future de nos composantes. La notation
UCM est elle aussi en évolution, et l’outil devra permettre de s’ajuster
facilement aux modifications à la notation elle-même. Un autre aspect à
considérer sera la décision de déployer notre plug-in seul ou dans une
archive contenant une certaine version d’Eclipse.

## Étude d’impact ---+++ Questions légales

Tel que montré plus haut, dans le diagramme de déploiement, UCMNav
dépend du framework Eclipse (sous licence Eclipse Public License) et,
selon toute probabilité, du Graphical Editing Framework (sous licence
CPL, bientôt EPL). L’outil existant que nous porterons (mais qui ne
contribuera pas de code au nouveau projet) est disponible sous licence
GPL. Les particularités de ces licences forceront la distribution du
code source selon une licence EPL. Ceci est cohérent avec les attentes
du client, qui désire développer un plug-in pour Eclipse.

### Standards existants

La notation Use Case Map (UCM) est un langage d’exigences en cours de
normalisation à l’UIT-T. Notre outil devra se conformer à la notation
standard. L’expert à consulter dans ce domaine est le Dr Amyot,
également notre client.

D’un point de vue technique, l’outil UCMNav actuel supporte l’export
d’UCMs dans un format XML pour lequel le schéma nous est fourni. Le
nouvel outil devra être interopérable avec les fichiers produits par la
version actuelle d’UCMNav.

### Responsabilités légales

Les licences EPL et GPL incluent une déclaration de non-responsabilité
de la part des développeurs et distributeurs du produit. De graves
problèmes dans notre implémentation seraient regrettables et pourraient
retarder l’adoption, mais ne nous exposent pas (ni notre client) à des
difficultés légales.

### Questions sociales

Le système prévu, en tant qu’outil permettant l’édition et la navigation
d’UCMs, favorise le développement de méthodes et standards pour assister
à la conception des systèmes informatiques de demain. Le développement
des techniques du génie des logiciels permettra, à long terme, de créer
des logiciels plus stables, plus conviviaux, conçus plus rapidement, et
moins coûteux.

### Communauté d’usagers

Lorsque le nouvel éditeur UCM approchera la parité de fonctionnalité
avec UCMNav2 (l’éditeur existant), il pourra commencer à être adopté par
la communauté d’usagers actuels et sa plus grande indépendance lui
permettra d’être approché plus facilement par de nouveaux usagers.

### Impact financier

L’impact financier du projet ne fera pas l’objet d’une analyse poussée
dans ce bref document. Les étudiants affectés à ce projet n’en retirent
pas de salaire, la seule personne salariée affectée durant le
développement sera donc notre client, Dr Amyot, qui nous consacrera un
peu de son temps sur une base régulière.

À l’échelle de la communauté d’usagers, le produit fini sera distribué
gratuitement, avec code source, sous les termes de la licence EPL. Le
coût pour la communauté d’usagers est donc simplement le coût du temps
nécessaire pour le déploiement et l’apprentissage de l’outil.

## Plan du Projet

### Rôles

  - **Gestionnaire de projet, Analyste des besoins du client** : [Jason
    Kealey](Main.JasonKealey)
  - **Architecte** : [Etienne Tremblay](Main.EtienneTremblay)
  - **Gestionnaire du déploiement, Expert des interfaces usager** :
    [Jean-Philippe Daigle](Main.JeanPhilippeDaigle)
  - **Développeur principal** : [Jordan McManus](Main.JordanMcManus)
  - **Gestionnaire du contrôle de la qualité** : [Olivier
    Clift-Noël](Main.OlivierCliftNoel)

À la fin de la première itération, nous remettrons la version finale du
document de définition du projet. Nous aurons instauré et testé
rapidement notre environnement de développement, défini les exigences
directrices du projet et défini les modes d’interaction principaux avec
le système. Le gestionnaire de projet est responsable de la livraison de
notre livrable, le 28 janvier 2005.

À la fin de la deuxième itération, nous remettrons notre cahier des
charges. Nous aurons aussi établi les cas d’utilisations typiques du
système. Une visualisation statique du modèle très simplifié devrait
être possible. Le gestionnaire de projet est responsable de la
livraison de notre livrable, le 18 février 2005.

À la fin de la troisième itération, nous remettrons notre premier cahier
de contrôle de la qualité. Nous aurons implémenté l’architecture
générale du plug-in et implémenté les très grandes lignes du système.
Le gestionnaire de projet est responsable de la livraison de notre
livrable, le 18 mars 2005.

À la fin de la quatrième itération, nous remettrons notre cahier de
design. Une version alpha de notre plug-in sera prête, les exigences
directrices ayant été implémentées et le système pouvant fonctionner
avec des fichiers externes réels. Le gestionnaire de projet est
responsable de la livraison de notre livrable, le 13 mai 2005.

À la fin de la cinquième itération, nous remettrons notre deuxième
cahier de contrôle de la qualité. La majorité du système sera
fonctionnel et ce qui reste à faire sera bien identifié. Le gestionnaire
de projet est responsable de la livraison de notre livrable, le 17 juin
2005.

À la fin de la sixième itération, nous remettrons notre rapport final.
L’étendue du travail planifié aura été complétée et le plug-in sera
prêt pour d’autres désirant étendre la fonctionnalité offerte par le
plug-in. Le gestionnaire de projet est responsable de la livraison de
notre livrable, le 15 juillet 2005.

## Annexe

### Diagramme de cas d’utilisations

[[img/image003.gif]]  
  

### Exemple d’une séquence d’action

Nous voulons ajouter une responsabilité au diagramme, à l’endroit où se
situe le point vide.

[[img/image005.gif]]

Nous ouvrons le menu contextuel sur le point vide de la courbe où nous
voulons insérer la responsabilité.
[[img/image007.gif]]

Nous avons sélectionné l'option responsabilité dans le menu contextuel.
Celle-ci apparaît et deux nouveaux points vides sont insérés sur la
courbe.

[[img/image009.gif]]
