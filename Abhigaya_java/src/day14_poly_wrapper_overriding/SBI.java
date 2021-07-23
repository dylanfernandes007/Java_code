package day14_poly_wrapper_overriding;

public class SBI extends RBI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBI obj=new SBI();
		System.out.println(obj.getHomeLoanROI());
		System.out.println(obj.getEducationLoanROI());
		
	}
	public double getHomeLoanROI()
	{
		return 8.0;
	}
	public double getEducationLoanROI()
	{
		return 11;
	}
	public double getCarLoanROI()
	{
		return  19.5;
	}

}
