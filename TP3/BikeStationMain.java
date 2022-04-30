public class BikeStationMain{

public static void main(String[] args){

   BikeStation st = new BikeStation("timoleon",10);
   Bike b1 = new Bike("boo1",BikeModel.CLASSICAL);
   Bike b2 = new Bike("boo2",BikeModel.ELECTRIC);

st.getName();
 int n;
 n=st.getNumberOfBikes();
  //System.out.println(n);

    st.dropBike(b1);
    st.dropBike(b2);
     n=st.getNumberOfBikes();
     //System.out.println(n);
  int b = st.firstFreeSlot();
   //System.out.println(b);
   Bike b3 =st.takeBike(1);
    //System.out.println(b3.toString());

  try {
  int m = Integer.parseInt(args[0]);
  Bike essai = st.takeBike(m);
  if (essai == null) System.out.println("Pas de velo a cet emplacement");

  System.out.println(essai.toString());

}catch(Exception e){

  System.out.println("argument missed");
}
}
}
