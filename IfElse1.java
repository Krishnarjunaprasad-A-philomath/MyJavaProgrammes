// Checking whether the given number is Even or Odd
package ifelse1;
import java.util.Scanner;
public class IfElse1 
{
    public static void main(String[] args) {
        int N;
        System.out.println("Please Enter the number: ");
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        if (N%2 == 0)
        {
            System.out.println("The Given number  is Even Number");
        }
        else
        {
            System.out.println("The Given number is odd");
        }
    }
    
}
