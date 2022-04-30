package pack1;
import pack1.util.*;
import io.*;
public class Game{
    private Sea plateau;
    public Game(Sea plateau){
        this.plateau = plateau;
    }
    public Answer shoot(){
        while (plateau.getLifePoints()>0){
            int line;
            int colomne;
            try{
		plateau.display(true);
                System.out.print("Veuillez entre le nombre de ligne: ");
                line = Input.readInt();
                System.out.print(" Veuillez entrer le nombbre de colonne : ");
                colomne = Input.readInt();
                Position pos = new Position(colomne,line);
                Cell cell = this.plateau.getCellPosition(pos);
                Answer anwering =cell.hit();
                plateau.display(true);
                System.out.println(answering);
            }
            catch (Exception e) {
                System.out.println("Il est probabble que vous ayez taper une mauvaise données ");
                return this.shoot();
        }
    }
    return Answer.MISSED;
}
}
