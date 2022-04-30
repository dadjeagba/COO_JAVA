package pfc ;

public class Game {

    private Player p1;
    private Player p2;
    private int nbTours;

    private static final int VICTORY_POINTS = 2;
    private static final int TIE_POINTS = 1;
    /**
    *creator of the game
    *@param player1 the first player of the game
    *@param player2 the second player of the game
    *@param nbTours the numbers of round in this game

    */
    public Game(Player p1, Player p2, int nbTours){
      this.p1=p1;
      this.p2=p2;
      this.nbTours=nbTours;
    }


    /**
    * play a single round of play
    */
    private void playOneRound() {

	    Shape c1 = this.p1.play();
	    Shape c2 = this.p2.play();
      System.out.println(this.p1.getName()+" a joué "+c1.name()+" et "+this.p2.getName()+" a joué "+c2.name());

      if (c2.beats(c1)) {
  	    this.p2.addPoints(Game.VICTORY_POINTS);
        System.out.println(this.p2.getName()+" l'emporte et marque "+Game.VICTORY_POINTS+" points");

  	  } else {if (c1.beats(c2)) {
        this.p1.addPoints(Game.VICTORY_POINTS);
        System.out.println(this.p1.getName()+" l'emporte et marque "+Game.VICTORY_POINTS+" points");

	    } else {

        this.p1.addPoints(Game.TIE_POINTS);
    	  this.p2.addPoints(Game.TIE_POINTS);
        System.out.println("Coup null. "+this.p1.getName()+" marque "+Game.TIE_POINTS+" point et "+this.p2.getName()+" marque "+Game.TIE_POINTS+" point.\n");

	    }
    }
    /**
    * give the winner of the game
    *@return the player who is winner
    */
    public Player play(){
      if (this.player1.getPoints()>this.player2.getPoints()){
        return this.player1;
      }else if(this.player1.getPoints()<this.player2.getPoints()){
        return this.player2;
      }else {
        return null;
      }
    }

}
