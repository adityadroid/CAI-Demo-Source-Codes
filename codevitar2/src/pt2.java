import java.util.Scanner;


public class pt2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int size;
		Scanner bucky = new Scanner(System.in);
		
		size=bucky.nextInt();
		int array[] =new int[size];
		int distance=0;
		for(int i =0;i<size;i++)
		{
			array[i]= bucky.nextInt();

		}
		
		for(int i=0;i<size;i++)
		{
			for(int j=i;j<size;j++)
			{
				
				if(array[i]==array[j]&&(i!=j))
				{
					if(distance==0)
					{
						distance= j-i;
						
					}
					else
					{
						int newdis=j-i;
						if(newdis<distance)
						{
						distance=newdis;
						}
						
					}
					
					}
			}
		}
		
		
		System.out.print(distance);
	}

}
