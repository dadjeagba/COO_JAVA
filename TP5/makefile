PROJET=TP5


doc:
	javadoc -cp src battleship battleship.util -d docs
	firefox docs/index.html &

runAll:
	cd src; javac  battleship/main.java -d ../classes; cd ..

main: runAll
	java -classpath classes battleship.main


TestAll: TestSea TestCell TestShip

TestSea: runAll
	javac -classpath test-1.7.jar test/SeaTest.java
	java -jar test-1.7.jar SeaTest

TestCell: runAll
	javac -classpath test-1.7.jar test/CellTest.java
	java -jar test-1.7.jar CellTest

TestShip: runAll
	javac -classpath test-1.7.jar test/ShipTest.java
	java -jar test-1.7.jar ShipTest


jarGame: runAll
	touch manifest-ex
	echo "Main-Class: battleship.main" > manifest-ex
	cd classes; jar cvf ../appliBattleShip.jar battleship io; cd ..
	cd classes; jar cvfm ../appliBattleShip.jar ../manifest-ex battleship io; cd ..


ExecGame:
	java -jar appliBattleShip.jar


clean:
	rm -rf classes/battleship/ classes/io/
	rm -f test/*.class appli*
	rm -rf docs
	clear
