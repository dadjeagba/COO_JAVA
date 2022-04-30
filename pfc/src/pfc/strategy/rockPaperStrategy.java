package pfc.strategy;
import pfc.*;

public class rockPaperStrategy implements Strategy {
  private boolean rock;

  public rockPaperStrategy(boolean rock){
    this.rock=rock;
  }

  public Shape getShape(){
    if (this.rock){
      return Shape.ROCK;
    }
    return Shape.PAPER;
  }

}
