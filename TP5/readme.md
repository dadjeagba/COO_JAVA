
# TP5

## Auteurs

- AKPOLI ESPERO
- AGBA Pascal

## Objectifs atteints
Cet TP5 porte sur le jeu bataille navale.
### Notions abordées dans ce TP :
- Modélisation d'une situation réelle à base d'objets java
- La mise en oeuvre des paquetages
- La compilation
- La génération de la documentation
- tests
- L'éxécution du programme
- La gestion d'archives
- L'ajout des ressources


Nous avons réussi les différentes questions posées.

Bonne lecture !
## Comment générer la documentation ?
Pour générer la documentation de ce TP5, il suffit de pointer le terminal sur la racine du TP5 et taper la commande :
- make doc

ce faisant, toute la documentation est générée et s'ouvre directement dans le navigateur firefox au cas où celui-ci est installé sur votre machine. Nous rappellons que le choix du navigateur firefox est totalement arbitraire.
Pour afficher la docummentation avec un autre navigateur, Il suffit de pointer le terminal sur la racine du dossier docs et lancer via le navigateur de votre choix, le fichier :
- index.html


## Comment compiler les classes du projet ?
Pour compiler les classes du projet, il suffit de pointer le terminal sur la racine du TP5 et taper la commande :

- make runAll

## Comment compiler puis exécuter les tests ?
Pour compiler puis exécuter tous les tests en même temps, rien de plus facile. Il suffit de pointer le terminal sur la racine du TP5 et taper la commande :
- make TestAll

Toutefois, il vous est possible de lancer explicitement chaque test. Dans ce cas vous pouvez faire ce qui suit:

Pour compiler puis exécuter les tests de la classe de test CellTest, il suffit de pointer le terminal sur la racine du TP5 et taper la commande :
- make TestCell

Pour compiler puis exécuter les tests de la classe de test SeaTest, il suffit de pointer le terminal sur la racine du TP5 et taper la commande :
- make TestSea

Pour compiler puis exécuter les tests de la classe de test ShipTest, il suffit de pointer le terminal sur la racine du TP5 et taper la commande :
- make TestShip

## Comment tester l'exécution du programme ?
Pour jouer une partie du jeu, il suffit de pointer le terminal sur la racine du TP5 et taper la commande :
- make main

## Comment créer une archive jar exécutables du jeu?
Pour créer une archive exécutable du programme example , il suffit de pointer le terminal sur la racine du TP5 et taper la commande :
- make jarGame

## Comment exécuter l'archive jar créées ?
Pour exécuter l'archive jar du programme example, il suffit de pointer le terminal sur la racine du TP5 et taper la commande :
- make ExecGame

