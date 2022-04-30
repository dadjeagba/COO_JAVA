package pfc;
import pfc.strategy.*;
import io.*;

public class main {
  public static void main(String[] args) {
    int nbRounds=5;
    try {
      nbRounds = Integer.parseInt(args[0]);
    }catch (Exception e) {
      System.out.println("------------------------");
      System.out.println("Vous n'avez pas tapé sur la ligne de commande le nombre de tour à jouer.\nLe nombre de tours par défaut est alors de 5.");
      System.out.println("Pour personnaliser le nombre de tour à jouer, vous pouvez entrer le nombre sur la ligne de commande ");

      System.out.println("------------------------");
    }

    System.out.print(" Entrez votre pseudo : ? ");
    String pseudo = Input.readString();

    int i=0;
    Player Ordinateur = new Player("Ordinateur",new randomStrategy());
    Player joueur = new Player(pseudo,new randomStrategy());
    Game game = new Game(joueur,Ordinateur);
    game.play(nbRounds,false); // jouer une partie avec l'ordinateur
  }

}
