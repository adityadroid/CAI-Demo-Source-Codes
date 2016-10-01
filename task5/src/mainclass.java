import java.util.*;
public class mainclass {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		float val;
		String str,wst;
		
		System.out.println("Enter value:");
		val= sc.nextFloat();
		System.out.println("Enter colour:");
		wst=sc.nextLine();
		str = sc.nextLine();
		System.out.println("Enter the type of shape: \n1.Square \n2.Circle");
		choice = sc.nextInt();
if(choice==1)
{
	square obj = new square(val,str);
	obj.cal();
	obj.print();
}
else if(choice==2)
{
	circle obj = new circle(val,str);
	obj.cal();
	obj.print();
}



	}

}
