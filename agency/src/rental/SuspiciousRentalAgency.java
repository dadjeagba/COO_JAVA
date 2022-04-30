package rental;


class SuspiciousRentalAgency extends RentalAgency {

  private static final int TAUX_SURCOUT = 10;

  public SuspiciousRentalAgency(){
    super();
  }


     public float rentVehicle(Client client, Vehicle v) throws UnknownVehicleException, IllegalStateException {
       // 	TO DO
       System.out.println(client.getAge());
       if(client.getAge() >25){
       return super.rentVehicle(client,v);
     }else {
       return super.rentVehicle(client,v)*(100+TAUX_SURCOUT)/100;
     }
   }




}
