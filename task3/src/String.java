import java.util.*;


public class String {

	
	java.lang.String str;
	java.lang.String rev;
	Scanner scan = new Scanner(System.in);
	
	String()
	{
		str=null;
	}
	void Inputstring()
	{
		java.lang.String wst;
		System.out.println("Enter the string");
		wst=scan.nextLine();

		str=scan.nextLine();

	}
	void reverse()
	{
		int x=str.length(),i=0;
		
		char test[] = new char[x];
		for(int s=x;s>0;s++)
		{
		test[i]=str.charAt(s);
		
		
		}
		rev = test.toString();
		
	}
	void Outputstring()
	{
	System.out.println("The Original String is:");

	System.out.println(str);

	System.out.println("The Reverse String is:");

	System.out.println(rev);

	}

}
