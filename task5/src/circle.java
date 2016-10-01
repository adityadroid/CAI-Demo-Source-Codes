
public class circle extends shape
{

	circle(float a, String b) {
		super(a, b);
		
	}
	void cal()
	{
		double pai=3.14;
		
		area=var*var*pai;
		pm=2*pai*var;
		
	}
	void print()
	{
		System.out.println("The details of object are:");

		System.out.println("Type:Circle");

		System.out.println("Area:"+area);

		System.out.println("Perimeter:"+pm);

	}
			
}
