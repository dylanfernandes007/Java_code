package newpackage;

class Adder3{  
static int add31(int a,int b){return a+b;}  
static double add3(int a,int b){return a+b;}  
}  
class TestOverloading3{  
public static void main(String[] args){  
System.out.println(Adder3.add31(11,11));//ambiguity  
}}  