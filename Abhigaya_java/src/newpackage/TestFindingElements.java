package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFindingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   WebDriver driver;
	         
	        //Setting the webdriver.chrome.driver property to its executable's location
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ant902879\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	     
	        //Instantiating driver object
	        driver = new ChromeDriver();
	         
	        //Using get() method to open a webpage
	        driver.get("http://gmail.com");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// if element found in 1 sec, it wont wait till 10 secs
	        String title=driver.getTitle();
	        driver.findElement(By.cssSelector("#identifierId")).sendKeys("trainer@way2automation.com");;
	       
	       driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/span/span")).click();;
	        System.out.println(driver.getTitle().length());
	        
	}

}
