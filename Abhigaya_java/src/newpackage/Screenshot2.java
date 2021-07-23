package newpackage;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Screenshot2 {// for timestamp although not working for me
	public static WebDriver driver;// check what it means
	
	public static void captureScreenshot() throws IOException {//creating a utility method
		Date d = new Date(); //from timestamp class
		
String fileName = (d.toString().replace(":", "_").replace(" ", "_")+".jpg");// replacing colon and space
 File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);//file is from java.io// will return a file
	 FileUtils.copyFile(screenshot, new File(".//screenshot3//" +fileName)); //filename from 2 lines above
		//  FileUtils.copyFile(screenshot, new File(".//screenshot//error.jpg"));
	
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ant902879\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		   WebDriver  driver = new ChromeDriver();
			  //Opening google.com
			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.switchTo().frame("iframeResult"); 
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.id("mySubmit")));//from stackoverflow
			driver.switchTo().defaultContent();// check this
			
			List<WebElement> frames=driver.findElements(By.tagName("iframe"));//to get all the iframes on the page
	//when using list, use findElements and not findElement
	System.out.println(frames.size());// total number of frames
	for(WebElement frame: frames) {
		System.out.println(frame.getAttribute("id"));
		
	}
	captureScreenshot();
}
}

