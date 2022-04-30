
# TP6

## Auteurs

- AGBA Pascal Sébastien
- Akpoli Espero

## Objectifs atteints
Cet TP6 porte sur le Pierre-Feuille-Ciseaux.
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
Pour générer la documentation de ce pfc, il suffit de pointer le terminal sur la racine du pfc et taper la commande :
- make doc

ce faisant, toute la documentation est générée et s'ouvre directement dans le navigateur firefox au cas où celui-ci est installé sur votre machine. Nous rappellons que le choix du navigateur firefox est totalement arbitraire.
Pour afficher la docummentation avec un autre navigateur, Il suffit de pointer le terminal sur la racine du dossier docs et lancer via le navigateur de votre choix, le fichier :
- index.html


## Comment compiler les classes du projet ?
Pour compiler les classes du projet, il suffit de pointer le terminal sur la racine du pfc et taper la commande :

- make runAll

## Comment compiler puis exécuter les tests ?
Pour compiler puis exécuter tous les tests en même temps, rien de plus facile. Il suffit de pointer le terminal sur la racine du pfc et taper la commande :
- make TestAll

Toutefois, il vous est possible de lancer explicitement chaque test. Dans ce cas vous pouvez faire ce qui suit:

Pour compiler puis exécuter les tests de la classe de test GameTest, il suffit de pointer le terminal sur la racine du pfc et taper la commande :
- make TestGame

Pour compiler puis exécuter les tests de la classe de test PlayerTest, il suffit de pointer le terminal sur la racine du pfc et taper la commande :
- make TestPlayer

Pour compiler puis exécuter les tests de la classe de test ShapeTest, il suffit de pointer le terminal sur la racine du pfc et taper la commande :
- make TestShape

## Comment tester l'exécution du programme ?
Pour jouer une partie du jeu, il suffit de pointer le terminal sur la racine du pfc et taper la commande :
- make main

## Comment créer une archive jar exécutables du jeu?
Pour créer une archive exécutable du programme, il suffit de pointer le terminal sur la racine du pfc et taper la commande :
- make jarGame

## Comment exécuter l'archive jar créées ?
Pour exécuter l'archive jar du programme, il suffit de pointer le terminal sur la racine du pfc et taper la commande :
- make ExecGame

Pour exécuter explicitement l'archive jar du programme, il suffit de pointer le terminal sur la racine du pfc et taper la commande :
- java -jar applipfc.jar 5

ici, le nombre à la fin de la commande est le nombre de tours à jouer ( 5 est mis de mannière arbitraure donc rien ne vous empêche de mettre le nombre que vous voulez).  En cas d'ommission, le nombre de tour par défaut est de 5

## Remerciements
Il est vrai que dans ce pfc, nous avons usé de motivation. Mais cette motivation à elle seule n'aurait pas suffit à nous aider dans toutes les questions. De ce fait, nous estimons qu'il serait foncièrement injuste de ne pas témoigner nos reconnaissances envers nos émérites enseignants :
- Mr Jean-Christophe Routier (enseignant chargé du cours)
- Mr Yves Roos   (enseignant chargé des TD et TP).
