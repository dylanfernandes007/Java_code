package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ant902879\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	        WebDriver driver= driver = new ChromeDriver();
	        driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        //when checking the boxes individually
	       // driver.findElement(By.xpath("//div[4]/input[1]")).click();// remember double slash
	        //driver.findElement(By.xpath("//div[4]/input[2]")).click();
	        //driver.findElement(By.xpath("//div[4]/input[3]")).click();
	        //driver.findElement(By.xpath("//div[4]/input[4]")).click();
	   /*     
	        $x("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input[1]")
	        $x("//table/tbody/tr/td/div[4]/input[1]")    //will be double slash when not using the full xpath// get one element
	        $x("//tr/td/div[4]/input[1]")    // get one element
	        $x("//div[4]/input[1]")    // this is the last best one to use  // get one element
	        $x("//input[1]")   //from here you will get all the 4 elements

	        ----------------------------
	        $x("//div[4]/input[2]") football
	        $x("//div[4]/input[3]")  baseball
	        $x("//div[4]/input[4]")   basketball
	        */
	        
	        // when checking all the boxes in one code
	        for (int i=1; i<=4;i++) {
	        	driver.findElement(By.xpath("//div[4]/input[" + i + "]")).click();
	        }
	}

}
