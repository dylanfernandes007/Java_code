package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ResizeWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ant902879\\bqurious\\sellibs\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
		  //Opening google.com
		driver.get("https://google.com");
		Dimension d = new Dimension(300,400);
     	//Resize current window to the set dimension
     	   driver.manage().window().setSize(d);
     	        
	//driver.manage().window().setSize(null);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
	}
}
