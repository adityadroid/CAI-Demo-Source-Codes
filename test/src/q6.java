import java.util.ArrayList;
import java.util.Scanner;


public class q6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bucky = new Scanner(System.in);
		int n;
		n= bucky.nextInt();
		bucky.nextLine();
		String teamnames=bucky.nextLine();
		String[] teams;
		teams= teamnames.split(" ");
		
		int numberofmatches;
		numberofmatches= bucky.nextInt();
		String[][] listofmatches = new String[numberofmatches][4];
		bucky.nextLine();

				for(int i=0;i<numberofmatches;i++)
				{
		String match = bucky.nextLine();
		String[] matchstat;
		matchstat= match.split(" ");
		for(int x=0;x<4;x++)
		{
			listofmatches[i][x]=matchstat[x];

		}
		
		}
				
				
				
				for(int i=0;i<numberofmatches;i++)
				{
					if(listofmatches[i][0].equals(listofmatches[i][1]))
					{
						System.out.print("Invalid Input");
						return;
						
					}
				}
				for(int i=0;i<numberofmatches;i++)
				{
					int num=0;
					for(int j=0;j<numberofmatches;j++)
					{
						if(
								(listofmatches[i][0].equals(listofmatches[j][0]) && listofmatches[i][1].equals(listofmatches[j][1]))
								||
								(listofmatches[i][0].equals(listofmatches[j][1]) && listofmatches[i][1].equals(listofmatches[j][0]))
								
								)
						{
							num++;
						}
						
						
					}
					if(num>1)
					{
						System.out.print("Invalid Input");

						return;
					}
				}
				
				for(int i =0;i<teams.length;i++)
				{
					for(int j=0;j<teams.length;j++)
					{
						if(teams[i]==teams[j]&& i!=j)
						{
							System.out.print("Invalid Input");
							return;
						}
					}
				}
				int[] scoreboard = new int[teams.length];
				int[] goaldifference= new int[teams.length];
				int[] goalsfor = new int[teams.length];
				
				for(int i =0;i<listofmatches.length;i++)
				{
					int gdA,gdB;
					gdA=Integer.parseInt(listofmatches[i][2])-Integer.parseInt(listofmatches[i][3]);
					gdB=-gdA;
					for(int pos=0;pos<teams.length;pos++)
					{
						if(teams[pos].equals(listofmatches[i][0]))
						{
							goaldifference[pos]=goaldifference[pos]+gdA;
						}

						if(teams[pos].equals(listofmatches[i][1]))
						{
							goaldifference[pos]=goaldifference[pos]+gdB;
						}
						
					}
					for(int pos=0;pos<teams.length;pos++)
					{
						if(teams[pos].equals(listofmatches[i][0]))
						{
							goalsfor[pos]=goalsfor[pos]+Integer.parseInt(listofmatches[i][2]);
						}

						if(teams[pos].equals(listofmatches[i][1]))
						{
							goalsfor[pos]=goalsfor[pos]+Integer.parseInt(listofmatches[i][3]);
						}
						
					}
					
					if(Integer.parseInt(listofmatches[i][2])==Integer.parseInt(listofmatches[i][3]))
					{
						
						
						for(int pos=0;pos<teams.length;pos++)
						{
						if(teams[pos].equals(listofmatches[i][0])||teams[pos].equals(listofmatches[i][1]))
						{
							scoreboard[pos]++;
						}
						}
						
					}
					else if(Integer.parseInt(listofmatches[i][2])>Integer.parseInt(listofmatches[i][3]))
					{
						
						for(int pos=0;pos<teams.length;pos++)
						{
						if(teams[pos].equals(listofmatches[i][0]))
						{
							scoreboard[pos]++;
							scoreboard[pos]++;
							
						}
						}
					}
					else if(Integer.parseInt(listofmatches[i][2])<Integer.parseInt(listofmatches[i][3]))
					{
						for(int pos=0;pos<teams.length;pos++)
						{
						if(teams[pos].equals(listofmatches[i][1]))
						{
							scoreboard[pos]++;
							scoreboard[pos]++;
						}
						}
					}
					
					
					
				}
				
				
				
				
				
		        for (int i = 0; i < teams.length; i++) 

		        {

		            for (int j = i + 1; j < teams.length; j++) 

		            {

		            	if(scoreboard[i]==scoreboard[j])
		            	{
		            		if(goaldifference[i]==goaldifference[j])
		            		{
		            			if(goalsfor[i]==goalsfor[j])
		            			{
		            				if(teams[i].compareTo(teams[j])>0)
		            				{
		            				  int  temp = scoreboard[i];
		      		                    scoreboard[i] = scoreboard[j];
		      		                    scoreboard[j] = temp;
		      		                    
		      		                    temp = goaldifference[i];
		      		                    goaldifference[i]=goaldifference[j];
		      		                    goaldifference[j]=temp;
		      		                    
		      		                    temp= goalsfor[i];
		      		                    goalsfor[i]=goalsfor[j];
		      		                    goalsfor[j]=temp;
		      		                    
		      		                    String tempt=teams[i];
		      		                    teams[i]=teams[j];
		      		                    teams[j]=tempt;
		      		                    
		            				}
		            				
		            			}
		            			else if (goalsfor[i]<goalsfor[j])
		            			{
		            				  int  temp = scoreboard[i];
		  		                    scoreboard[i] = scoreboard[j];
		  		                    scoreboard[j] = temp;
		  		                    
		  		                    temp = goaldifference[i];
		  		                    goaldifference[i]=goaldifference[j];
		  		                    goaldifference[j]=temp;
		  		                    
		  		                    temp= goalsfor[i];
		  		                    goalsfor[i]=goalsfor[j];
		  		                    goalsfor[j]=temp;
		  		                    
		  		                    String tempt=teams[i];
		  		                    teams[i]=teams[j];
		  		                    teams[j]=tempt;
		  		                    
		            			}
		            			
		            		}
		            		else if(goaldifference[i]<goaldifference[j])
		            		{
		            			  int  temp = scoreboard[i];
				                    scoreboard[i] = scoreboard[j];
				                    scoreboard[j] = temp;
				                    
				                    temp = goaldifference[i];
				                    goaldifference[i]=goaldifference[j];
				                    goaldifference[j]=temp;
				                    
				                    temp= goalsfor[i];
				                    goalsfor[i]=goalsfor[j];
				                    goalsfor[j]=temp;
				                    
				                    String tempt=teams[i];
				                    teams[i]=teams[j];
				                    teams[j]=tempt;
				                    
		            		}
		            	}
		            	
		            	else if (scoreboard[i] < scoreboard[j]) 

		                {

		                  int  temp = scoreboard[i];
		                    scoreboard[i] = scoreboard[j];
		                    scoreboard[j] = temp;
		                    
		                    temp = goaldifference[i];
		                    goaldifference[i]=goaldifference[j];
		                    goaldifference[j]=temp;
		                    
		                    temp= goalsfor[i];
		                    goalsfor[i]=goalsfor[j];
		                    goalsfor[j]=temp;
		                    
		                    String tempt=teams[i];
		                    teams[i]=teams[j];
		                    teams[j]=tempt;
		                    
		                    
		                   
		                }

		            }

		        }
				
		        for(int i =0;i<teams.length;i++)
				{
					
					System.out.print(teams[i]+"\n");
				}
//				for(int i= 0;i<listofmatches.length;i++)
//				{
//					for(int j=0;j<4;j++)
//					{
//						System.out.print(listofmatches[i][j]+" ");
//					}
//					System.out.println();
			//	}
				
		
		
		
		
		
		
	}

}
