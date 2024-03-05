// Fin the radix of a number in a  String 
package radixofstring;
import java.util.Scanner;
public class RadixOfstring {
    public static void main(String[] args) {
        String num;
        System.out.println("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        num = sc.nextLine();
        if (num.matches("[01]+"))
        {
            System.out.println("Binary number, Radix is 2");
        }
        else if(num.matches("[0-7]+"))
        {
            System.out.println("Octal number, Radix is 8");
        }
        else if (num.matches("[0-9A-F]+"))
        {
            System.out.println("Octal number, Radix is 8");
        }
        else
        {
            System.out.println("Not a Number");
        }
    }
    
}
