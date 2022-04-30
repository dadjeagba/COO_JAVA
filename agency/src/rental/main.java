package rental;

public class main{
  public static void main(String[] args) {
    RentalAgency agency = new RentalAgency();
    System.out.println("----------------- agency -----------------");
    agency.addVehicle(new Vehicle("brand1","model1",2015,50.0f));
    agency.addVehicle(new Motorbike("Motorbike1","model1",2015,100.0f,20));
    agency.addVehicle(new Car("car1","model1",2015,150.0f,5));
    agency.addVehicle(new Vehicle("brand2","model2",2015,200.0f));
    agency.addVehicle(new Motorbike("Motorbike2","model2",2015,250.0f,50));
    agency.addVehicle(new Car("car2","model2",2015,300.0f,6));
    System.out.println("Véhicule de prix de location inférieur à 150 euros : ");
    agency.displaySelection(new MaxPriceFilter(150));
    System.out.println("---------------------------------");
    System.out.println("Véhicule de prix de location inférieur à 300 euros : ");
    agency.displaySelection(new MaxPriceFilter(300));
    System.out.println("---------------------------------");
    AndFilter filter = new AndFilter();
    filter.addFilter(new MaxPriceFilter(300));
    filter.addFilter(new BrandFilter("brand1"));
    System.out.println("Véhicule de prix de location inférieur à 300 euros et de marque \"brand1\" :");
    agency.displaySelection(filter);
    System.out.println("---------------------------------");


    System.out.println("----------------- agency2 -----------------");
    Client c1 = new Client("Paul",26);
    Client c2 = new Client("Jean",21);
    Client c3 = new Client("Robert",12);
    SuspiciousRentalAgency agency2 = new SuspiciousRentalAgency();
    Vehicle vehicle = new Vehicle("brand1","model1",2015,50.0f);
    agency2.addVehicle(vehicle);
    Motorbike motor = new Motorbike("Motorbike1","model2",2015,100.0f,20);
    agency2.addVehicle(motor);
    Car car = new Car("car1","model2",2015,150.0f,5);
    agency2.addVehicle(car);
    agency2.displaySelection(new MaxPriceFilter(550));
    try {
      System.out.println(c1.getName()+" loue "+vehicle.getBrand()+" à : "+agency2.rentVehicle(c1,vehicle));
      System.out.println(c3.getName()+" loue "+motor.getBrand()+" à : "+agency2.rentVehicle(c3,motor));
    }catch(UnknownVehicleException e){
      System.out.println(e.getMessage());
    }catch(IllegalStateException e){
      System.out.println(e.getMessage());
    }
    agency2.displaySelection(new MaxPriceFilter(550));
  }

}
