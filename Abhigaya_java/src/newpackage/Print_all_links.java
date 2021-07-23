package newpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_all_links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ant902879\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	        WebDriver driver= driver = new ChromeDriver();
	        driver.get("https://www.wikipedia.org/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	       
	    	WebElement dropdown =  driver.findElement(By.id("searchLanguage"));
	    	 Select select= new Select(dropdown);
	    	 List <WebElement> values = dropdown.findElements(By.tagName("option"));//option is tagname//for the dropdown
	    		System.out.println("Toal values are: " +values.size());
	    		
	    		
	    		 WebElement block = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[7]/div[3]"));
	 	        List <WebElement> links1 = block.findElements(By.tagName("a"));  
	 	   //driver is to find throughout the page and block is only inside the block of 12 links

	    		 System.out.println("----Printing links-----");
	    	     System.out.println("Total links are:" +links1.size());
	    	     
	    	     for(WebElement link:links1) {
	    		    	System.out.println(link.getText()+ "--URL is --" + link.getAttribute("href")); ;
	    		     }
	    		
	}
}
