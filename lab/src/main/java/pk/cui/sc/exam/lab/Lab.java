package pk.cui.sc.exam.lab;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date; 

public class Lab {
	
	/**
	 * This is a static date object called Today
	 */
	static Date today = new Date();
	
	/**
	 * This method converts fahrenheit To Centigrade 
	 * @param fahrenheit is a value of fahrenheit
	 * @return number with centigrade value
	 */
	
	public static int fahrenheitToCentigrade(int fahrenheit) {  
		return (fahrenheit - 32) * 5 / 9;
		}
	
	/**
	 * This method converts Centigrade To fahrenheit
	 * @param fahrenheit is a value of Centigrade
	 * @return number with fahrenheit value
	 */
	
	public static int centigradeToFahrenheit(int centigrade) {  
		return centigrade * 9 / 5 + 32;
		} 
	
	/**
	 * This method remove Exclaimation Mark
	 * @param String named in to remove from it 
	 * @return removed exclaimation mark String
	 */
	
	public static String removeSignOfExclaimation(String in){ 
		if(in==null||in.length()==0)  
			return in;  
		return in.replaceAll("!", "");
		}
	
	/**
	 * This method gives the current date
	 * @return current date
	 */
	
	public static int getCurrentDay(){ 
		LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();  
		return localDate.getDayOfMonth();
		}
	
	/**
	 * This method gives the current month
	 * @return current month
	 */
	
	public static int getCurrentMonth(){ 
		LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localDate.getMonthValue();
		}
	
	/**
	 * This method gives the current year
	 * @return current year
	 */
	
	public static int getCurrentYear(){ 
		LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localDate.getYear();
		}

}
