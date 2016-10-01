import java.util.Scanner;


public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner bucky = new Scanner(System.in);
		int level = bucky.nextInt();
		int N = 105;
		int[] list = new int[N];
		int base = 6;
		int difference=16;
		list[0]=base;
		for(int i = 1;i< N ;i++)
		{
			
			if(i!=1)
			{
			list[i]= (list[i-1]-list[i-2]) + difference+ list[ i-1];
			}
			else if(i==1)
			{
				list[i]= 28;
				
			}
			
		}
		String[] strlist = new String[N];
		for(int i=0;i<N;i++){
			strlist[i]= Integer.toString(list[i]);
		}
		for(int i=0;i<N;i++)
		{

			
				
				int length = Integer.toString(list[i]).length();
				length = 5-length;
				for(int j=0; j<length;j++)
				{
					
					strlist[i] = Integer.toString(0)+strlist[i];
					
					
				}
			
		}
		
		int offset=level-1;
		int g=0;
		for(int i=0;i<level;i++)
		{
			
			
			for(int x=0;x<offset;x++)
			{
				System.out.print(" ");
			}
			
			for(int x=0; x<=i;x++)
			{
				System.out.print(strlist[g]+" ");
				g++;
			}

			System.out.println("");
			
			offset--;
		}
		
		
		
		
		
		
	}

}
