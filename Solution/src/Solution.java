import java.util.ArrayList;
import java.util.Scanner;


public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bucky = new Scanner(System.in);
		String input;
		input= bucky.nextLine();
		ArrayList<String> list= new ArrayList<>();
		for(int i=0; i<input.length();i++)
		{
			list.add(input.substring(i,i+1));
			
		}
		
		int signal =1;
		while(signal==1&&(list.size()>0))
		{
		for(int i=0;i<(list.size()-1);i++)
		{
			if(list.get(i).equals((list.get(i+1))))
			{
				list.remove(i);
				list.remove(i);
				break;
			}
			else if(i+1==(list.size()-1))
			{
				signal=0;
				
			}
		
			
			
		}
		
		}
	if(list.size()==0)
		{
			System.out.println("Empty String");
			
		}
	
		else {
			for(int i=0;i<list.size();i++)
		{
				System.out.print(list.get(i));
			}
			
			}
		
		
	}

}
