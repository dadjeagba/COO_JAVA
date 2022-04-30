/**
 * Module : battleship
 * Filename : main.java
 * Authors : AKPOLI Espero/COULIBALI Ivette
 * Date : 21/03/2019
 */
package battleship;
import battleship.util.*;
import io.*;


public class main{

  public static void main(String[] args) {


    //creation du plateau de jeu
    Sea sea = new Sea(10,10);

    // ajoue des bateaux au plateau de jeu
    sea.addShipHorizontally(new Ship(2),new Position(0,0));
    sea.addShipHorizontally(new Ship(3),new Position(1,1));
    sea.addShipVertically(new Ship(2),new Position(2,2));
    sea.addShipVertically(new Ship(3),new Position(3,3));
    sea.addShipHorizontally(new Ship(5),new Position(5,5));

    Game g = new Game(sea);
    System.out.println("=============================================");
    System.out.println("============BattleShip GAME Begin============");
    System.out.println("=============================================\n");

    while (sea.getLifePointOfAllShip()!=0) {
      sea.display(false);
      int userX;
      int userY;
      try {
        System.out.print(" Merci d'enter l'absiscice de la position du tir (entier entre 0 et "+sea.getWidh()+") : ? ");
        userX = Input.readInt();
        System.out.print(" Merci d'enter l'ordonnee de la position du tir (entier entre 0 et "+sea.getHeigth()+") : ? ");
        userY = Input.readInt();
        g.play(userX,userY);
      } catch (java.io.IOException e) {
        userX = 0;
        userY = 0;
        System.out.println("\n======================Message Erreur=================");
        System.out.println("\nVous venez d'entrer une donnée incorrecte");
        System.out.println("\n Nous vous rappellons qu'il faut rentrer des nombres ! :");
        System.out.println("\n 1- L'abscisse du tir doit être comprise entre 0 et "+sea.getWidh());
        System.out.println("\n 2- L\'ordonnée du tir doit être comprise entre 0 et "+sea.getHeigth());
        System.out.println("\n===================End Message Erreur================");

      }


    }
    if(sea.getLifePointOfAllShip()==0){
      System.out.println("=============================================");
      System.out.println("====== BRAVO TOUS LES BATEAUX COULES ========");
      System.out.println("============END BattleShip GAME==============");
      System.out.println("=============================================");
    }
  } // methode main

} // end main
