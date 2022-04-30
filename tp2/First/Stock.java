
/**
 * Write a description of class Stock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Stock
{
private int quantity;


public Stock () {
this.quantity = 0 ;
}
/**
 * 
 * Retourne la quantite de marchandise en stock
 * @return int
 */
public int getQuantity () {
return this.quantity ;
}
/**
 * Permet d'augmenter le stock actuel
 * @param int n le nombre à ajouter
 */
public void add(int n){
this.quantity += n;
}

/**
 * permet de retirer une certaine quantité dans le stock
 * @ param int n le nombre a retirer
 */
public void remove(int n){
    if (this.quantity<n){
    this.quantity =0;
}
    else this.quantity-=n;
}

public String toString(){
return "the stock's quantity is "+ this.quantity; 
}
public Stock (int n) {
this.quantity =n;}






}
