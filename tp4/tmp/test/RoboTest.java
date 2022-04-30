import org.junit.*;
import static org.junit.Assert.*;
import example.*;
import example.util.*;

public class RoboTest{

    @Test
    public void takeBoxTest(){
      Robot r1 = new Robot();
      Box b1 = new Box(10);
      assertNull(r1.getCarriedBox());
      r1.take(b1);
      assertNotNull(r1.getCarriedBox());
    }

    @Test
    public void carryBoxTest(){
      Robot r1 = new Robot();
      Box b1 = new Box(10);
      assertFalse(r1.carryBox());
      r1.take(b1);
      assertTrue(r1.carryBox());

    }

    @Test
    public void putOnTestWhenOk(){
      Robot r1 = new Robot();
      Box b1 = new Box(10);
      ConveyerBelt belt = new ConveyerBelt(15);
      r1.take(b1);
      assertEquals("ok",r1.putOn(belt));
      assertTrue(!(r1.carryBox()));
    }

    @Test
    public void putOnTestWhenNoCarryingBox(){
      Robot r1 = new Robot();
      ConveyerBelt belt = new ConveyerBelt(15);
      assertEquals("no box",r1.putOn(belt));
    }
    @Test
    public void putOnWhenBeltIsFull(){
      Robot r1 = new Robot();
      Robot r2 = new Robot();
      Robot r3 = new Robot();
      Box b1 = new Box(10);
      Box b2 = new Box(10);
      Box b3 = new Box(10);
      ConveyerBelt belt  = new ConveyerBelt(20);
      r1.take(b1); r2.take(b2);r3.take(b3);
      r1.putOn(belt); r2.putOn(belt);
      assertEquals("belt full",r3.putOn(belt));
    }

    @Test
    public void putOnWhenBoxTooHeavy(){
      Robot r1 = new Robot();
      Box b1 = new Box(20);
      ConveyerBelt belt = new ConveyerBelt(10);
      r1.take(b1);
      assertEquals("box too heavy", r1.putOn(belt));
    }
    public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(RoboTest.class);
  }

}
