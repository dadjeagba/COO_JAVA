package rental;

class Car extends Vehicle{


  private int number_passenger;

  public Car(String brand, String model, int productionYear, float dailyRentalPrice,int number_passenger){
    super(brand,model,productionYear,dailyRentalPrice);
    this.number_passenger = number_passenger;
  }

  public int getNumberPassengers(){
    return this.number_passenger;
  }
  public String toString(){
    return super.toString()+ " " + this.number_passenger;
  }



}
