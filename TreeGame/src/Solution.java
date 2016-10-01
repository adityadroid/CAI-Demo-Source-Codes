import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bucky = new Scanner(System.in);
		
		
		int no=bucky.nextInt();
		int arr[]=new int[no];
		for(int i=0;i<no;i++)
		{
			arr[i]=bucky.nextInt();
		}
		int edges[][]=new int[no-1][2];
		for(int i=0;i<no-1;i++)
		{
			for(int j=0;j<2;j++)
			{
				edges[i][j]=bucky.nextInt();
			}
		}
		int questionno=bucky.nextInt();
		int questions[][]=new int[questionno][2];
		for(int i=0;i<questionno;i++)
		{
			for(int j=0;j<2;j++)
			{
				questions[i][j]=bucky.nextInt();
			}
		}
		
		for(int i=0;i<questionno;i++)
		{
			String status=null;
			
				int replica[][]=new int[no-1][2];
				replica=edges;
			
				for(int x=0;x<no-1;x++)
				{
					
					if(questions[i][0]==replica[x][1])
					{
						replica[x][0]=questions[i][1];
						
						
					}
				}
				
				for(int x=0;x<no-1;x++)
				{
					
					
					if(checkconnect(replica,no))
					{
					if(arr[replica[x][0]-1]==1) ////////////
					{
						status="YES";
						break;
					}
					else
					{
						status="NO";
						
					}
					}
					else
					{
						status="INVALID";
					}
					
					
				}
				
			
			System.out.println(status);
				
		}
		
		
		
		
	}
	
	public static boolean checkconnect(int[][] edges,int no)
	{
		
		
		for(int i=2;i<=no;i++)
		{
			int cur=i;
			while(cur!=1)
			{
				
				ArrayList<Integer> checkedno=new ArrayList<>();

			for(int x=0;x<no-1;x++)
			{
				if(!checkedno.contains(cur))
				{
				if(edges[x][1]==cur)
				{
					checkedno.add(cur);
					cur=edges[x][0];
					if(cur!=1)
					{
						
						x=-1;
					}
					
				}
				
			    }
				else
				{
					return false;
				}
				
			}
			
			}
			
		}
		return true;
		
	}

}
