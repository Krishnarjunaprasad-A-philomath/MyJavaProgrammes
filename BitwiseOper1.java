import java.lang.*;
import java.util.Scanner;
public class BitwiseOper1
{
	public static void main (String arg[])
	{
		int x=10,y=6,z,a,b;
		System.out.println("Before Swaping values:");
		System.out.println(x+" " +y);
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("After Swaping values:");
		System.out.println(x+" " +y);
		
	}
}