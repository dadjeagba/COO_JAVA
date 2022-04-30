/**

 * Filename :TestGame.java
 * Authors : AKPOLI Espero/AGBA Pascal Sébastien
 * Date : 22/03/2020
 */
import org.junit.*;
import static org.junit.Assert.*;

import pfc.*;
import pfc.strategy.*;
public class ShapeTest {

    @Test
    public void testCreationShape(){
      Shape paper = Shape.PAPER;
      assertNotNull(paper);
      Shape rock =  Shape.ROCK;
      assertNotNull(rock);
      Shape scissors = Shape.SCISSORS;
      assertNotNull(scissors);
    }


    @Test
    public void testCompareShape(){
      Shape paper = Shape.PAPER;
      Shape rock = Shape.ROCK;
      Shape scissors = Shape.SCISSORS;
      assertEquals(0,paper.compareShape(paper));
      assertEquals(1,rock.compareShape(scissors));
      assertEquals(-1,scissors.compareShape(rock));
      assertEquals(1,paper.compareShape(rock));
      assertEquals(-1,rock.compareShape(paper));
      assertEquals(1,scissors.compareShape(paper));
      assertEquals(-1,paper.compareShape(scissors));
    }




  // ---Pour permettre l'exécution des test----------------------
  public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(ShapeTest.class);
  }
}
