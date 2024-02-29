//Find out the area of the rhombus

import java.lang.*;
import java.util.Scanner;
class ArthematicPractice6
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of P and Q");
		int P ,Q;
		P=sc.nextInt();
		Q=sc.nextInt();
		float Area = (float)(P*Q)/2;
		System.out.println("Area of the rhombous:"+Area);
	}
}