package abhigaya;

public class Enhanced_for_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,2,3,4,5};
		int[] b= {11,12,13,14,15};
		
		Enhanced_for_array obj= new Enhanced_for_array();
		int[] finalArray=obj.add_2arrays(a, b);
		
		for(int var:finalArray)//enhanced for each loop, data type of var is int as all values in finalArray is int
		//for each loop use for arrays , collections where you use multiple values
			// there is no index in this loop
			// advantages over normal for--can never become infinite, Hashset, treeset, linkedhashset, 
			//finalArray will have the last value in the last iteration, example 20, always ascending order values not descending
		{
			System.out.println(var);

		}
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
