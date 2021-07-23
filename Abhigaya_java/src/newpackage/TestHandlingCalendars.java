package newpackage;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestHandlingCalendars {


	static int targetDay = 0,//global variables 
			targetMonth = 0,//inside class but outside the main method
			targetYear = 0;
	
	static int currentDay = 0,//these variables are mentioned in the getCurrentDateMonthAndYear method 
			currentMonth = 0,
			currentYear = 0;
	
	static int jumpMonthsBy=0;
	
	static boolean increment = true;   //incrementer
	
	
	public static void main(String[] args) throws InterruptedException {


		
		/*
		 * 
		 * target day, month, year
		 * current day, month, year
		 * jump to the month
		 * increment or decrement
		 */
		
		
		String dateToSet= "14/01/2015"; // this is the target date
		
		//get current date
		getCurrentDateMonthAndYear();// method to calculate current year and date
		System.out.println(currentDay+"   "+currentMonth+"   "+currentYear);//print currentdate, month and year
		
		//get target date
		GetTargetDateMonthAndYear(dateToSet);    // method to calculate target year and date
		System.out.println(targetDay+"   "+targetMonth+"   "+targetYear);  // the space gives space between dd and mm
		
		
		//Get Jump month
		CalculateHowManyMonthsToJump();
		System.out.println(jumpMonthsBy);
		System.out.println(increment);
		 WebDriver driver;
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\ant902879\\bqurious\\sellibs\\geckodriver.exe");
         
		 driver = new FirefoxDriver();
		driver.get("http://qa.way2automation.com/datepicker/default1.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();// when u click on the date of the calendar
		
		
		
		for(int i=0; i<jumpMonthsBy;i++){
			
			if(increment){// if true
				
				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]")).click();// arrow of the calendar to go ahead
				
			}else{
				
				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[1]")).click();// arrow of the calendar to go backward
				
			}
			
			Thread.sleep(1000);// so we can see automation at run time
			
		}
	
		driver.findElement(By.linkText(Integer.toString(targetDay))).click();//linktext only accepts string so have to convert
		// to click on the target day, linktext u will get from target day above
		

	}
	
	
	
	public static void getCurrentDateMonthAndYear(){  // method to calculate current year and date
		
		Calendar cal = Calendar.getInstance();  //this is the internal class
		
		currentDay = cal.get(Calendar.DAY_OF_MONTH);  // current day of the month
		currentMonth = cal.get(Calendar.MONTH)+1;
		currentYear = cal.get(Calendar.YEAR);        
		
		
		
	}
	
	
	public static void GetTargetDateMonthAndYear(String dateString)
	{
		
		
		int firstIndex = dateString.indexOf("/");   //  14/01/2015 // firstIndex=2
		int lastIndex  = dateString.lastIndexOf("/");     //lastIndexOf=5
		
		String day = dateString.substring(0, firstIndex);//since date starts from 0 to 16  (0,2)
		targetDay = Integer.parseInt(day);  //convert into integer    //        14/
		
		
		String month = dateString.substring(firstIndex+1, lastIndex);// since month comes after date and slash (3,5)
		targetMonth = Integer.parseInt(month);      //         01/
		
		
		String year = dateString.substring(lastIndex+1, dateString.length());  // (6,9)  dateString.length =9
		targetYear = Integer.parseInt(year);     //     2015
		
	}
	
	
	public static void CalculateHowManyMonthsToJump(){
		
		if((targetMonth-currentMonth)>0){
			
			jumpMonthsBy = (targetMonth-currentMonth);
		}else{
			
			jumpMonthsBy = (currentMonth-targetMonth);
			increment = false;   //because its decrement
		}
		
		
	}

}
