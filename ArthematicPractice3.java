import java.lang.*;
import java.util.Scanner;
class ArthematicPractice3
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("PLease enter Radius of Circle: ");
		int R = sc.nextInt();
		float Area = (float) (3.14*R*R);
		System.out.println("Area of the traingle: "+Area);
	}
}