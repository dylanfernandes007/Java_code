package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestKeyboardEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\ant902879\\bqurious\\sellibs\\geckodriver.exe");
	  //  WebDriver driver = new FirefoxDriver();
	    
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ant902879\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	     
        //Instantiating driver object
	    WebDriver    driver = new ChromeDriver();
		  //Opening google.com
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/span/div/div")).click();
	//s	driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		/*Actions action = new Actions(driver);
				action.sendKeys(Keys.ENTER).perform();*/
		Actions action = new Actions(driver);
		//action.sendKeys(Keys.chord(Keys.CONTROL+"a")).perform();// chord is for combination// select all
		//action.sendKeys(Keys.chord(Keys.CONTROL+"a")).build().perform();
	action.sendKeys(Keys.chord(Keys.CONTROL+"a")).sendKeys(Keys.chord(Keys.CONTROL+"c")).build().perform();// chord is for combination// copy all
		//use build when you are combining 2 actions together// select all +copy
		driver.findElement(By.id("identifierId")).click();
		action.sendKeys(Keys.chord(Keys.CONTROL+"v")).build().perform(); //paste all
				
				
	}
}
