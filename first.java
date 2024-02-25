import java.lang.*;
import java.util.*;
class first
{
	public static void main(String arg[])
	{
		Scanner j= new Scanner(System.in);
		System.out.println("HEllo , Please enter your name: ");
		String name = j.nextLine();
		System.out.println("Hii"+ name);
		System.out.println("Please enter your age:");
		int age=j.nextInt();
		System.out.println("Your age is "+age);
		System.out.println("After how many years age you can predict:");
		int Age2=j.nextInt();
		System.out.println("Your age after 5 years :"+Age2);
				
	}
}