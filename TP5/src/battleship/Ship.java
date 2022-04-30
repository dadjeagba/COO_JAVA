/**
 * Module : battleship
 * Filename : Ship.java
 * Authors : AKPOLI Espero/COULIBALI Ivette
 * Date : 21/03/2019
 */
package battleship;


public class Ship{

  /* the life point of Ship */
  private int lifePoints;

  /**
	* Creator of the ship
  *@param lifePoints: the life point of Ship
	*/
  public Ship(int lifePoints){
    this.lifePoints = lifePoints;
  }

  /**
	* give the life point of ship
	* @return the life point
	*/
  public int getLifePoints(){
    return lifePoints;
  }

  /**
  *decreases the life point if the ship is hit
  */
  public void hit(){
    if(this.lifePoints>0){
      this.lifePoints--;
    }
  }

  /**
  *State of the current ship
  *@return boolean: true the ship of the current cell is sunk
  */
  public boolean sunk(){
    return this.lifePoints==0;
  }


  /**
  *State of the current ship
  *@return boolean: true, if current ship is not defined
  */
  public boolean missed (){
    return this == null;
  }
}
