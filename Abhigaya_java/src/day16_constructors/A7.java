package day16_constructors;

interface Printable{  
 default void print() {
	 System.out.println("Default");
}
}  
interface Showable{  
	abstract void show();  
}  
class A7 implements Printable,Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
A7 obj = new A7();  
obj.print();  
obj.show();  
 }  
}  