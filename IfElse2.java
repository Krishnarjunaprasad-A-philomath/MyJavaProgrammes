// Find out Young or not
package ifelse2;
import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args) {
        int age;
        System.out.println("Please enter the age: ");
        Scanner sc = new Scanner(System.in);
        age= sc.nextInt();
        if (age>=14&& age<=45)
        {
            System.out.println("Young");
        }
        else
        {
            System.out.println("Not young");
        }
    }
    
}
