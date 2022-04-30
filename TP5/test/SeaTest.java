/*
 * Module : battleship
 * Filename : Answer.java
 * Authors : AKPOLI Espero/COULIBALI Ivette
 * Date : 21/03/2019
 */
import org.junit.*;
import static org.junit.Assert.*;
import battleship.*;
import battleship.util.*;

public class SeaTest {

    @Test
    public void TestCreationSea(){
      Sea sea = new Sea(5,5);
      assertNotNull(sea);
    }

    @Test
    public void TestGetCell(){
      Sea sea = new Sea(5,5);
      for (int i =0; i<5; i++ ) {
        for (int j=0; j<5; j++ ) {
          assertNull(sea.getCell(new Position(i,j)).getShip());
          assertFalse(sea.getCell(new Position(i,j)).isTouched());
          Ship s = new Ship(1);
          sea.getCell(new Position(i,j)).setShip(s);
          assertEquals(s,sea.getCell(new Position(i,j)).getShip());
        }
      }
    }

    @Test
    public void TestShootCellInPositionP(){
      Sea sea = new Sea(5,5);
      sea.addShipHorizontally(new Ship(2),new Position(0,0));
      assertEquals(Answer.HIT,sea.shoot(new Position(0,0)));
      assertEquals(Answer.SUNK,sea.shoot(new Position(0,0)));;
      assertEquals(Answer.MISSED,sea.shoot(new Position(0,3)));
    }

    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void TestShootCellInIllegalPosition(){
      Sea sea = new Sea(5,5);
      sea.addShipHorizontally(new Ship(2),new Position(0,0));
      sea.shoot(new Position(20,0));
    }

    @Test
    public void TestAddShipVertically(){
      Sea sea = new Sea(10,10);
      assertNull(sea.getCell(new Position(0,0)).getShip());
      assertNull(sea.getCell(new Position(1,0)).getShip());
      sea.addShipVertically(new Ship(2),new Position(0,0));
      assertNotNull(sea.getCell(new Position(0,0)).getShip());
      assertNotNull(sea.getCell(new Position(1,0)).getShip());
    }

    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void TestAddShipVerticallyWhenPositionIsOutOfBounds(){
      Sea sea = new Sea(10,10);
      sea.addShipVertically(new Ship(20),new Position(0,0));
    }

    @Test(expected=IllegalStateException.class)
    public void TestAddShipVerticallyWhenShipCanNotBePlaced(){
      Sea sea = new Sea(10,10);
      sea.addShipVertically(new Ship(2),new Position(0,0));
      sea.addShipVertically(new Ship(2),new Position(0,0));
    }

    @Test
    public void TestAddShipHorizontally(){
      Sea sea = new Sea(10,10);
      assertNull(sea.getCell(new Position(0,0)).getShip());
      assertNull(sea.getCell(new Position(0,1)).getShip());
      sea.addShipHorizontally(new Ship(2),new Position(0,0));
      assertNotNull(sea.getCell(new Position(0,0)).getShip());
      assertNotNull(sea.getCell(new Position(0,1)).getShip());
    }

    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void TestAddShipHorizontallyWhenPositionIsOutOfBounds(){
      Sea sea = new Sea(10,10);
      sea.addShipHorizontally(new Ship(20),new Position(0,0));
    }

    @Test(expected=IllegalStateException.class)
    public void TestAddShipHorizontallyWhenShipCanNotBePlaced(){
      Sea sea = new Sea(10,10);
      sea.addShipHorizontally(new Ship(2),new Position(0,0));
      sea.addShipHorizontally(new Ship(2),new Position(0,0));
    }

    @Test
    public void TestgetLifePointOfAllShipInSea(){
      Sea sea = new Sea(10,10);
      sea.addShipHorizontally(new Ship(2),new Position(0,0));
      assertEquals(2,sea.getLifePointOfAllShip());
      sea.addShipHorizontally(new Ship(3),new Position(1,1));
      assertEquals(5,sea.getLifePointOfAllShip());
      sea.addShipVertically(new Ship(2),new Position(2,2));
      assertEquals(7,sea.getLifePointOfAllShip());
      sea.addShipVertically(new Ship(3),new Position(3,3));
      assertEquals(10,sea.getLifePointOfAllShip());
      sea.addShipHorizontally(new Ship(5),new Position(5,5));
      assertEquals(15,sea.getLifePointOfAllShip());
    }


    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(SeaTest.class);
    }
}
