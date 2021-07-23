package day12_inheritance;

public class Dog extends Animal{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Dog obj= new Dog();
            obj.sound1();// from Animal class, // single level inheritance
         //   obj.sound2();it will give error as private method     
	}
	 public void sound1()
     {
     	System.out.println("woof woof"); // Dog is executed before Animal, pref given to dog as obj is created in that class, 
     	                                 //if not avail in dog, then Animal
     }

}
