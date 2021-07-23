package day15_abstract_interface;

public interface RBI {


		
		public double  getHomeLoanROI();// by default abstract method( no body), we dont have to use the keyword abstract(optional) 
		public double getCarLoanROI();// if u give body, it will give error
		public double getEducationLoanROI();
}

// difference between abstract class and interface: abstract class has abstract and non abstract methods
//interface cant have constructor but abstract 
//abstract class can implement interface
//class can have: An Interface in Java doesn't have a constructor because all data members in interfaces are public static final by default, they are constants (assign the values at the time of declaration). There are no data members in an interface to initialize them through the constructor.
// when to use abstract class or interface: when u know all ur methods are abstract, use interface
//cannot create constructor in interface, u can have in abstract class
