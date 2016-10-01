import java.util.Scanner;


public class main {

	
	/**
	 * @param args
	 * 
	 * 
	 */
	static int combarray[][];
	static int pos=0;
	static void permute(int[] a, int k)

	{

		if (k == a.length)

		{

			for (int i = 0; i < a.length; i++)

			{

				
				//System.out.print(" [" + a[i] + "] ");
				combarray[pos][i]=a[i];
				
				

			}
			pos++;

			//System.out.println();

		}

		else

		{

			for (int i = k; i < a.length; i++)

			{

				int temp = a[k];

				a[k] = a[i];

				a[i] = temp;

				permute(a, k + 1);

				temp = a[k];

				a[k] = a[i];

				a[i] = temp;

			}

		}

	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bucky=new Scanner(System.in);
		int r,c;
		r=bucky.nextInt();
		c=bucky.nextInt();
		int blocks[][]= new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			blocks[i][j]=bucky.nextInt();
			
			}
		}
		int wells=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			if(blocks[i][j]==1)
				wells++;
			
			}
		}
		
		int possiblecomb= factorial(wells);
		
		combarray=new int[possiblecomb][wells];
		int testarray[]=new int[wells];
		int x=0;
		for(int i=0;i<wells;i++)
		{
			testarray[i]=x;
			x++;
			
		}
		
		permute(testarray,0);
		
		for(int i=0;i<possiblecomb;i++)
		{
			for(int j=0;j<wells;j++)
			{
				System.out.print(combarray[i][j]+" ");
			}
			System.out.println();
		}
		
//		int pos=0;
//		for (int i = 0; i < r; i++) {
//			for (int j = 0; j < c; j++) {
//				if (blocks[i][j] == 1) {
//					combarray[0][pos] = i;
//					combarray[1][pos] = j;
//					pos++;
//				}
//			}
//		}
//		
		
//		int result=findwell(combarray,possiblecomb,wells);
//		
//		System.out.println(result);
//		
		
		
		
	}
	 public static int factorial(int n) {
	        int fact = 1; // this  will be the result
	        for (int i = 1; i <= n; i++) {
	            fact *= i;
	        }
	        return fact;
	    }
	 
	 
	 public static int findwell(int[][] combarray,int possiblecomb,int wells)
	 {
		int finalcomb[][]=new int[possiblecomb][wells];
		 
		 for(int j=wells-1;j>=0;j--)
		 {
			 for(int i=0;i<possiblecomb;i++)

			 {
				 if(j==0)
				 {
					finalcomb[i][j]=j;
					 
				 }
				 
			 }
		 }
		return 0;
		 
		
	 }
	
	 


}
