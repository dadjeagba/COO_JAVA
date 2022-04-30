
/**
 * Write a description of class Switch here.
 *Modelisation de Lightbulb
 * @author AGBA Pascal
 * @version (a version number or a date)
 */
public class Switch
{
    private Lightbulb lightbulb;

    public Switch(Lightbulb lightbulb){
        this.lightbulb=lightbulb;
    }
    /**
     * Simule un interrupteur: allume ou éteint l'ampoule
     */
    public void switch_light(){
        if (this.lightbulb.getState()){
            this.lightbulb.turnOff();
        }
        else{
            this.lightbulb.turnOn();
        }
    }
}
