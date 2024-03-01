import java.lang.*;
import java.util.Scanner;
public class BitwiseOper
{
	public static void main (String arg[])
	{
		int x=10,y=6,z,a,b;
		z=x&y;
		a=x^y;
		b=y&x;
		x=x<<1;
		y=y>>2;
		System.out.println(z);
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
		
	}
}