import java.util.*;
public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
acc[] obj = new acc[100];

System.out.println("Welcome to ICICI Bank \n");
int x=0,choice=0,ac,pin,m=1;
float bal;
Scanner sc = new Scanner(System.in);
while(m!=0)
{
System.out.println("Enter choice:");
System.out.println("1.Register New Account");
System.out.println("2.Login To Existing Account");
System.out.println("3.Exit");
choice = sc.nextInt();

if(choice==1&&x<101)
{
	System.out.println("Enter Account Number:");
	ac = sc.nextInt();
	System.out.println("Enter PIN:");
	
pin =  sc.nextInt();

	System.out.println("Enter Deposit Amount:");
bal = sc.nextFloat();

obj[x] = new acc();
obj[x].create(ac, bal, pin);

x=x+1;

}
else if(choice==2)
{
	System.out.println("Enter Account number:");
	ac = sc.nextInt();
	System.out.println("Enter Pin:");
	pin = sc.nextInt();
	
	for(int y=0;y<x;y++)
	{
		if(obj[y].ac==ac&&obj[y].pin==pin)
		{
		while(m!=0)
		{
			choice=0;
			System.out.println("WELCOME!");
			System.out.println("Enter Your Choice");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposit");
			System.out.println("3.Display Info");

			System.out.println("4.Exit");
choice = sc.nextInt();

if(choice==1)
{
	obj[y].withdraw();
}
else if(choice==2)
{
	obj[y].deposit();
}
else if(choice==3)
{
	obj[y].display();
}
else if(choice==4)
{
	break;
}
	}
		break;
			
}
		else if(y==x-1)
		{
		
					System.out.println("Incorrent PIN or Account Number!");

				
			
		}
			
		
		
	
	}
	
	
	
}
else if(choice==3)
	{
	break;
	}


}



	}
	

}
