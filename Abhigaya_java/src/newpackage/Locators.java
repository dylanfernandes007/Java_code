package newpackage;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {
	   public static void main(String[] args) {

	//Launching Firefox browser
		   System.setProperty("webdriver.gecko.driver", "C:\\Users\\ant902879\\bqurious\\sellibs\\geckodriver.exe");
		      WebDriver driver = new FirefoxDriver();
	
	 
	//Opening google.com
	driver.get("http://www.google.com");
	 
	//Initializing webelement searchBox
	//WebElement searchBox = driver.findElement(By.name("q"));
	 
	//Writing a text "ArtOfTesting" in the search box
//	searchBox.sendKeys("ArtOfTesting");
}
}