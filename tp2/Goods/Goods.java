
/**
 * Write a description of class Goods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Goods{
 private double value;
 private String name;
 
 // le type du parametre est String
public Goods(String name){
    this.name = name;
    this.value = 0;
}
// double et string sont les types de paramètres 
/**
 *  
 */  
public Goods(double value, String name){
this.value = value;
this.name = name;
}


/**
 * 
 */
public double getValue(){
return this.value;
}


/**
 * 
 */
public void setValue(double value){
this.value = value;
}


/**
 * 
 */ 
public String  getName(){
return this.name;
}  
    

/**
 * 
 */
public void setName(String name){
this.name = name;
} 

/**
 * 
 */
public String toString(){
return "the goods "+this.name+" costs"+ this.value;
} 

/**
 * 
 * 
 */    
public double Price(){
double val = this.getValue();

return val + (val*20/100);
}    













}
