import java.util.Scanner;


public class q4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String day,date;
		Scanner bucky = new Scanner(System.in);
		day = bucky.nextLine();
		
		if( !(day.equals("Monday")|day.equals("Tuesday")|day.equals("Wednesday")|day.equals("Thursday")|day.equals("Friday")|day.equals("Saturday")|day.equals("Sunday")))
		{
			System.out.print("Invalid Day");
			return;
		}
		date = bucky.nextLine();
		int month,year,numdate;
		String[] splitarray = date.split("/");
		numdate = Integer.parseInt(splitarray[0]);
		month = Integer.parseInt(splitarray[1]);
		year = Integer.parseInt(splitarray[2]);
		int feb=28;
		int dayOverall=0;
		
		if((year%4==0)&&(year%100!=0))
		{
			
			feb=29;
		}
		if(year%400==0)		
		{
		feb=29;
		}
	
		int daysInEachMonth[] =  {31,feb,31,30,31,30,31,30,31,30,31,30};
		if(numdate>daysInEachMonth[month-1]||month>12)
		{
			System.out.print("Invalid Date");
			return;
		}
		
		if(day.equals("Saturday")||day.equals("Sunday"))
		{
			System.out.print("0");
			return;
		}
		
		else
		{
			
			for(int i =1;i<year;i++)
			{
				for(int j = 0; j<12;j++)
				{
					for(int k = 0; k< daysInEachMonth[j];k++)
					{
						dayOverall = dayOverall+1;
						
					}
					
				}
			}
			
			for(int i=1;i<month;i++)
			{
				for(int k = 0; k< daysInEachMonth[i];k++)
				{
					dayOverall = dayOverall+1;
					
				}
				
			}
			for(int i=0;i<numdate;i++)
			{
				
				dayOverall=dayOverall+1;
			}
			
			if(dayOverall%4==0)
			{
				System.out.print("0");
				return;
			}
			
			
			int numberOfstars=0;
			for(int i =0;i <month-1;i++)
			{
				numberOfstars=numberOfstars+daysInEachMonth[i];
			}
			
			numberOfstars=numberOfstars+numdate;
			if(numberOfstars>50)
			{
				numberOfstars=50;
			}
			System.out.print(numberOfstars);
		}
		
		
		
		

	}

}
