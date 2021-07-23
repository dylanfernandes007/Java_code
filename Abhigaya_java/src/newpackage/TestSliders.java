package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ant902879\\bqurious\\sellibs\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
		  //Opening google.com
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		WebElement mainSlider = driver.findElement(By.id("slider"));// be careful this is "id" not xpath
		int width= mainSlider.getSize().width/2;
		WebElement slider= driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		new Actions(driver).dragAndDropBy(slider, width, 0).perform();// exactly in the middle of the slider
	
		//new Actions(driver).dragAndDropBy(slider, 400, 0).perform(); //when only by 400 pixels
	}
}


