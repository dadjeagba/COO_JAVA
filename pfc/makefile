PROJET=TP6


doc:
	javadoc -cp src pfc pfc.strategy -d docs
	firefox docs/index.html &

runAll:
	javac  src/pfc/*.java src/pfc/strategy/*.java src/io/Input.java  -d classes

main: runAll
	java -classpath classes pfc.main 10


TestAll: TestPlayer TestGame TestShape

TestPlayer: runAll
	javac -classpath test-1.7.jar test/PlayerTest.java
	java -jar test-1.7.jar PlayerTest

TestGame: runAll
	javac -classpath test-1.7.jar test/GameTest.java
	java -jar test-1.7.jar GameTest

TestShape: runAll
	javac -classpath test-1.7.jar test/ShapeTest.java
	java -jar test-1.7.jar ShapeTest


jarGame: runAll
	rm -f test/*.class appli*
	touch manifest-ex
	echo "Main-Class: pfc.main" > manifest-ex
	cd classes; jar cvf ../applipfc.jar pfc io; cd ..
	cd classes; jar cvfm ../applipfc.jar ../manifest-ex pfc io; cd ..


ExecGame:
	java -jar applipfc.jar 5


clean:
	rm -rf classes/pfc* classes/io*
	rm -rf docs
	clear
