# Meeting 2004-12-22: Discussion des buts et exigences informelles

À connaître pour notre projet sur GRL: ça existe. Ça serait intéressant
un jour de supporter URN au complet, mais cela n'est pas le focus ici.

UCM: \* Les éléments d'un scénario peuvent être alloués (opt) à des
composants. \* Composants = un acteur ou composante logicielle ou etc.
Générique. \* Les UCM modèlent le 'quoi'. \* Permettent l'intégration
de scénarios. \* Modèle de données associé à un modèle UCM: présentement
il s'agit de variables booléennes. On peut donner des valeurs initiales
et voir comment le modèle va réagir.

Priorité pour Main.DanielAmyot: éliminer la dépendance sur Xforms /
Xwin.

Priorité: NAVIGATOR. Être capable de naviguer un ensemble de UCMs. Un
UCM est dans un autre, dans un autre, etc. L'outil montre où on est dans
la hiérarchie. En ce moment l'outil montre ça avec une liste, mais
conceptuellement c'est un arbre et on veut cela.

Aimerait aussi avoir des aspects de navigation, (genre web browser)
comme Back / Forward.

Enlignez-vous avec les règles de UI de MSFT. Devons voir si ça cadre
bien avec Eclipse, mais les noms de menus / boutons / etc.

Basse priorité (mais sur la liste): i18n

SCC integration n'est pas une priorité. (genre: diffs entre 2 modèles)

Doit importer le format actuel. Format nouveau à utiliser doit être
discuté plus longuement.

Si je sauve le diagramme avec une courbe placée exactement d'une
certaine façon, la prochaine fois qu'on l'ouvre la courbe doit être
placée identiquement.

UCMNav a un espace de travail de taille fixe, mais ce serait intéressant
d'avoir un espace de travail de taille variable. Non obligatoire :)

Important: zoom.

Répliquer le comportement actuel... Dès qu'on déplace un chemin dans une
composante, il devient associé. Dès qu'on déplace une composante dans
une autre elle devient associée.

Doit avoir des capacités pour créer / modifier des composantes /
attributs des composantes. En ce moment double-click ou context menu.

  - Stack
  - Protected
  - Slot
  - Component type

Points libres (O) servent à formatter les courbes et, dans UCMNav,
ajouter les branchements, les alternatives, etc. Ils ne sont pas
exportés ou imprimés.

N'offrir que des transformations qui vont résulter en un diagramme UCM
syntaxiquement valide. (ajouts, modifs, etc...) Aimerait conserver cet
aspect.

Permettre un freeform déplacement des labels de responsabilités. Être
flexible. Même chose pour points de départ, points d'arrivée,
composantes.

Variable operations.

Petits auto tricks de layout comme dans la version actuelle.

Meilleure création de chemins

Main.DanielAmyot fournira un UML diag montrant les éléments & attributs
du standard.

Export formats:

  - EPS (essentiel)
  - SVG (non essentiel mais on le voudrait)
  - Windows metafile (would be nice)

UCM Sets: forget about it. Dead.

Conditions / gardes. Serait bien d'améliorer l'affichage, les
étiquettes, etc... Serait bien d'avoir les étiquettes associées aux
conditions.

Scope: On aimerait un UI, mais l'analyse et le parcours de scénarios ne
se fera pas dans cette première étape.

\-- Main.JeanPhilippeDaigle - 16 Jan 2005


[SEG3700-URN.ppt](att/SEG3700-URN.ppt)