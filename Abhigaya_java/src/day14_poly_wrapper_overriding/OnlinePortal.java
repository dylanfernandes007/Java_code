package day14_poly_wrapper_overriding;

public class OnlinePortal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// write a method where you will pass 2 things
		// bank name and loan type that method must return ROI
		
		/*
		 * bank name, loan type -->define this as parameters
		 * 
		 * make obj of diff bank classes and then call the respective banks as per the loan type using obj t
		 */
	}
	
	public static double getROI(String bankName,String loanType)
	{
		if(loanType.equals("HomeLoan"))
		{
			return OnlinePortal.getBankObject(bankName).getHomeLoanROI();
		}
		/*using  multiple lines and creating object
		 *  RBI obj=OnlinePortal.getBankObject(bankName);
		 * double rateOfInterest= obj.getHomeLoanROI();
		 * return rateOfInterest;
		 */ 
		else if(loanType.equals("EducationLoan"))
		{
			return OnlinePortal.getBankObject(bankName).getEducationLoanROI();
		}
		else
		{
			return OnlinePortal.getBankObject(bankName).getCarLoanROI();
		}
	}
		public static RBI getBankObject(String bankName)  // DONT USE RETURN TYPE void, possible thru inheritance
		{
			if (bankName.equals("SBI"))
			{
				return new SBI();
			}
			else if(bankName.equals("HDFC"))
			{
				return new HDFC();
			}
			else
			{
				return new ICICI();
			}
		}
		
	

}
