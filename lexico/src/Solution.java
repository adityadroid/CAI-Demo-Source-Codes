import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		Scanner bucky = new Scanner(System.in);
		int n,k;
		n=bucky.nextInt();
		k=bucky.nextInt();
		//System.out.println(n);
	//	System.out.println(k);
		int list[] = new int[n];
		for(int i=0;i<n;i++)
		{
			list[i]=bucky.nextInt();
		}
		
		List<List<String>> listOfLists = new ArrayList<List<String>>(n); 
		 for(int i = 0; i < n; i++)  {
		       listOfLists.add(new ArrayList<String>());
		    }
		 
		 for(int i=0; i<n;i++)
		 {
			 if(list[i])
		 }
		 
		// listOfLists.get(0).add("foobar");
		 
//		int seq[][]=new int[n][n];
//		for(int i=0;i<list.length;i++)
//		{
//			
//			
//		}
		
		
	}
}