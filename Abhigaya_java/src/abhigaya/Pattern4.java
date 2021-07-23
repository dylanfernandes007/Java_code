package abhigaya;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,k, n=5;
		for(i=n;i>=1;--i)
		{
			for(k=1;k<=n-i;++k)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;++j)
			{
				System.out.print("$");
			}
			System.out.println();
		}
	}

}
