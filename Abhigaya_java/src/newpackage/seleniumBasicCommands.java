package newpackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import org.testng.annotations.Test;
 
public class seleniumBasicCommands {
     
public static void main(String Args[]) throws InterruptedException{
         
    //Create Firefox driver's instance
	WebDriver driver = new FirefoxDriver();
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\ant902879\\bqurious\\sellibs\\geckodriver.exe");
                 
    //Set implicit wait of 10 seconds
    //This is required for managing waits in selenium webdriver
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
    //Launch sampleSiteForSelenium
    driver.get("https://artoftesting.com/sampleSiteForSelenium");
                 
    //Fetch the text "This is sample text!" and print it on console
    //Use the id of the div to locate it and then fecth text using getText() method
    String sampleText = driver.findElement(By.id("idOfDiv")).getText();
    System.out.println(sampleText);
         
    //Waiting for 3 seconds just for user to efficiently check automation
    //Its not mandatory though
    Thread.sleep(3000);
         
    //Using linkText locator to find the link and then using click() to click on it
    driver.findElement(By.linkText("This is a link")).click();
         
    Thread.sleep(3000);
     
    //Finding textbox using id locator and then using send keys to write in it
    driver.findElement(By.id("fname")).sendKeys("Kuldeep Rana");
         
    Thread.sleep(3000);
     
    //Clear the text written in the textbox
    driver.findElement(By.id("fname")).clear();
         
    Thread.sleep(3000);
     
    //Clicking on button using click() command
    driver.findElement(By.id("idOfButton")).click();
         
    Thread.sleep(3000);
         
    //Find radio button by name and check it using click() function
    driver.findElement(By.name("male")).click();
         
    Thread.sleep(3000);
         
    //Find checkbox by cssSelector and check it using click() function
    driver.findElement(By.cssSelector("input.Automation")).click();
             
    Thread.sleep(3000);
         
    //Using Select class for for selecting value from dropdown
    Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
    dropdown.selectByVisibleText("Database Testing");
         
    Thread.sleep(50000);
     
    //Close the browser
    driver.close();
 
    }
     
}