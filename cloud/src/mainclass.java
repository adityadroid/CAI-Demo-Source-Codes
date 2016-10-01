import java.util.Scanner;


public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bucky=new Scanner(System.in);
		int numberofClouds;
		numberofClouds=bucky.nextInt();
		int numberOfSteps=0;
		int cloudArray[] = new int[numberofClouds];
		for(int i=0;i<numberofClouds;i++)
		{
			cloudArray[i]=bucky.nextInt();
		}
		int ptr=0;
		for(int i=0;i<numberofClouds;i++)
		{
			if(i+2<numberofClouds)
			{
				
			
			if(cloudArray[i+2]==1)
			{
				ptr=i+1;
				numberOfSteps++;
				i=ptr-1;
			}
			else
			{
				ptr=i+2;
				numberOfSteps++;
				i=ptr-1;
			}
			}
			else if(i==numberofClouds-2)
			{
				numberOfSteps++;
			}
		}
		System.out.println(numberOfSteps);
		
	}

}
