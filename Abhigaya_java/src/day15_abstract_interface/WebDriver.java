package day15_abstract_interface;

public abstract class WebDriver {// abstract class can have non abstract methods

	
	public abstract void sendkeys();
	public abstract void click();
	public  static void display()
	{
		System.out.println("not abstract");
	}
	/*public void sendkeys(String text)
	{
		System.out.println("sendkeys of webdriver is executed");

	}
	public void click()
	{
		System.out.println("click of webdriver is executed");

	}
*/
}
