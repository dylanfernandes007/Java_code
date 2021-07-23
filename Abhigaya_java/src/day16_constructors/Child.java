package day16_constructors;

public class Child extends Parent {

	int i=1000;
	/*public Child() {// this will give error if parent is parameterized, we use super below
		
		System.out.println("Constructor of child class");
	
	}
	*/
	
public Child() {// use super keyword if parent class is parameterized when calling parent class properties
		
	super(10);// since we are using "int i" in parent
		System.out.println("constrauctor of child class");
	
	}
/*public Child() {
	
	super(10);// output will show "no arg constructor "
		System.out.println("constrauctor of child class");
	
	}
	
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c= new Child();

	}

}
// in java when u have parent child relation, even if u call obj of child class, parent class is also called
//automatically only default or no arg contructor of parent class can be called in child class const
//constructors: get invoked when u create obj of class. Used to initialize instance var at the time of obj creation.