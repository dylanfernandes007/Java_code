package newpackage;

class Bank3{  
int getRateOfInterest(){return 0;}  
}  
//Creating child classes.  
class SBI2 extends  Bank3{  
int getRateOfInterest(){return 8;}  
}  
  
class ICICI extends  Bank3{  
int getRateOfInterest(){return 7;}  
}  
class AXIS extends  Bank3{  
int getRateOfInterest(){return 9;}  
}  
//Test class to create objects and call the methods  
class Test2{  
public static void main(String args[]){  
	SBI2 s=new SBI2();  
ICICI i=new ICICI();  
AXIS a=new AXIS();  
System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
}  
}  