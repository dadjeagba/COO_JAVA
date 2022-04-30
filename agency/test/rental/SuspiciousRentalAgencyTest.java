package rental;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.Before;
import org.junit.Test;

public class SuspiciousRentalAgencyTest {
	private Vehicle v1;
	private Vehicle v2, v3, v4;
	private SuspiciousRentalAgency agency;
	private List<Vehicle> result;

	@Before
	public void before() {
			// réinitialisation des attributs v1 et v2 pour chacun des tests
		this.v1 = new Vehicle("brand1","model1",2015,100.0f);
		this.v2 = new Vehicle("brand2","model2",2000,200.0f);
		this.v3 = new Vehicle("brand3","model1",2019,300.0f);
		this.v4 = new Vehicle("brand4","model2",20120,400.0f);
		this.agency = new SuspiciousRentalAgency();
		List<Vehicle> result;
		this.result = new ArrayList<Vehicle>();
	}

	@Test
	public void twoClientObjectsWithSameNameNotCorrespondsToSameClient()
					throws IllegalStateException, UnknownVehicleException {
		SuspiciousRentalAgency agency = new SuspiciousRentalAgency();
		Vehicle v = new Vehicle("Vroum", "Vroum", 2000, 100);
		agency.addVehicle(v);
		Client client1 = new Client("Tim Oleon", 25);
		assertEquals(110.0, agency.rentVehicle(client1, v),0.0001);
		assertTrue(agency.hasRentedAVehicle(client1));
		// client2 corresponds to same client than client1 since names are equals
		Client client2 = new Client("Tim Oleon", 25);
		// then test should succeed
		assertFalse(agency.hasRentedAVehicle(client2));
	}
	

	@Test(expected=IllegalStateException.class)
	public void testAddVehicleWhenVehicleIsAleadyInAgency(){
		this.agency.addVehicle(this.v1);
		this.agency.addVehicle(this.v1);
	}
	// un client veut louer un véhiculé déjà prit => exception
	// un client veut prendre un véhicule alors qu'il a déja loué un véhicule => exception
	@Test
	public void testSelectVehiclesThatIsAcceptedByFilter(){
		this.agency.addVehicle(this.v1);
		this.agency.addVehicle(this.v2);
		this.agency.addVehicle(this.v3);
		this.agency.addVehicle(this.v4);
		this.result = agency.select(new MaxPriceFilter(300));
		assertEquals(this.v1,this.result.get(0));
		assertEquals(this.v2,this.result.get(1));
	}

	// ---Pour permettre l'execution des tests ----------------------
	public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(rental.SuspiciousRentalAgencyTest.class);
	}

}
