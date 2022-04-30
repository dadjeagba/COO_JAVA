package pfc;

public class Player {

	private String name;
	private int points;
	private Strategy myStrategy;

	public Player(String name, Strategy s) {
		this.name = name;
		this.points = 0;
		this.myStrategy = s;
	}
	/**
  *getter of the player's name
  *@return name : the name of the player
  */
	public String getName() {
		return this.name;
	}
	/**
	*  give the informations of the player in string
	*@return string : informations of the player in string
	*/
	public String toString() {
		return "Player " + this.name;
	}
	/**
	*getter of the player's points
	*@return int : the points of the player
	*/
	public int getScore() {
		return this.points;
	}
	/**
  * add the points to the player's points
  * @param points :  the point to add
  */
	public void addPoints(int p) {
		this.points = this.points + p;
	}
	/**
  * give the possibility of the player to have a strategy and play
  * @return the strategy to play
  */
	public Shape play() {
		return this.myStrategy.chooseShape();
	}

}
