import java.util.Scanner;


public class hackerrankq3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner scan = new Scanner(System.in);
	       String input = scan.nextLine();
	       int vowel=0;
	       for(int i=0;i< input.length();i++)
	       {
	       	if(input.charAt(i)=='a'&&input.charAt(i)=='i'&&input.charAt(i)=='e'&&input.charAt(i)=='o'&&input.charAt(i)=='u')
	       	{
	       		vowel++;
	       	}
	       	
	       }
	       System.out.println(vowel);
	       
		//Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double y=scan.nextDouble();
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double divx,divy;
		double k=x,n=0;
		double smaller = (x-a> y-b) ? y :x;
		double testx=0,testy=0;

		
		
		if(x%a==y%b)
		{
			k= x/a;
			n=0;
		}
		else
		{
		while(testx!=x&&testy!=y)
		{
			if(smaller==y)
			{
			testx= k*a + n*a;
			testy = k*b - n*b;
			
			}
			else
			{
				testx= k*a - n*a;
				testy = k*b + n*b;
				
			}
			k--;
			n++;
		}
		if(smaller==y)
		{
			n=-n;
		}
		else
		{
			k=-k;
		}
		}
		System.out.printf("%.12f", k);
		System.out.println();
		System.out.printf("%.12f", n);

//		System.out.println(k);
//		
//		System.out.println(n);
	
		
		/* k(a,b) + n (a,b) = (x,y)
		 * 
		 * */
	}

}
