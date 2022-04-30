
/**
 * Classe simulant une guirlande composée d'ampoules
 *
 * @author AGBA Pascal Sébastien
 * @version 29 Janvier 2020
 */
public class LightString
{
    private Lightbulb[] lightstring;
    private boolean state;
    /**
     * Crée une nouvelle guirlande(composée de n ampoules)
     *
     * @param n le nombre d'ampoules sur la guirlande
     */
    public LightString(int n){
        this.state=false;
        this.lightstring=new Lightbulb[n];
        for (int i=0; i<n; i++){
           this.lightstring[i]= new Lightbulb(1,"White");
        }
    }
    /**
     * Permet d'obtenir la 'ieme' ampoule de la guirlande
     *
     * @param i: le numéro de l'ampoule que l'on veut obtenir
     * @return la ieme ampoule de la guirlande
     */
    public Lightbulb getLightbulb(int i){
        if (i <this.lightstring.length){
            return this.lightstring[i-1];
        }
        else{
            return null;
        }
    }
    /**
     * Permet de changer la i eme ampoule
     * Rien ne se passe si i n'est pas valide
     *
     * @param i numéro de l'ampoule que l'on veut changer
     * (la premiere porte le numéro 1)
     * @param newBulb la nouvelle ampoule
     */
    public void changeLightbulb(int i, Lightbulb newBulb){
        if (i<this.lightstring.length){
            this.lightstring[i-1]=newBulb;
        }
    }
    /**
     * Allume la guirlande (effet de bord)
     * Ne fait rien si la guirlande est déja allumée
     */
    public void turnOn(){
        this.state=true;
        for(int i=0; i <this.lightstring.length;i++){
            this.lightstring[i].turnOn();
        }
    }
    /**
     * Eteint la guirlande (effet de bord)
     * Ne fait rien si la guirlande est déja éteinte
     */
    public void turnOff(){
        this.state=false;
        for (int i=0; i <this.lightstring.length;i++){
            this.lightstring[i].turnOff();
        }
    }
    public int getConsumedPower(){
        int count=0;
        if (this.state){
        for (int i=0; i <this.lightstring.length;i++){
            count = count + this.lightstring[i].getPower();
            }
        }
        return count;
    }
}
