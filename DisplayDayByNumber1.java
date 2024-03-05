package displaydaybynumber1;
import java.util.Scanner;
public class DisplayDayByNumber1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the date:");
        int date = sc.nextInt();
        
        if (date >= 1 && date <= 7) {
            if(date==1) {
                System.out.println("Monday");
            }
            if(date==2) {
                System.out.println("Tuesday");
            }
            if(date==3) {
                System.out.println("Wednesday");
            }
            if(date==4) {
                System.out.println("Thursday");
            }
            if(date==5) {
                System.out.println("Friday");
            }
            if(date==6) {
                System.out.println("Saturday");
            }
            if(date==7) {
                System.out.println("Sunday");
            }
        } else {
            System.out.println("Enter the Date between 1 to 7");
        }
    }
}
    }
    
}
