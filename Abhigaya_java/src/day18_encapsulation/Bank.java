package day18_encapsulation;

public class Bank {

	private int accountNumber=123456;
	int pinCode=1234;// if private, u cant access in atm class
	double balanceAmount=10000.00;
	
	public void setPinCode(int accNumber, int oldPin, int newPin)//setter-->pincode
	{
		if(accountNumber==accNumber && oldPin==pinCode)
		{
			pinCode=newPin;
			System.out.println(" your pin updated successfully");
		}
		else
		{
			System.out.println("invalid account number or old pin entered");
		}
	}
	
	public double getBalanceAmount(double accNum, double pin)//getter--balance amount
	{
		if(accNum==accountNumber && pin==pinCode)
		{
			return balanceAmount;
		}
		else
		{
			System.out.println("Invalid account number or  PIn entered by user");
			return -1;
		}
	}
	public void withdrawCash(int accNo, int pin, int amount) 
	{
		if(accNo==accountNumber && pin==pinCode)
		{
			if(amount<=balanceAmount)
			{
				balanceAmount=balanceAmount-amount;
				System.out.println("Amount: " +amount+ " has been withdrawn successfully");
			}
			else {
				System.out.println("Insuffiient blanace");
			}
		}
		else {
			System.out.println("invalid pin no. entered");
		}
	}
}
