import java.util.Scanner;


public class q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bucky =new  Scanner(System.in);
		long n = 0,k=0;
		if(bucky.hasNextLong())
		{
		n = bucky.nextLong();
		}
		if(bucky.hasNextLong())
		{
		k=bucky.nextLong();
		}
		long result=0;
		for(long i = 0;i<=k;i++)
		{
			if(i%2==0)
			{
			
						result =result+(fact(n)/(fact(n-i)*fact(i)));
			}
		}
		System.out.print(result);
		bucky.close();
	}


	
	
    public static  long fact(long num)
    {
         long fact=1;
        for(long i=1; i<=num; i++)
        {
            fact = fact*i;
        }
        return fact;
    }
}
