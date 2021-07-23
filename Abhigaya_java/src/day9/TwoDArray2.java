package day9;

public class TwoDArray2 {//day 9

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//int[] array1= new int[3]; //12 bytes
		
int[][] array= new int[3][];// minimum you need to give length of at least the first array of multi-dimensional array
// but jvm cant execute the above as length not given

array[0]= new int[2];//2 values
array[1]= new int[5];// 5 values
array[2]= new int[10];// 10 values

		
		//array[0][0]=10;// this will give null pointer exception
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				array[i][j]=(int)(Math.random()*10000);
				System.out.println(array[i][j]);
			}
		}
		//{1,2,4,3}
		//1+2+3+4+5=15-10=5
		//sum of natural nos= n(n+1)/2; where n=100
		
		
	}

}
