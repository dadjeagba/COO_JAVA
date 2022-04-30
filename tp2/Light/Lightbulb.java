
/**
 * Write a description of class Lightbulb here.
 *
 * @author AGBA Pascal
 * @version (a version number or a date)
 */
public class Lightbulb
{
   private boolean state;
   private int power;
   private String color;

   /**
    * Crée une ampoule éteinte
    *
    * @param power puissance de l'ampoule
    * @param color couleur de l'ampoule
    */
   public Lightbulb(int power, String color){
       this.state=false;
       this.color=color;
       this.power=power;
    }
   /**
    * Donne l'état de l'ampoule (ON/OFF)
    *
    * @return l'etat de l'ampoule
    */
   public boolean getState(){
       return this.state;
   }
   /**
    * donne la couleur de l'ampoule
    *
    * @return couleur de l'ampoule
    */
   public String getColor(){
       return this.color;
   }
   /**
    * donne la puissance de l'ampoule
    *
    * @return la puissance de l'ampoule
    */
   public int getPower(){
       return this.power;
   }
   /**
    * Allume l'ampoule
    */
   public void turnOn(){
       this.state=true;
   }
   /**
    * Eteint l'ampoule
    */
   public void turnOff(){
       this.state=false;
   }
   /**
    * donne une chaine de caractere decrivant l'etat de l'ampoule
    *
    * @return une chaine donnant l'etat de l'ampoule
    */
   public String toString(){
       if (this.state){
           return "L'ampoule est allumée, sa couleur est "+this.color+" et sa puissance est de "+this.power;
        }
        else{
           return "L'ampoule est éteinte, sa couleur est "+this.color+" et sa puissance est de "+this.power;
        }
   }
}
