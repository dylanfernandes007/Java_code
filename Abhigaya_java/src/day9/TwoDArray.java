package day9;

public class TwoDArray {// day9

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
int[][] array= new int[2][3];
	//	int[][][] array= new int[2][3][4];
		//In java, multi-dimensional are nothing but arrays within array
		
		System.out.println(array.length);
		//array[0][0]=10;
		//array[0][1]=20;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				array[i][j]=(int)(Math.random()*10000);// this is for 2d array
				System.out.println(array[i][j]);
				
			}
		}
		
	}

}
