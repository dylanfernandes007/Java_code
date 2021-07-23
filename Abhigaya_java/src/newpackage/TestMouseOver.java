package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestMouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ant902879\\bqurious\\sellibs\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
		  //Opening google.com
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("way2automation");
	WebDriverWait wait = new WebDriverWait(driver,5);//sometimes it wont work but mostly it does
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[2]/form/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]"))).click();
		//driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]")).click();;
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[9]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/a/h3")).click();;
	    
		WebElement menu=driver.findElement(By.xpath("/html/body/div[4]/div/header/div[3]/div/nav/div[2]/ul/li[8]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		driver.findElement(By.linkText("Practice site 1")).click();
		
	}

}
