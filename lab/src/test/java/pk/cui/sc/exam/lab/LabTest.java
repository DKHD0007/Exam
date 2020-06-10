package pk.cui.sc.exam.lab;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.ZoneId;

import org.junit.Test;

public class LabTest {
	


	@Test
	public static void fahrenheitToCentigradeTest(int fahrenheit) {  
		assertEquals(4,Lab.fahrenheitToCentigrade(40));
		}
	
	@Test
	public static void centigradeToFahrenheit(int centigrade) {  
		assertEquals(39,Lab.centigradeToFahrenheit(5));
		} 
	
	@Test
	public static void removeSignOfExclaimation(String in){ 
		
		assertEquals("",Lab.removeSignOfExclaimation("!"));
}

	@Test
	public static void getCurrentDay(){ 
		
		assertEquals(10,Lab.getCurrentDay());
		
		}
	@Test
	public static void getCurrentMonth(){ 
		assertEquals(6,Lab.getCurrentMonth());
		}
	
	@Test
	public static void getCurrentYear(){ 
		assertEquals(2020,Lab.getCurrentYear());
		}
	
	
}