/**
 * Module : battleship
 * Filename : Game.java
 * Authors : AKPOLI Espero/COULIBALI Ivette
 * Date : 21/03/2019
 */
package battleship;
import io.*;
import battleship.util.*;



public class Game{
  /*
  * sea is the Board Game
  */
  private Sea sea;
  /*
  *Creator of the Game
  */
  public Game(Sea sea){
    this.sea = sea;
  }

  public void play(int X, int Y){
    String result ="Résultat du tir: ";
    try {
      Answer reponse = this.sea.getCell(new Position(X,Y)).shoot();
      result += reponse;
      System.out.println(result);
    }catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("\n======================Message Erreur=================");
      System.out.println("\nUn au moins des coordonnées entrées dépasse les limites du plateau ");
      System.out.println("\n Nous vous rappellons que :");
      System.out.println("\n 1- L'abscisse du tir doit être comprise entre 0 et "+this.sea.getWidh());
      System.out.println("\n 2- L\'ordonnée du tir doit être comprise entre 0 et "+this.sea.getHeigth());
      System.out.println("\n===================End Message Erreur================");
    }

  }

}
