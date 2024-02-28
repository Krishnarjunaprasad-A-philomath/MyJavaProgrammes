import java.lang.*;
import java.util.Scanner;
class ArthematicPractice4
{
	public static void main(String arg[])
	{
		int height,base1,base2;
		System.out.println("Enter height,Base1 and Base2 of Trapezoid ");
		Scanner sc = new Scanner(System.in);
		height = sc.nextInt();
		base1 = sc.nextInt();
		base2 = sc.nextInt();
		float Area = (float)(0.5*(base1+base2)*height);
		System.out.println("Area of the Trapezoid: "+Area);
	}
}