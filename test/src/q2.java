import java.util.Scanner;


public class q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bucky = new Scanner(System.in);
		int n = bucky.nextInt();
		int k = bucky.nextInt();
		
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		
		for(int i = 0;i<n;i++)
		{
			arr1[i]=bucky.nextInt();
		}

		
		for(int i = 0;i<n;i++)
		{
			arr2[i]=bucky.nextInt();
		}
		
		int maxDifference=0;
		int minimumSum=0;
		
		
		for(int x=0;x<5;x++)
		{
			
		int maxpoint=0;
		int point = 0;
		
		for(int i=0;i<n;i++)
		{
			if(maxpoint<arr2[i])
			{
				point=i;
			}
		}
		if(arr1[point]>0)
		{
			arr1[point]-=2;
			
		}
		else if(arr1[point]<0)
		{
			arr1[point]+=2;
		}
		
		}
		for(int i=0;i<n;i++)
		{
			minimumSum= minimumSum+(arr1[i]*arr2[2]);
		}
		System.out.print(minimumSum);
		
		
		
		
		
		
//		for(int i =0;i<n;i++)
//		{
//			
//			int product = arr1[i]*arr2[i];
//			int temp=0;
//			
//			if(product<0 && arr2[i]<0)
//			{
//				temp= (arr1[i]+(2))*arr2[i];
//				
//				
//			}
//			else if(product <0 && arr1[i]<0)
//			{
//				temp= (arr1[i]-(2))*arr2[i];
//			}
//			else if( product > 0 && arr1[i] < 0) 
//			{
//            temp = (arr1[i] + 2 ) * arr2[i];
//			}
//			else if (product > 0 && arr1[i] > 0)
//			{
//            temp = (arr1[i] - 2 )  * arr2[i];
//			}
//			
//			int dif = product-temp;
//			if(dif>maxDifference)
//			{
//				maxDifference=dif;
//			}
//			minimumSum= minimumSum+product;
//		}
		//minimumSum= minimumSum+ maxDifference;
		//System.out.print(minimumSum);
				
//		
//		
//		For i to n
//	    i. product = A[i] * B[i]
//	    ii. if ( product < 0 && B[i] < 0 ) then
//	            temp = (A[i] +  2  * n ) * B[i]
//	        else if( product < 0 && A[i] < 0) then
//	            temp = (A[i] - 2 * n) * B[i]
//	        else if( product > 0 && A[i] < 0) then
//	               temp = (A[i] + 2 * n) * B[i]
//	        else if (product > 0 && A[i] > 0)
//	               temp = (A[i] - 2 * n)  * B[i]
//	    iii. diff =  product - temp
//	    iV. if( diff > maxDiff )
//	         maxDiff = diff
//	     V. minimumSum = minimumSum + product
//
//	3. minimumSum = minimumSum + diff
//		
	
	}

}
