import java.lang.*;
import java.util.*;
public class ArthematicPractice1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Base of the Triangle: ");
	float Base = sc.nextFloat();
	System.out.println("Please Enter the Height of the Triangle: ");
	float Height = sc.nextFloat();
        float Area = (Base * Height)/2; //Area =(1f/2f)*Base * Height and Area = Base* Height /0.5f
        System.out.println("Area of the Trainagel is: "+Area);
    }
    
}