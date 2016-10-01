import java.util.Scanner;


public class hackerrank {

	

	

	    public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);
	        int n= scan.nextInt();
	        String[] matrix = new String[n];
	        for(int i =0;i<n;i++)
	        {
	        	
	        		matrix[i]= scan.next();
	        	
	        }
	        
//	        
//	        for(int i =0;i<n;i++)
//	        {
//	        	System.out.println(matrix[i]);
//	        	
//	        	
//	        }\
	        int verticalCount =0;
	        int horizontalCount=0;
	        int rowMarker = 0,colMarker=0;
	        int startVert=0, startHorz=0;
	        for(int i =0;i<n;i++)
	        {
	        	
	        	int curCount[]= new int[matrix[i].length()];
	        	int pointer=0;

	        for(int j=0;j<matrix[i].length();j++)
	        {
	        	if(matrix[i].charAt(j)=='.')
	        	{
	        		curCount[pointer]++;
	        	}
	        	else if(matrix[i].charAt(j)=='*')
	        	{
	        		
	        		pointer++;
	        		
	        	}
	        	
	        	for(int x=0;x<matrix[i].length();x++)
	        	{

		        	if(curCount[x]>horizontalCount)
		        	{
		        		rowMarker=i;
		        		startHorz=j-curCount[x]+1;
		        		horizontalCount=curCount[x];
		        	}
	        	}
	        	
	        	
	        }
	        
	        	
	        }
	        
	        
	        
	        
	        for(int i =0;i<n;i++)
	        {
	        	int curCount[]= new int[n];
	        	int pointer=0;

	        for(int j=0;j<n;j++)
	        {
	        	if(matrix[j].charAt(i)=='.')
	        	{
	        		curCount[pointer]++;
	        	}
	        	else if(matrix[j].charAt(i)=='*')
	        	{
	        		
	        		pointer++;
	        		
	        	}
	        	
	        	for(int x=0;x<n;x++)
	        	{

		        	if(curCount[x]>verticalCount)
		        	{
		        		colMarker=i;
		        		startVert=j-curCount[x]+1;
		        		verticalCount=curCount[x];
		        	}
	        	}
	        	
	        	
	        }
	        
	        	
	        }
	        
	        
	        
	        
	      
	       
	        int[] radiushorz=new int[horizontalCount];
	        int[] radiusvert=new int[verticalCount];
	       
	  	      //rowMarker horizontalCount

	        
	        	for(int middlehorz=startHorz;middlehorz<horizontalCount+startHorz;middlehorz++)
	        	{
	        		
	        	
	        //	int middlehorz = ((horizontalCount-startHorz)/2)-1;
	        	
	        	
	        	//System.out.println("midhor:"+middlehorz);
	        	for(int i =1;i< ((middlehorz > n/2) ? n-middlehorz : middlehorz);i++)
	        	{

	        		if(matrix[rowMarker].charAt(middlehorz-i)=='.'
	        				&&
	        				matrix[rowMarker].charAt(middlehorz+i)=='.'
	        				&&
	        				matrix[rowMarker-i].charAt(middlehorz)=='.'
	        				&&
	        				matrix[rowMarker+i].charAt(middlehorz)=='.'
	        			
	        				)
	        		{
	        			radiushorz[middlehorz]++;
	        			
	        		}
	        			
	        	}
	        	
	        
	        	
	        	}
	        	
	        	
	        	
	        	for(int middlevert=startVert;middlevert<verticalCount+startVert;middlevert++)
	        	{
	        
	        //	int middlevert =( (verticalCount-startVert)/2)-1;
	        //	System.out.println("midver:"+middlevert);
	        	for(int i =1;i< ((middlevert > n/2) ? n-middlevert : middlevert);i++)
	        	{

	        		if(matrix[colMarker].charAt(middlevert-i)=='.'
	        				&&
	        				matrix[colMarker].charAt(middlevert+i)=='.'
	        				&&
	        				matrix[colMarker-i].charAt(middlevert)=='.'
	        				&&
	        				matrix[colMarker+i].charAt(middlevert)=='.'
	        			
	        				)
	        		{
	        			radiusvert[middlevert]++;
	        			
	        		}
	        			
	        	}
	        	
	        	
	        	}
	        	
	        	int finradiushorz=0;
	        	int finradiusvert=0;
	        	for(int i=0;i<horizontalCount;i++)
	        	{
	        		if(radiushorz[i]>finradiushorz)
	        		{
	        			finradiushorz=radiushorz[i];
	        		}
	        	}
	        	for(int i =0;i<verticalCount;i++)
	        	{
	        		if(radiusvert[i]>finradiusvert)
	        		{
	        			finradiusvert=radiusvert[i];
	        		}
	        	}
	        	
	        	if(finradiushorz>finradiusvert)
	        	{
	        		System.out.println(finradiushorz);
	        	}
	        	else
	        	{
	        		System.out.println(finradiusvert);

	        	}
	        	
	        	
	        
	        
	        
	        
	        
	        
	        
	       
	    }
	}

