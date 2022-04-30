public class DateMain{



public static void main(String[] args) {

    System.out.println("beginning of main from Date");

    Date Lundi = new Date(10,Month.february,2020);
    Date Mardi = new Date(27,Month.january,2019);
    Lundi.equals(Mardi)
    Lundi.isBefore(Mardi);

    Date Mercredi = Mardi.tomorrow();
    Date Jeudi = Lundi.nDaysLater(3);
      System.out.println(Jeudi.isAfter(Mercredi));

      System.out.println(jeudi.differenceInDays(Mardi));
    System.out.println(Mercredi.toString());
    System.out.println("" + Lundi.toString());
  }
}
