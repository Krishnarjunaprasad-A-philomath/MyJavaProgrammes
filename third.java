import java.lang.*;
import java.util.*;
class third
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello! Please enter your name:");
		String Name = sc.next();
		System.out.println("Welcome 'MISS/MR' "+ Name + "\nPlease ENTER YOUR AGE:");
		int Age = sc.nextInt();
		System.out.println("Your age is:"+Age + "\nEnter your Percentage:");
		float Per = sc.nextFloat();
		System.out.println("Your percentage would be :"+Per);
		
	}
}