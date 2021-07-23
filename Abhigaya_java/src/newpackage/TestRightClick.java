package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestRightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ant902879\\bqurious\\sellibs\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
		  //Opening google.com
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement img=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));
	Actions action= new Actions(driver);
	action.contextClick(img).perform();
	
	// how to do the assignment check. clicking on product info>installation>how to setup
	
	//driver.findElement(By.partialLinkText("Product info")).click();
	//driver.findElement(By.xpath("//*[@id=\"dm2m2i1tdT\"]")).click();
	
	}
}
