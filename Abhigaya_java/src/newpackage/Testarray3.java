package newpackage;

class Testarray3{  
	//creating a method which receives an array as a parameter  
	 static void max(int arr[]){  // even if u put public:np, check static importance
	int max=arr[0];  
	for(int i=1;i<arr.length;i++)  
	 if(max<arr[i])  
		 max=arr[i];  
	  
	System.out.println(max);  
	}  
	  
	public static void main(String args[]){  
	int a[]={33,3,43,55};//declaring and initializing an array  
	max(a);//passing array to method  // max is the method
	}}  