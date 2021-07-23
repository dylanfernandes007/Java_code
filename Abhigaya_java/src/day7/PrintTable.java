package day7;

import java.util.Scanner;

public class PrintTable {//day 7
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
System.out.println("please enter a number");
int num=scan.nextInt();

/*
for(int i=1;i<=10;i++) // FOR loop to print table
{
	System.out.println(num+"*"+i+"="+(num*i));// pattern is easy but still check
}


int i=1;
while(i<=10)  // WHILE loop to print table
{
	System.out.println(num+"*"+i+"="+(num*i));
	i++;
}
*/
int i=1;
do     // DO WHILE loop to print table
{
	System.out.println(num+"*"+i+"="+(num*i));
	i++;
}
while(i<=10);

}
}