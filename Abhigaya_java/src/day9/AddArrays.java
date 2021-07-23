package day9;

public class AddArrays {//day 9
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,4,5};
		int[] b= {11,12,13,14,15};
		
		AddArrays obj= new AddArrays();
		int[] finalArray=obj.add_2arrays(a, b);
		for(int i=0;i<finalArray.length;i++)
		{
			System.out.println(finalArray[i]);
		}
		
		
/*		
Write method to pass 2 1-d arrays both of same length and put in 3rd array
{1,2,3}  {11,12,13}
*/
		}
	
	public int[] add_2arrays(int[] array1, int[] array2)
	{
		int third_array[]=new int[array1.length];
		for(int i=0;i<array1.length;i++)
		{
			third_array[i]=array1[i]+array2[i];
		}
		return third_array;
	}
	 
	
}




