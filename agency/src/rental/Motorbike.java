package rental;

class Motorbike extends Vehicle{


  private int cylindree ;

  public Motorbike(String brand, String model, int productionYear, float dailyRentalPrice,int cylindree){
    super(brand,model,productionYear,dailyRentalPrice);
    this.cylindree = cylindree;
  }

  public int getNumberCylindre(){
    return this.cylindree;
  }
  public String toString(){
    return super.toString()+ " " + this.cylindree;
  }



}
