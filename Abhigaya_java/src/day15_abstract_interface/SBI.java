package day15_abstract_interface;

public class SBI implements RBI{// we are not taking SBI as abstract

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getHomeLoanROI() {
		// TODO Auto-generated method stub
		return 12.5;// we have body since its not abstract and SBI class is not abstract
	}

	@Override
	public double getCarLoanROI() {
		// TODO Auto-generated method stub
		return 12.3;
	}

	@Override
	public double getEducationLoanROI() {
		// TODO Auto-generated method stub
		return 11.4;
	}

}
