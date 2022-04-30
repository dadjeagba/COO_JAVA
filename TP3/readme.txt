------------------------------------------------------------------------
Veuillez lire tout ce qui suit pour savoir comprendre le but du projet,
ses contraintes et son utilisation:
------------------------------------------------------------------------
AUTHORS: AGBA Pascal Sébastien

PROJECT TITLE: VLille

PURPOSE OF PROJECT: Apprendre à programmer en java avec moins d'instructions.
Learn how to write a clas in java by using using instructions 
Writing  for each class his documentation
Using a rigourous methodology based on  unit testing



VERSION or DATE: February 2020

HOW TO START THIS PROJECT:

USER INSTRUCTIONS:
 Pour commencer veuillez, créer un dossier. Sous linux deplacer vous dans ce dossier et recuperer ce projet via la commande 
git pull.
 Pour compiler chaque classe veuillez d'abord vous déplacer dans le dossier contenant cette classe puis taper
javadoc nomdelaclasse.java -d docs
 nomdelaclasse doit être remplacé par son  son nom effectif. par exemple
la commande javadoc Bike.java -d docs va vous produire la documentation dans un dossier nommé docs

Comment tester les classes?
 Dans ce dossiers vous trouverez un fichier un fichier d'essai pour faire les test
 Apres compilation de chaque classe
javac -classpath .:test-1.7.jar test/nomdelaclasseTest.java
java -jar test-1.7.jar classename
  Comment exécuter en ligne de commande
 java nomdeclassecompiler argument
Veuillez replacer  nomdeclassecompiler par son nom effectif
et argument par une valeur entière. 






