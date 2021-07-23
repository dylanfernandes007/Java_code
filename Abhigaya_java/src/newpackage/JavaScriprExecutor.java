package newpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriprExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ant902879\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		   WebDriver    driver = new ChromeDriver();
			  //Opening google.com
			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
			
		driver.switchTo().frame("iframeResult");  // after inspecting "on click" function, go up a few lines
			//driver.findElement(By.xpath("/html/body/button")).click();//try it button// use iframe or it will not click
			//((JavascriptExecutor) driver).executeScript("myFunction()"); //use this instead of the above  line
		//myFunction this is mentioned in the console
			JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("myFunction()");// when clicking "try it"
	js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.id("mySubmit")));
	// when clicking "submit the form" button    //type in google "how to highlight an element in javascript selenium"
			//arguments[0].style.border='3px solid red'", elem   // replace "elem" by driver.findElement
			
			
		driver.switchTo().defaultContent();// see when to use this
			
			List<WebElement> frames=driver.findElements(By.tagName("iframe"));//to get all the iframes on the page
	//when using list, use findElements and not findElement
	System.out.println(frames.size());// total number of frames
	for(WebElement frame: frames) {
		System.out.println(frame.getAttribute("id"));
		
	}
				driver.close();
	}
}
