/**
 * Module : battleship
 * Filename : Sea.java
 * Authors : AKPOLI Espero/COULIBALI Ivette
 * Date : 21/03/2019
 */
package battleship;
import battleship.util.*;



public class Sea{


  /* the heigth of the sea*/
  private int heigth;
    /* the width of the sea*/
  private int width;
    /* the content of the sea*/
  private Cell tab[][];

  /**
  *
  *Creator of the Board Game
  *@param heigth of the of the board
  *@param width of the of the board
  */
  public Sea(int heigth,int width) throws IllegalArgumentException{
    this.heigth = heigth;
    this.width = width;
    if (heigth<=0 || width<=0){
      throw new IllegalArgumentException("Desolé , aucun des 2 paramètres ne doit pas etre negatif.\nMerci d'entrer des paramètres strictement positifs.");
    }
    else{
      tab = new Cell[heigth][width];
      for(int i=0; i<heigth;i++){
        for(int j=0; j<width;j++){
          tab[i][j]= new Cell();
        }
      }
    }
  }

  /**
	*getter of the width of Sea
	* @return int : the width of Sea
	*/
  public int getWidh(){
    return this.width;
  }

  /**
	*getter of the heigth of Sea
	* @return int : the heigth of Sea
	*/
  public int getHeigth(){
    return this.heigth;
  }

  /**
	*getter of Cell in the position p
  *@param p : the position of the desired cell
	* @return Cell : the Cell in the position p
	*/
  public Cell getCell(Position p){
    return tab[p.getX()][p.getY()];
  }


/**
* give the answer
*@param p the position of the game board
*@return the answer on the shoot
*@throws ArrayIndexOutOfBoundsException : if the position in parameter exceeds the limits of the plateau
*/
 public Answer shoot(Position p) throws ArrayIndexOutOfBoundsException{
     return this.getCell(p).shoot();
 }




/**
* displays ...
*@param defender the player
*/
public void display(boolean defender){
  for (int i=0; i<this.heigth ; i++ ) {
    //System.out.println("Line : "+i);
    for (int j=0; j<this.width ; j++) {
      this.getCell(new Position(i,j)).getCharater(defender);
    }
    System.out.println();
  }
  System.out.println("------------------END DISPLAY----------------------");
}


  /** add the ship b vertically down from position p. The number of
  *
  cells is determined by the ship length.
  * @param shipToPlace the ship to add
  * @param position the position of the first (top) cell occupied by the ship
  * @throws IllegalStateException if the ship b can not be placed on the sea
  *
  (outside of the board or some cell is not empty)
  */
  public void addShipVertically(Ship shipToPlace, Position position) throws IllegalStateException{
      for (int i= 0; i< shipToPlace.getLifePoints() ; i++ ) {
        if(this.getCell(new Position(position.getX()+i,position.getY())).getShip() != null){
          // impossibilité de pose de du bateau
          throw new IllegalStateException();
        }
      }
      for (int i= 0; i< shipToPlace.getLifePoints() ; i++ ) {
        // possibilité de pose de du bateau
        this.getCell(new Position(position.getX()+i,position.getY())).setShip(new Ship(1));
      }
  }


  /** add the ship b vertically down from position p. The number of
  *
  cells is determined by the ship length.
  * @param shipToPlace the ship to add
  * @param position the position of the first (top) cell occupied by the ship
  * @throws IllegalStateException if the ship b can not be placed on the sea
  *
  (outside of the board or some cell is not empty)
  */
  public void addShipHorizontally(Ship shipToPlace, Position position) throws IllegalStateException{
      for (int i= 0; i< shipToPlace.getLifePoints() ; i++ ) {
        if(this.getCell(new Position(position.getX(),position.getY()+i)).getShip() != null){
          // impossibilité de pose du bateau (case non vide)
          throw new IllegalStateException();
        }
      }
      for (int i= 0; i< shipToPlace.getLifePoints() ; i++ ) {
        // possibilité de pose de du bateau
        this.getCell(new Position(position.getX(),position.getY()+i)).setShip(new Ship(1));
      }
  }

/**
*give th elife point of all ship
*@return the life point of all ship
*/
public int getLifePointOfAllShip(){
  int result=0;
  for (int i=0; i<heigth ; i++ ) {
    for (int j=0; j<width ; j++) {
      if(this.getCell(new Position(i,j)).getShip() != null)
        result += this.getCell(new Position(i,j)).getShip().getLifePoints();
    }
  }
  return result;
}


}
