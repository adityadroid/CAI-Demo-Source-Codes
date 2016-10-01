import java.util.*;
public class acc implements account{

	int ac;
	int pin;
	float bal;
	Scanner sc = new Scanner(System.in);
	
	acc()
	{
		ac=0;
		pin=0;
		bal=0;
	}
	void create(int acn,float baln,int pinn)
	{
		ac=acn;
		bal=baln;
		pin=pinn;
	}
	
	void withdraw()
	{
	System.out.println("Enter the amount");
	float wd;
	wd  = sc.nextFloat();
	if(bal>wd||bal==wd)
	{
	  bal=bal-wd;
		System.out.println("New Available Balance= "+bal);

	}
	else
		System.out.println("Insufficient Balance!");

	}
	
	void deposit()
	{
		System.out.println("Enter amount:");
		float dep;
		dep = sc.nextFloat();
		bal = bal+dep;
		System.out.println("New Available Balance= "+bal);
		


	}
	void display()
	{
		System.out.println("Bank Name:"+bankname);

		System.out.println("Account Number:"+ac);

		System.out.println("Available Balance:"+bal);


	}
}
