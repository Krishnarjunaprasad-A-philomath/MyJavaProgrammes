import java.lang.*;
import java.util.*;
class ArthematicPractice2
{
	public static void main(String arg[])
	{
		int a,b,c;
		float s;
		double Area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the sides of triangle:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		s=(a+b+c)/2f;
		Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println(Area);
	}
}
