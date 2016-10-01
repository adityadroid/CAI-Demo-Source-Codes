import java.util.*;
public class mainclass {

	/**
	 * @param args
	 */
	static int factorial(int x)
	{
		int res=1;
		if(x==1)
		{	res=x;
			return res;}
		else
		{res=x*factorial(x-1);
		return res;}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
int x,fact=1;
x = sc.nextInt();
fact=factorial(x);

System.out.println("The factorial is:\n"+fact);
	}

}
