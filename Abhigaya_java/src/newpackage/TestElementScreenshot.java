package newpackage;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestElementScreenshot {

	public static void captureScreenshot() throws IOException {//creating a utility method
		Date d = new Date(); //from timestamp class
		
String fileName = (d.toString().replace(":", "_").replace(" ", "_")+".jpg");// replacing colon and space
 //File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);//file is from java.io// will return a file
//	 FileUtils.copyFile(screenshot, new File(".//screenshot3//" +fileName)); //filename from 2 lines above
		//  FileUtils.copyFile(screenshot, new File(".//screenshot//error.jpg"));
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ant902879\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		   WebDriver  driver = new ChromeDriver();
			  //Opening google.com
			driver.get("http://google.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
