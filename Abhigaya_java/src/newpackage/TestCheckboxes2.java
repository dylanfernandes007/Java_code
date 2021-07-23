package newpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCheckboxes2 {
public static WebDriver driver;
public static boolean isElementPresent (String locator) {
   	 try {
   		    driver.findElement(By.xpath(locator));
   		     return true;
   	 }
   	 catch (Throwable t) {
   		return false; 
   	 }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ant902879\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	        WebDriver driver= driver = new ChromeDriver();
	        driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        //best and most optimized way
	        WebElement block = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));// only for that box
	    List <WebElement> checkboxes=block.findElements(By.name("sports"));// name sports is there for all the  4 options
	    System.out.println("Total checkboxes are :" +checkboxes.size());
	    for (WebElement checkbox:checkboxes) {
	    	checkbox.click();
	    }
	        
	        
	}

}
