package switchcase;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Date: ");
        int week = sc.nextInt();
        switch(week){
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wedneday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("sunday");
            break;
            default: System.out.println("Invalid Date");
        }
                
    }
    
}
