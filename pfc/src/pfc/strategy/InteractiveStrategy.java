package pfc.strategy;
import pfc.*;

public class InteractiveStrategy implements Strategy {
  private Shape shape;

  public InteractiveStrategy (Shape shape){
    this.shape=shape;
  }
   public Shape getShape(){
     return this.shape;
  }

}
