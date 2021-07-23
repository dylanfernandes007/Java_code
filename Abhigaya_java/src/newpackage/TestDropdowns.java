package newpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	        //Setting the webdriver.chrome.driver property to its executable's location
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ant902879\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	        WebDriver driver= driver = new ChromeDriver();
	         
	       
	        //Using get() method to open a webpage
	       // driver.get("http://way2automation.com/way2auto_jquery/index.php");
	        driver.get("https://www.wikipedia.org/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// if element found in 1 sec, it wont wait till 10 secs
	   //  driver.findElement(By.name("country")).sendKeys("Germany");
	      //  driver.findElement(By.id("searchLanguage")).sendKeys("Eesti");
	WebElement dropdown =  driver.findElement(By.id("searchLanguage"));
	     
	     Select select= new Select(dropdown);
	    select.selectByValue("hi");
	     //select.selectByIndex(0);
	     //select.selectByVisibleText("hi");
	List <WebElement> values = driver.findElements(By.tagName("option"));//option is tagname//dropdown
	System.out.println("Toal values are: " +values.size());
	System.out.println(values.get(7).getText());// 0 -size -1 (61-1=60)
	for(int i=0;i<values.size();i++) {   // to print all the values
		System.out.println(values.get(i).getAttribute("lang"));// lang is attribute
	}
		
	     List <WebElement> links = driver.findElements(By.tagName("a"));
	     System.out.println("----Printing links-----");
	     System.out.println("Total links are:" +links.size());
	     
	     for(WebElement link:links) {
	    	System.out.println(link.getText()+ "--URL is --" + link.getAttribute("href")); ;
	     }
 	}

}
