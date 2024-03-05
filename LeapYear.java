//Find out leap year or not
package leapyear;
import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year");
        int Year =sc.nextInt();
        if (Year%4 ==0)
        {
            if (Year%100 ==0)
            {
                if (Year%400 ==0)
                {
                    System.out.println("Its a Leap Year");
                }
                else
                    System.out.println("Not a Leap Year");
            }
            else
            {
                System.out.println("Its a Leap Year");
            }
                
        }
        else
        {
            System.out.println("Its Not a Leap Year");
        }
    }   
}
