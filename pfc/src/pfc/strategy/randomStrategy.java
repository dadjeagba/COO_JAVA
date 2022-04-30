package pfc.strategy;
import pfc.*;

public class randomStrategy implements Strategy {

  public Shape getShape(){
    return Shape.randomShape();
  }

}
