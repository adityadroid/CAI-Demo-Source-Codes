import java.util.ArrayList;
import java.util.Scanner;


public class q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int N=0;
		Scanner bucky = new Scanner(System.in);
		while(bucky.hasNext())
		{
		N= Integer.parseInt(bucky.nextLine());
		}
		int[][] inputCombinations = new int[N/2][7];
	
		String[] inputs;
		String[] answers = new String[N/2];
		String[] QPlayer = new String[N/2];
		String[] AnsPlayer = new String[N/2];
		int pointsDarell =0;
		int pointsSally =0;
		
		int sentinal =0;
		String result;
		boolean invalidinput=false;
		for(int i =0;i<N;i++)
		{

			if(i%2==0)
			{
				String posingQuestion =null;
				while(bucky.hasNextLine())
				{
				 posingQuestion = bucky.nextLine();
				}
				
				if(posingQuestion.contains(" "))
				{
					
				
				String playerName = posingQuestion.substring(0,posingQuestion.indexOf(" "));
				String combinations = posingQuestion.substring(posingQuestion.indexOf(" ")+1, posingQuestion.length());
				inputs = combinations.split(",");
				
				if(inputs.length<1)
				{
					
						invalidinput=true;
				}
				else
				{
				
				QPlayer[sentinal]=playerName;
				for(int x =0;x< inputs.length;x++)
				{
					if(inputCombinations[sentinal].length> inputs.length|inputCombinations[sentinal].length== inputs.length)
					{
						int j=0;
						for( j =0;j<inputs.length;j++)
						{
							inputCombinations[sentinal][j]= Integer.parseInt(inputs[j]);
						}
						for(int y=j; y<inputCombinations[sentinal].length;y++)
						{
							inputCombinations[sentinal][y]=-1;
						}
						
					}
					
				}
				}
				
				}
				else
				{
					invalidinput=true;
					
				}
				
				
				
				
				
			}
			
			
			else if(i%2!=0)
			{
				Scanner newScan = new Scanner(System.in);
				String input=null ;
				while(bucky.hasNext())
				{
				input= newScan.nextLine();
				}
				if(invalidinput)
				{
					System.out.println("Invalid Input");
				}
				else
				{		
				String results[] = input.split(" ");
				AnsPlayer[sentinal]=results[1];
				answers[sentinal] = results[2];
				sentinal++;

				}
				
				
			}
			
		}
		
		
		if(!invalidinput)
		{
		
		
		
		for(int i = 0; i<N/2;i++)
		{

			ArrayList<Integer> numberToBeChecked = new ArrayList<>();
			System.out.print(QPlayer[i]+"'s question is: ");
			for(int x =0;x< inputCombinations[i].length;x++)
			{
				if(inputCombinations[i][x]>0)
				{
					if(x!=inputCombinations[i].length-1)
					{
						
					
					if(inputCombinations[i][x+1]>0)
					{
						
					System.out.print(inputCombinations[i][x]+",");
					numberToBeChecked.add(inputCombinations[i][x]);
					}
					else
					{
						System.out.println(inputCombinations[i][x]);
						numberToBeChecked.add(inputCombinations[i][x]);

						
					}
					}
					else
					{		
						System.out.println(inputCombinations[i][x]);
						numberToBeChecked.add(inputCombinations[i][x]);

						
					}
					}
				
			}
			
			int[] numberslist = new int[numberToBeChecked.size()];
			for(int x =0;x<numberToBeChecked.size();x++)
			{
				numberslist[x]= numberToBeChecked.get(x);
			}
			
			
			int correctanswer = findLCM(numberslist);
			
			if(answers[i].equals("PASS"))
			{
				System.out.println("Question is PASSed");
				System.out.println("Answer is: "+correctanswer);
				System.out.println(AnsPlayer[i]+": 0points");
			}
			else if(Integer.parseInt(answers[i])==correctanswer)
			{
				
				if(AnsPlayer[i].equals("Darrell"))
				{
					System.out.println("Correct Answer");
				pointsDarell= pointsDarell+10;	
				System.out.println("Darrell: 10points");
				}
				else if(AnsPlayer[i].equals("Sally"))
				{
					System.out.println("Correct Answer");
					pointsSally = pointsSally+10;
					System.out.println("Sally: 10points");

				}
			}
				
			
			
		}
		
		
		System.out.println("Total Points:");
		System.out.println("Darrell: 0"+pointsDarell+"points");
		System.out.println("Sally: 0"+pointsSally+"points");
		System.out.print("Game Result: ");
		if(pointsDarell==pointsSally)
		{
			System.out.print("draw");
		}
		
		else if(pointsDarell>pointsSally)
		{
			System.out.print("Darrell is winner");
		}
		
		else if(pointsDarell<pointsSally)
		{
			System.out.print("Sally is winner");

		}
		
		
		
		
		
		}
		

		
	}
	
	public static int findLCM(int list[])
	{

		int big=0;
		
        
		for(int i =0;i<list.length;i++)
		{
			
			if(list[i]>big)
			{
				big= list[i];
			}
			
		}
		
			
		int i =1;
            while(true)
            {
            	
            	
            	int div =0;
            	for(int j=0;j<list.length;j++)
            	{
            		if((big*i)%(list[j])==0)
            		{
            			
            			div++;
            			
            			
            		}
            	}
            	if(div==list.length)
            	{
            		
            		return big*i;
            	}
              
            	i++;
            }
        
	}

}

