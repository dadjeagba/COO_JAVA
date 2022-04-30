
# TP7

## Auteurs

- AGBA Pascal Sébastien
- Akpoli Espero

## Objectifs atteints
Cet TP7 porte sur la modélidation d'une agence de location de véhicule.
### Notions abordées dans ce TP :
- Modélisation d'une situation réelle à base d'objets java
- Notion d'héritage
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
Pour générer la documentation de ce TP7, il suffit de pointer le terminal sur la racine du TP7 et taper la commande :
- make doc

ce faisant, toute la documentation est générée et s'ouvre directement dans le navigateur firefox au cas où celui-ci est installé sur votre machine. Nous rappellons que le choix du navigateur firefox est totalement arbitraire.
Pour afficher la docummentation avec un autre navigateur, Il suffit de pointer le terminal sur la racine du dossier docs et lancer via le navigateur de votre choix, le fichier :
- index.html


## Comment compiler les classes du projet ?
Pour compiler les classes du projet, il suffit de pointer le terminal sur la racine du TP7 et taper la commande :

- make runAll

## Comment compiler puis exécuter les tests ?
Pour compiler puis exécuter tous les tests en même temps, rien de plus facile. Il suffit de pointer le terminal sur la racine du TP7 et taper la commande :
- make TestAll

Toutefois, il vous est possible de lancer explicitement chaque test. Dans ce cas vous pouvez faire ce qui suit:

Pour compiler puis exécuter les tests de la classe de test RentalTest, il suffit de pointer le terminal sur la racine du TP7 et taper la commande :
- make TestRental

Pour compiler puis exécuter les tests de la classe de test SuspiciousRentalAgencyTest, il suffit de pointer le terminal sur la racine du TP7 et taper la commande :
- make TestSuspiciousRentalAgency

Pour compiler puis exécuter les tests de la classe de test ClientTest, il suffit de pointer le terminal sur la racine du TP7 et taper la commande :
- make TestClient

Pour compiler puis exécuter les tests de la classe de test VehicleTest, il suffit de pointer le terminal sur la racine du TP7 et taper la commande :
- make TestVehicle

Pour compiler puis exécuter les tests de la classe de test CarTest, il suffit de pointer le terminal sur la racine du TP7 et taper la commande :
- make TestCar

Pour compiler puis exécuter les tests de la classe de test MotorbikeTest, il suffit de pointer le terminal sur la racine du TP7 et taper la commande :
- make TestMotorbike

Pour compiler puis exécuter les tests de la classe de test BrandFilterTest, il suffit de pointer le terminal sur la racine du TP7 et taper la commande :
- make TestBrandFilter

Pour compiler puis exécuter les tests de la classe de test AndFilterTest, il suffit de pointer le terminal sur la racine du TP7 et taper la commande :
- make TestAndFilter

Pour compiler puis exécuter les tests de la classe de test MaxPriceFilterTest, il suffit de pointer le terminal sur la racine du TP7 et taper la commande :
- make TestMaxPriceFilter

## Comment tester l'exécution du programme ?
Pour lancer une exécution de la class principale , il suffit de pointer le terminal sur la racine du TP7 et taper la commande :
- make main

## Comment créer une archive jar exécutables du programme?
Pour créer une archive exécutable du programme, il suffit de pointer le terminal sur la racine du TP7 et taper la commande :
- make JarAgence

## Comment exécuter l'archive jar créées ?
Pour exécuter l'archive jar du programme, il suffit de pointer le terminal sur la racine du TP7 et taper la commande :
- make ExecAgence

Pour exécuter explicitement l'archive jar du programme, il suffit de pointer le terminal sur la racine du TP7 et taper la commande :
- java -jar appliAgence.jar


## Remerciements
Merci à vous chers professeurs pour le suivi et l'accompagnement pendant cette période de confinement.  De ce fait, nous estimons qu'il serait foncièrement injuste de ne pas témoigner nos reconnaissances envers nos émérites enseignants :
- Mr Jean-Christophe Routier (enseignant chargé du cours)
- Mr Yves Roos   (enseignant chargé des TD et TP).
