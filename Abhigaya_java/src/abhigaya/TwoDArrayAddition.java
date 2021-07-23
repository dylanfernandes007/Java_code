package abhigaya;

public class TwoDArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= {1,3,5,6,2,4,8,7,10};//length=9, find the missing number
		int n=10;
		int sum=0;
		for (int i=0; i<array.length;i++)
		{
			sum=sum+array[i];
		}
		//calculate the sum of "n" natural numbers where n=10
		int sumOf10Numbers=(n*(n+1))/2;
		int missingNumber=sumOf10Numbers-sum;
		System.out.println("The missing number is " +missingNumber);
		
		int[][] arr= new int[2][3]; //total elements will be 6
		
	}

}
