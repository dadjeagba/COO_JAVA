/**
 * Module : battleship.util
 * Filename : Position.java
 * Authors : AKPOLI Espero/COULIBALI Ivette
 * Date : 21/03/2019
 */
package battleship.util;

public class Position {
	/**
	* x and y : coordinates of the game board
	*/
	private int x;
	private int y;

	/**
	* Creator of position
	*@param x : the  position x
	*@param y : the position y
	*/
	public Position(int x, int y) {
		this.x = x;
		this.y = y;

	}

	/**
	*getter of the position x
	* @return int : the psition x
	*/
	public int getX() {
		return x;
	}

	/**
	* setter of the position x
	*@param x: the new position x
	*/
	public void setX(int x) {
		this.x = x;
	}
	/**
	*getter of position y
	* @return int : the psition y
	*/
	public int getY() {
		return y;
	}

	/**
	* setterof the position y
	*@param y: the new position y
	*/
	public void setY(int y) {
		this.y = y;
	}

	/**
	* give the postion in string
	* @return the string giving the 2 positions
	*/
  @Override
	public String toString() {
		return "Position [x=" + x + ", y=" + y + "]";
	}

	/**
	* @param obj the object to compare
	* @return true or false the 2 objects are equal or no
	*/
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
