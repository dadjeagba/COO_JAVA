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

public class CellTest {

    @Test
    public void testCreationCell(){
      Cell c1 = new Cell();
      assertNotNull(c1);
      assertNull(c1.getShip());
      assertFalse(c1.isTouched());
    }

    @Test
    public void testSetShip(){
      Cell c1 = new Cell();
      Ship s = new Ship(1);
      c1.setShip(s);
      assertEquals(s,c1.getShip());
    }

    @Test
    public void testIsTouched(){
      Cell c1 = new Cell();
      c1.setShip(new Ship(1));
      assertFalse(c1.isTouched());
      c1.shoot();
      assertTrue(c1.isTouched());
    }

    @Test
    public void testShoot(){
      Cell c1 = new Cell();
      assertEquals(Answer.MISSED,c1.shoot());
      c1.setShip(new Ship(1));
      assertEquals(Answer.HIT,c1.shoot());
      assertEquals(Answer.SUNK,c1.shoot());
    }

  /*  @Test
    public void testGetCharaterForDefender(){
      Cell c1 = new Cell();
      assertThat(' ~ ',containsString(c1.getCharater(true)));
      c1.setShip(new Ship(1));
      assertThat(' B ',containsString(c1.getCharater(true)));
      c1.shoot();
      assertThat(' * ',containsString(c1.getCharater(true)));
    }

    @Test
    public void testGetCharaterForAttacker(){
      Cell c1 = new Cell();
      assertEquals(' . ',c1.getCharater(false));
      c1.shoot();
      assertEquals(' ~ ',c1.getCharater(false));
      c1.setShip(new Ship(1));
      assertEquals(' * ',c1.getCharater(false));
    }*/


    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(CellTest.class);
    }
}
