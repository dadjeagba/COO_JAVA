import static org.junit.Assert.*;

import org.junit.Test;
import date;

public class DateTest {

	@Test
	public void tomorrowWhenOrdinaryCase() {
		Date d = new Date(11, Month.february, 2020);
		Date e = new Date(12, Month.february, 2020);
		assertEquals(d.tomorrow() , e);
	}
	@Test
	public void differenceInDayswhen()
	{
		Date d = new Date(11, Month.february, 2020);
		Date e = new Date(12, Month.february, 2020);
		assertTrue(d.isBefore(e));
	}
	@Test
	public void nDaysLaterThisDayWhen(){
		Date d = new Date(11, Month.february, 2020);
		Date e = new Date(12, Month.february, 2020);
		assertTrue(e.isAfter(d));
	}
	@Test
	public void thisDayIsequalsToAnotherWhen(){
		Date d = new Date(11, Month.february, 2020);

		Date e = new Date(11, Month.february, 2020);
		assertEquals(d.equals(e));
	}
// ---Pour permettre l'exécution des test----------------------
public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(DateTest.class);
}


}
