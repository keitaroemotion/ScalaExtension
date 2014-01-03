package Test

import org.junit._
import com.Kei._

class DateXTest {
	@Test def sample{
			println("longdate: "+new DateX().popDateLong)
	}
	var d = new DateX
	
	
	
	@Test def popYearTest{
			println("Year | "+d.Year)
	}
	@Test def popMonthTest{
			println("Month | "+d.Month)
	}
	@Test def popDayTest{
			println("Day | "+d.Day)
	}
	@Test def popHourTest{
			println("Hour | "+d.Hour)
	}
	@Test def popMinuteTest{
			println("MInute | "+d.Minute)
	}
	@Test def popSecondTest{
			println("Second | "+d.Second)
	}
}