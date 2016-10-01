import java.util.Scanner;


public class mainquestion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int TestCases;
		Scanner bucky = new Scanner(System.in);
		TestCases = bucky.nextInt();
		int Sum[]= new int[TestCases];
		int numberOfNumbers[] = new int[TestCases];
	
		for(int i =0;i<TestCases;i++)
		{
			numberOfNumbers[i] = bucky.nextInt();
			
			
			
		}
		
		
		for(int i=0;i<TestCases;i++)
		{
			int matrix[][]=new int[i][i];
			
			spiralPrint(numberOfNumbers[i],numberOfNumbers[i],matrix);
			
		}
		
		
//		for(int i =0;i<TestCases;i++)
//		{
//			int matrix[][]=new int[numberOfNumbers[i]][numberOfNumbers[i]];
//			
//			if(numberOfNumbers[i]%2==0)
//			{
//			int center = (numberOfNumbers[i]/2)+1;
//			}
//			else
//			{
//				int center = numberOfNumbers[i]/2;
//
//			}
//			
//			for(int j =0; j< numberOfNumbers[i];j++)
//			{
//				
//				
//				for(int k=0;k<numberOfNumbers[i];k++)
//				{
//					
//					
//					
//					
//				}
//				 
//				
//				
//				 
//				
//			}
//			
//			
//			for(int j =0; j< numberOfNumbers[i];j++)
//			{
//				
//				
//				for(int k=0;k<numberOfNumbers[i];k++)
//				{
//					int sumOfDiagonal=0;
//			           for (int x = 0, y =0; x< numberOfNumbers[i] && y < numberOfNumbers[i]; x++, y++) {
//			                  sumOfDiagonal= sumOfDiagonal + matrix[x][y];
//			                  
//			                  
//			           }	
//				}
//				 
//				
//				
//				 
//				
//			}
//			
//			
//			
//			
//			
//			
//			
//		}

	}
	
	
	
	
	 
	public static void spiralPrint(int k, int l, int a[][])
	{
	    int i, m = 0, n = 0;
	 
	    int matrix[][] = new int[a.length][a.length];
	    /*  k - starting row index
	        m - ending row index
	        l - starting column index
	        n - ending column index
	        i - iterator
	    */
	    int num=1;
	 
	    while (k < m && l < n)
	    {
	    	
	        /* Print the first row from the remaining rows */
	        for (i = l; i < n; ++i)
	        {
	    
	        	a[k][i]=num;
	        	num++;
	        }
	        k++;
	 
	        /* Print the last column from the remaining columns */
	        for (i = k; i < m; ++i)
	        {
	            //printf("%d ", a[i][n-1]);
	            a[i][n-1]=num;
	            num++;
	        }
	        n--;
	 
	        /* Print the last row from the remaining rows */
	        if ( k < m)
	        {
	            for (i = n-1; i >= l; --i)
	            {
	            	a[m-1][i]=num;
	            	num++;
	              //  printf("%d ", a[m-1][i]);
	            }
	            m--;
	        }
	        
	 
	        /* Print the first column from the remaining columns */
	        if (l < n)
	        {
	            for (i = m-1; i >= k; --i)
	            {
	            	a[i][i]=num;
	            	num++;
	            }
	            l++;    
	        }        
	    }
	    
	    
	    
	    System.out.println(arraySum(a));
	    
	}
	
	
	
	public static int arraySum(int[][] array){
	    int total = 0;

	    for (int row = 0; row < array.length; row++)
	    {

	        total += array[row][row];
	    }

	    return total;
	}
	 

}
