package day15_abstract_interface;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*IE is the safest browser, performance is the slowest thats why IEDriver is slowest,govt websites use IE
		//BROWSERS are compatible, sometimes some elements are working on Chrome but not Safari thus we use cross browser testing, as html code or library supports few browsers only
		WebDriver driver=new FirefoxDriver();// in this case method of webdriver is executed if FirefoxDriver is empty
		WebDriver driver=new ChromeDriver();// in this case method of webdriver is executed if ChromeDriver is empty
		driver.sendkeys();
		driver.click();
		*/

	}

}
// why to use abstract methods: in case u forget to override method in child class, so how to make mandatory for developer to add it, so abstract method is used in parent class
/*abstract method: does not contain body
created using abstract keyword
abstract method cannot have body
if class contains abstract method, class must be an abstract class
cannot create object of abstract class coz no use of calling as no body or even interface
abstract method must be overridden by child classes
abs class can have parameters
why multiple inheritance possible in interface: becuase child class will always override parent as there is no body
why multiple inheritance not possible in classes: ambiguity
abstract class can have only non-abstract methods and no abstrct methods(optional)
*/



