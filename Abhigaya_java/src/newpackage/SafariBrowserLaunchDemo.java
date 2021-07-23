package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariBrowserLaunchDemo {
	 
    public static void main(String[] args) {
         
        //Creating a driver object referencing WebDriver interface
        WebDriver driver;
     
        //Instantiating driver object with SafariDriver
        driver = new SafariDriver();
         
        //Using get() method to open a webpage
        driver.get("http://artoftesting.com");
         
        //Closing the browser
       // driver.quit();
  
    }
  
}
