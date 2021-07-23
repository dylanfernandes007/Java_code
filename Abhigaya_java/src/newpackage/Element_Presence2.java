package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_Presence2 {

		public static WebDriver driver;
		public static boolean isElementPresent (By by) {// Like String locator
		 /*  	 try {
		   		    driver.findElement(By.xpath(locator));
		   		     return true;
		   	 }
		   	 catch (Throwable t) {
		   		return false; 
		   	 } */
			int size = driver.findElements(by).size();
			if(size==0) {
				return false;
			}else {
				return true;
			}
				}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ant902879\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		        WebDriver driver= driver = new ChromeDriver();
		        driver.get("https://www.wikipedia.org/");
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        
	   System.out.println(driver.findElement(By.xpath("//*[@id=\"js-link-box-en\"]/strong")).isDisplayed());  ;//English link
	//isElementPresent: he is using a diff way of doing it
	   
	 //  System.out.println(isElementPresent(("//*[@id=\"searchLanguage\"]")));// if double quotes then error
	   System.out.println(isElementPresent(By.id("searchLanguage")));// not workin for me? getting error
	   
		}
	}


