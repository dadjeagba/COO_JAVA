/**
 * Module : battleship
 * Filename : Answer.java
 * Authors : AKPOLI Espero/COULIBALI Ivette
 * Date : 21/03/2019
 */
import org.junit.*;
import static org.junit.Assert.*;
import battleship.*;
import battleship.util.*;

public class ShipTest {

  @Test
  public void testShipCreation() {
    Ship s = null;
    assertNull(s);
    s = new Ship(5);
    assertNotNull(s);
  }

  @Test
  public void testGetLifePoints(){
    Ship s = new Ship(8);
    assertEquals(8,s.getLifePoints());
  }

  @Test
  public void testSunk(){
    Ship s = new Ship(1);
    assertFalse(s.sunk());
    s.hit();
    assertTrue(s.sunk());
  }

  @Test
  public void testMissed(){
    Ship s = new Ship(5);
    assertFalse(s.missed());
  }

  @Test
  public void testLifePointsDownWhenShipIsHit(){
    Ship s = new Ship(5);
    assertEquals(5,s.getLifePoints());
    s.hit();
    assertEquals(4,s.getLifePoints());
  }


  // ---Pour permettre l'exécution des test----------------------
  public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(ShipTest.class);
  }

}
