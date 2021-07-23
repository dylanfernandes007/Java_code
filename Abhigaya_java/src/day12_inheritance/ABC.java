package day12_inheritance;

public class ABC {// not extending anyone

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj= new Dog();
        obj.sound1();// first will search in Dog (as obj is of Dog ) then in Animal
        
        Bulldog obj1= new Bulldog();
        obj1.sound1();
	}

}
