package day8;

public class Arrays {//day 8

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= new int[10];// here 5 is the length of the array, new is creating object of "array" class not for Arrays
		                         // for Arrays it would have been--------- new Arrays();
		//length is fixed
		array[0]=23; //inserting values in the array
		array[4]=50;// doesn't have to be sequential
		
		
		
		System.out.println(array[0]);//fetching first value from array
	//	array[15]=150; you will get error ArrayIndexOutofBound exception as max index is 10. runtime exception
		System.out.println(" length of array: " +array.length); // length of array, length is a variable defined in array class not a method
		
		
		
		
		
		
	}

}
