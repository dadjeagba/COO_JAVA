PROJET=TP7


doc:
	javadoc -cp src rental -d docs
	firefox docs/index.html &

runAll:
	javac  src/rental/*.java -d classes

main: runAll
	java -classpath classes rental.main


TestAll: TestRental TestClient TestVehicle TestCar TestMotorbike TestBrandFilter TestMaxPriceFilter TestAndFilter

TestSuspiciousRentalAgency: runAll
	javac -classpath test-1.7.jar test/rental/SuspiciousRentalAgencyTest.java
	java -jar test-1.7.jar rental.SuspiciousRentalAgencyTest

TestRental: runAll
	javac -classpath test-1.7.jar test/rental/RentalAgencyTest.java
	java -jar test-1.7.jar rental.RentalAgencyTest

TestClient: runAll
	javac -classpath test-1.7.jar test/rental/ClientTest.java
	java -jar test-1.7.jar rental.ClientTest

TestVehicle: runAll
	javac -classpath test-1.7.jar test/rental/VehicleTest.java
	java -jar test-1.7.jar rental.VehicleTest

TestCar: runAll
	javac -classpath test-1.7.jar test/rental/CarTest.java
	java -jar test-1.7.jar rental.CarTest

TestMotorbike: runAll
	javac -classpath test-1.7.jar test/rental/MotorbikeTest.java
	java -jar test-1.7.jar rental.MotorbikeTest


TestAndFilter: runAll
	javac -classpath test-1.7.jar test/rental/AndFilterTest.java
	java -jar test-1.7.jar rental.AndFilterTest

TestBrandFilter: runAll
	javac -classpath test-1.7.jar test/rental/BrandFilterTest.java
	java -jar test-1.7.jar rental.BrandFilterTest

TestMaxPriceFilter: runAll
	javac -classpath test-1.7.jar test/rental/MaxPriceFilterTest.java
	java -jar test-1.7.jar rental.MaxPriceFilterTest


JarAgence: runAll
	rm -f test/*.class appli*
	touch manifest-ex
	echo "Main-Class: rental.main" > manifest-ex
	cd classes; jar cvf ../appliAgence.jar rental; cd ..
	cd classes; jar cvfm ../appliAgence.jar ../manifest-ex rental; cd ..

ExecAgence:
	java -jar appliAgence.jar

clean:
	rm -rf classes/rental* test/rental/*.class
	rm -rf docs
	clear
