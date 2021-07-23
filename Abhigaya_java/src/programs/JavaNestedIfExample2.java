package programs;

public class JavaNestedIfExample2 {
	public static void main(String[] args) {
		int age=30;
		int weight =49;
		
	if(age>29) {
		
	  if(weight>50) {
		  System.out.println("weight and age enough to donate blood");
	  }
	  else {
		  System.out.println("age enough. weight is not enough to donate blood");
	  }
	}
	  else {
		  System.out.println("age is not ennough");
	  }
	}
	}