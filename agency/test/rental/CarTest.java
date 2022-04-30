package rental;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {


  private Car v1;
	private Car v2;


    /* méthode exécutée avant l'exécution de chacune des méthodes de test*/
	@Before
	public void before() {
	    // réinitialisation des attributs v1 et v2 pour chacun des tests
		this.v1 = new Car("brand1","model1",2015,100.0f,3);
		this.v2 = new Car("brand2","model2",2000,200.0f,5);
	}


	@Test
	public void testGetBrand() {
	    // this.v1 et this.v2 initialisés car before() a été exécutée avant cette méthode
		assertEquals("brand1",this.v1.getBrand());
		assertEquals("brand2",this.v2.getBrand());
	}

	@Test
	public void testGetModel() {
		assertEquals("model1",this.v1.getModel());
		assertEquals("model2",this.v2.getModel());
	}

	@Test
	public void testGetDailyPrice() {
	    assertEquals(100.0f,this.v1.getDailyPrice(),0.0001);
	    assertEquals(200.0f,this.v2.getDailyPrice(),0.0001);
	}

	@Test
	public void testGetProductionYear() {
	    assertEquals(2015,this.v1.getProductionYear());
	    assertEquals(2000,this.v2.getProductionYear());
	}

  @Test
	public void TestGetNumberPassengers() {
	    assertEquals(3,this.v1.getNumberPassengers());
	    assertEquals(5,this.v2.getNumberPassengers());
	}

	@Test
	public void testEquals() {
		Car v3 = new Car("brand1","model1",2015,100.0f,4);
		Car v4 = new Car("brand1","model1",2015,200.0f,3);
		assertTrue(v1.equals(v3));
		assertFalse(v1.equals(v2));
		assertFalse(v1.equals(v4));
		assertFalse(v1.equals(new Object()));
	}

    // ---Pour permettre l'execution des tests ----------------------
    public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(rental.CarTest.class);
    }
}
