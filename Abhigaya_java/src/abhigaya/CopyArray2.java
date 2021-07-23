package abhigaya;

public class CopyArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[]  arr1= new int[] {1,2,3,4,5};// when you to show the values
		
		int[] arr2= new int[arr1.length];// this contains the length
		
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
		}
		
		System.out.println("The first array is");
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]);
		}
		
		System.out.println();
		
		System.out.println("The second array is");
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr2[i]);
		}
		
		
	}

}
