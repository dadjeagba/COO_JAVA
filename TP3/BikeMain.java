public class BikeMain{
public static void main(String[] arg){
	Bike boo1 = new Bike("boo1", BikeModel.CLASSICAL );
	Bike boo2 = new Bike("boo2",BikeModel.ELECTRIC);

	if (boo1.equals(boo2)) System.out.println("Ils sont égaux");
	else
	System.out.println("Ils sont different");
	System.out.println("La description du premier vélo est " + boo1.toString() + "Et son prix est = " +Bike.price);

}
}
