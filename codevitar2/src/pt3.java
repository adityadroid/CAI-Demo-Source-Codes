

import java.util.*;
	

	public class pt3 
	{

	    public static void main(String[] args) 
	    {
	        int numberOfGuests=0;
	       Scanner bucky = new Scanner(System.in);
	       String inputString;
	       inputString=bucky.nextLine();
	       inputString.trim();
	       for(int i=0;i<inputString.length();i++)
	       {
	    	   inputString.t
	           char characterAt=inputString.charAt(i);
	          
	           if(characterAt==' ')
	              numberOfGuests++;
	           
	       }
	       numberOfGuests++;
	        System.out.println(numberOfGuests);
	    }
	}

