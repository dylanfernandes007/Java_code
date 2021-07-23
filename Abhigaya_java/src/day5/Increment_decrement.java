package day5;

public class Increment_decrement {//day 5

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=10;
int j=20;

System.out.println(++i);  // 11
System.out.println(i++); // 11(12)
System.out.println(i++); // 12(13)
System.out.println(++i);//14
System.out.println(i); //14
System.out.println(++i); //15

i=i++;
System.out.println(i);// 15 check why? assignment/increment
i=++i;
System.out.println(i);

System.out.println(i++ + ++i + ++i + i++ +i );
System.out.println(i);

System.out.println(!false);// true: only works with boolean not int like 10,20
//when relational operator, value is only boolean

System.out.println(i<=j);

	}

}
