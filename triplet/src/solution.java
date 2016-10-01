import java.util.Scanner;


public class solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bucky = new Scanner(System.in);
		int difference, number;
		number= bucky.nextInt();
		difference=bucky.nextInt();
		int arr[]=new int[number];
		int pairs=0;
		for(int i=0;i<number;i++)
		{
			arr[i]=bucky.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(i<number-2)
			{
				for(int j=i+1;j<number-1;j++)
				{
					for(int k=0;k<number;k++)
					{
						if(arr[j]-arr[i]==difference&&arr[k]-arr[j]==difference)
						{
							pairs++;
						}
					}
				}

				int x=i;
				int y=i+1;
				int z=i+2;
				
			}
			
			
			
		}
		System.out.println(pairs);
	}

}
