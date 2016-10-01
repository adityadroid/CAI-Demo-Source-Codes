import java.util.Scanner;
public class mainclass {

	/**
	 * @param args
	 */
	
static void output()
{
	System.out.println("PRINT");
	
}
static void output(int val)
{
	System.out.println("Value is ="+val);
}
static void output(String s)
{
	System.out.println("String is: \n"+s);
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
output();

if(choice==1)
{
	System.out.println("Enter value");
val = sc.nextInt();
output(val);

}
else if(choice==2)
{
	String waste;
	System.out.println("Enter value");
	waste=sc.nextLine();
ch = sc.nextLine().toString();
output(ch);

}


}


}

