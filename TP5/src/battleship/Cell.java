/**
 * Module : battleship
 * Filename : Cell.java
 * Authors : AKPOLI Espero/COULIBALI Ivette
 * Date : 21/03/2019
 */
package battleship;



public class Cell{


  /* the ship contained by the cell*/
  private Ship ship;

  /* state of the cell */
  private boolean touch;

  /**
  * Creator of the cell
  */
  public Cell(){
    this.ship = null;
    this.touch = false;
  }

  /**
  * change  the ship's state
  *@param ship : the ship to add to the current cell
  */
  public void setShip(Ship ship){
    this.ship = ship;
  }

  /**
  * getter of ship
  *@return Ship: the ship contained in the current cell
  */
  public Ship getShip(){
    return this.ship;
  }

  /**
  * state of the current cell
  *@return boolean : true if the cell has been touched,false if else
  */
  public boolean isTouched(){
    return this.touch == true;
  }


  /**
  * shoot on a ship and return answer
  *@return Answer : result of the shooting operation on the current cell
  */
  public Answer shoot(){
    if(this.ship == null){
      return Answer.MISSED;
    }else if (this.ship.getLifePoints()>0) {
      this.ship.hit();
      this.touch = true;
      return Answer.HIT;
    }else{
      return Answer.SUNK;
    }
  }


 /**
 * give a character if ship is MISSED or HIT or SUNK
 *@param defender the player
 */
  public void getCharater(boolean defender){
    if(defender){ // defender
      if(this.getShip() == null){ // case vide
        System.out.print(" ~ ");
      }else if (!this.isTouched() && this.getShip() != null) { // case occupée par un bateau
        System.out.print(" B ");
      }else { // bateau coulé
        System.out.print(" * ");
      }
    }else{ // attaquant
      if(this.isTouched() == false){ // case jamais visée
        System.out.print(" . ");
      }else if (this.getShip() == null) { //case visée vide
        System.out.print(" ~ ");
      }else if(this.getShip() != null) { // bat
        System.out.print(" * ");
      }
    }
  }

}
