import java.util.*;
public class mainclass {

	/**
	 * @param args
	 */
	
static void printer()
{
	System.out.println("I'm normal printer");
	
}
static void printer(int val)
{
	System.out.println("I print value which is ="+val);
}
static void printer(String s)
{
	System.out.println("I print string which is : \n"+s);
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int val;
String ch;
int choice=0;
System.out.println("Enter your choice");
System.out.println("1.int");

System.out.println("2.String");
System.out.println("3.Exit");
choice =  sc.nextInt();
printer();

if(choice==1)
{
	System.out.println("Enter value");
val = sc.nextInt();
printer(val);

}
else if(choice==2)
{
	String waste;
	System.out.println("Enter value");
	waste=sc.nextLine();
ch = sc.nextLine().toString();
printer(ch);

}


}


}
