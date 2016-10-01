import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class q3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		double num = 0,i=1,j,count;
		//Scanner bucky = new Scanner(System.in);
	//	num= bucky.nextDouble();
		try{
			 
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			num= Double.parseDouble(s);

		}catch(IOException e){
		  e.printStackTrace();
		}

		
		ArrayList<Double> list = new ArrayList<Double>();
		
		while(i<=num)
		{
		count=0;
		for(j=1;j<=i;j++)
		{
		if(i%j==0) 
		count++;
		}
		if(count==2)  
	
		{
			list.add(i);
		}
		i++;
		}
		
		
		
		ArrayList<Double> resultlist = new ArrayList<Double>();
		for(int x= 1 ; x< list.size();x++)
		{
			
			double comparator=0;
			for(int y=0;y<x;y++)
			{
				comparator= comparator+list.get(y);	

				if(list.get(x)==comparator)
				{
					resultlist.add(list.get(x));
				}
				
				
				
			}
			
			
			
			
			
			
			
		}
		System.out.println(resultlist.size());

		
	}
	
	

}
