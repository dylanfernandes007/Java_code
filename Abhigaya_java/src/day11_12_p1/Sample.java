package day11_12_p1;

public class Sample {

	public static void main(String[] args) {// no need to import ad Sample and ABC are in same package
		// TODO Auto-generated method stub
		   ABC obj= new ABC(); // can access all the above in the main method 
		     System.out.println(obj.i);
		  //   System.out.println(obj.j);// this is private from ABC class so giving error. only in class valid
		     System.out.println(obj.k);
		     System.out.println(obj.l);
		/*
		     public: accesses evrywhere, other projects also
		     private: only within the class
		     protected: within same packge. otehr packages also by using extends keyword
		     default:  within same packge. 
visibility lowest to highest: pvt> default> protected>public (max visib)
		*/
	}

}
