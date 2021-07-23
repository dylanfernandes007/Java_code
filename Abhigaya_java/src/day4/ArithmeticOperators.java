package day4;

public class ArithmeticOperators {//day 4

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int  i=10;
int  j=25;
double k=25;
System.out.println(i+j);  //35
System.out.println(j-1);   //24
System.out.println(i*j); //250
System.out.println(j/i); //2, int---use the max formula from below
System.out.println(k/i);  //2.5, double--use the max formula from below

byte b =100;// 100 is int
//b=b+1; or b+b+100//why we get compile error because when variable is involved, data type on RHS should match  same as LHS.
//b=b+10; max(int, byte, int) int will be the max as int has more priority than byte
b=(byte)(b+10);// type casting
//so 110 is int which is higher data type and byte is smaller data type
b=100+10; // no error as no variable
//b=100+28;// here it crosses 127 so error even though no variable
System.out.println(b);

	}

}
