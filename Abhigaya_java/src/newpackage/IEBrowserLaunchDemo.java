package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserLaunchDemo {
	 
    public static void main(String[] args) {
         
        //Creating a driver object referencing WebDriver interface
        WebDriver driver;
         
        //Setting the webdriver.ie.driver property to its executable's location
        System.setProperty("webdriver.ie.driver", "C:\\Users\\ant902879\\bqurious\\sellibs\\IEDriverServer.exe");
     
        //Instantiating driver object
        driver = new InternetExplorerDriver();
         
        //Using get() method to open a webpage
        driver.get("http://artoftesting.com");
         
        //Closing the browser
        //driver.quit();
    }
    }