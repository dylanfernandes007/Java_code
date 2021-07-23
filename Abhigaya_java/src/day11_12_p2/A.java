package day11_12_p2;
import day11_12_p1.ABC;

public class A  extends ABC{

	public static void main(String[] args) {// remember use ABC not A
		// TODO Auto-generated method stub
		ABC obj= new ABC(); // can access all the above in the main method 
	     System.out.println(obj.i);// only this can be accessed
	  //System.out.println(obj.j);  // cant be accessed outside the class, private
//System.out.println(obj.k);//protected, can be accessed within and outside the package
	     ///outside the package, use inheritance "extends"
	     //if you use object of A not ABC 
	//     System.out.println(obj.l);//default, cant be accessed outside the package, ONLY within package
	     
	     //use inheritance
	     
	    
	
		
		
	}

}
