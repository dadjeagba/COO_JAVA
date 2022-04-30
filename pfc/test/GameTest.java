/**

 * Filename :TestGame.java
 * Authors : AKPOLI Espero/AGBA Pascal Sébastien
 * Date : 22/03/2020
 */
import org.junit.*;
import static org.junit.Assert.*;

import pfc.*;
import pfc.strategy.*;

public class GameTest {

    @Test
    public void testCreation(){
      Player player1 = new Player("player1",new randomStrategy());
      Player player2 = new Player("player2",new randomStrategy());
      Game game = new Game(player1,player2);
      assertNotNull(game);
    }

    @Test
    public void testGivePoint(){
      Player player1 = new Player("player1",new randomStrategy());
      Player player2 = new Player("player2",new randomStrategy());
      Game game = new Game(player1,player2);
      game.givePoint(0);
      assertEquals(1,player1.getPoints());
      assertEquals(1,player2.getPoints());
      game.givePoint(1);
      assertEquals(3,player1.getPoints());
      assertEquals(1,player2.getPoints());
      game.givePoint(-1);
      assertEquals(3,player1.getPoints());
      assertEquals(3,player2.getPoints());
    }

    @Test(expected=IllegalArgumentException.class)
    public void testGivePointIncomeIsIllegalArgument(){
      Player player1 = new Player("player1",new randomStrategy());
      Player player2 = new Player("player2",new randomStrategy());
      Game game = new Game(player1,player2);
      game.givePoint(20);
    }

    @Test
    public void testGiveWinner(){
      Player player1 = new Player("player1",new randomStrategy());
      Player player2 = new Player("player2",new randomStrategy());
      Game game = new Game(player1,player2);
      game.givePoint(0);
      assertEquals(null,game.giveWinner());
      game.givePoint(1);
      assertEquals(player1,game.giveWinner());
      game.givePoint(-1);
      game.givePoint(-1);
      assertEquals(player2,game.giveWinner());
    }


    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(GameTest.class);
    }
  }
