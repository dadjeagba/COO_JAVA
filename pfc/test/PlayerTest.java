/**

 * Filename :TestGame.java
 * Authors : AKPOLI Espero/AGBA Pascal Sébastien
 * Date : 22/03/2020
 */
import org.junit.*;
import static org.junit.Assert.*;

import pfc.*;
import pfc.strategy.*;
public class PlayerTest {

    @Test
    public void testCreationPlayer(){
        Player p1 = new Player("toto",new paperStrategy());
        assertNotNull(p1);
        assertEquals("toto",p1.getName());
        assertEquals(0, p1.getPoints());
    }
    @Test
    public void testAddPoints(){
        Player p1 = new Player("toto",new paperStrategy());
        assertEquals(0,p1.getPoints());
        p1.addPoints(2);
        assertEquals(2,p1.getPoints());

    }

    @Test
    public void testPlay(){
        Player p1 = new Player("toto",new paperStrategy());
        assertEquals(Shape.PAPER, p1.play());
        Player p2 = new Player("tata",new rockPaperStrategy(true));
        assertEquals(Shape.ROCK, p2.play());
        Player p3 = new Player("maman",new rockPaperStrategy(false));
        assertEquals(Shape.PAPER, p3.play());
    }






    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(PlayerTest.class);
    }
}
