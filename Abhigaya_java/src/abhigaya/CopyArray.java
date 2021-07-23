package abhigaya;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		int[] arr1= new int[] {22,32,3,4,5};
		int[] arr2= new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++)
			arr2[i]=arr1[i];
	// copy elements from one array to other
	
	
	System.out.println("display elements of first array");
	
	for(int i=0;i<arr1.length;i++) {
		System.out.println(arr1[i] + "");
	}
	
	System.out.println();

	System.out.println("display elements of second  array");
	for(int i=0;i<arr2.length;i++)
	{
		 System.out.println(arr2[i] + " ");
	}
	
	}

	
	
}
