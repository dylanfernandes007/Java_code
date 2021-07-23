package day9;

public class OneDArray {//day 9

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int[] array = new int[5];
	System.out.println(array.length);
	
	/*for(int i=0;i<array.length;i++)// always i<array.length as index less than 1
	{
		 array[i]=10;
		 System.out.println(array[i]);// not dynamic
	}
	*/
	
	for(int i=0;i<array.length;i++)// always i<array.length as index less than 1
	{
		 array[i]=(int)(Math.random()*10000); // dynamic// do typecasting
		 System.out.println(array[i]);
	}
	
	int[] arr= {1,2,3,4,5}; // Here I am creating and initializing 1D array, obj will be created here also
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	}

}
