package abhigaya;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i,j,k,n=5;
       
       for(i=n;i>=1;--i)
       {
    	   for(k=1;k<=n-i;++k)
    	   {
    		   System.out.print(" ");
    	   }
    	   for(j=i;j>=1;--j)
    	   {
    		   System.out.print(j);
    	   }
    	   System.out.println(" ");
       }
	}

}
