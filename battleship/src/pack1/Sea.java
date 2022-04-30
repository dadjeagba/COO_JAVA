package pack1;
import pack1.util.*;

public class Sea{


  private Cell[][] board;
  private final int width;
  private final int height;
  private int lifePoints;



  public  Sea(int width ,int height){
    this.board=new Cell[width][height];
    for (int i=0;i<width;i++){
      for (int j=0;j<height;j++){
        this.board[i][j]=new Cell();
      }
    }
  }
  /**
  *returns the Cell at position p
  *@param p Position :position of the Cell
  *@return Cell
  */
  public Cell getCellPosition(Position p){
    return this.board[p.getY()][p.getX()];
  }
  /**

  *@param p Position :the position of the cell to be attacked
  *@return Answer
  *@throws ArrayIndexOutOfBoundsException if the position p is invalid
  */
  public Answer shoot(Position p) throws ArrayIndexOutOfBoundsException{
    try{
      Cell cell=this.getCellPosition(p);
      Answer ans= cell.hit();
      if (ans!=Answer.MISSED){
        this.lifePoints--;
      }
      return ans;
    }catch(Exception e){
      throw new ArrayIndexOutOfBoundsException("Coodonnées non valides");
    }
  }
  /**
   * returns the total life points of ships in the sea
   * @return int
   */
  public int getLifePoints(){
    return this.lifePoints;
  }
    /**
    *placing of the ship vertically
    *@param ship Ship :ship toplace in the game
    *@param p Position :position in which placed
    * @throws IllegalStateException verification f outside for some cell when trying to place

    */
    public void addShipVertically(Ship ship,Position p)throws IllegalStateException{
      if ((p.getX()>this.width||p.getY()>this.height)||(p.getY()+ship.getLength()>this.height)){
        throw new IllegalStateException("Impossible de placer dans cette Position");
      }
      else{
        int length=ship.getLength();
        this.lifePoints+=ship.getLifePoints();
        for(int i=p.getY();length-->0;i++){
          Position pos=new Position(p.getX(),i);
          if (this.getCellPosition(pos).getShip()!=null)throw new IllegalStateException("Impossible de la placer à cette position");
          else{
            this.getCellPosition(pos).setShip(ship);
          }
        }
        }
      }
    /**
    *same comment about addShipVertically
    */
    public void addShipHorizontally(Ship ship ,Position p) throws IllegalStateException{
      if ((p.getX()>this.width||p.getY()>this.height)||(p.getX()+ship.getLength()>this.height)){
        throw new IllegalStateException("debordement de de la taille");
      }
      else{
        this.lifePoints+=ship.getLifePoints();
        int length=ship.getLength();
        for(int i=p.getX();length-->0;i++){
          Position p1=new Position(i,p.getY());
          if (this.getCellPosition(p1).getShip()!=null)throw new IllegalStateException("debordement de la taille");
          else{
            this.getCellPosition(p1).setShip(ship);
          }
        }
        }
    }
    /** displaying 
    * @param defender

    */
    public void display(boolean defender){
      for (int i=0;i<this.height;i++){
        for (int j=0;j<this.width;j++){
          System.out.print(this.board[i][j].getCharacter(defender));
        }
        System.out.print("\n");
      }
    }
  }
