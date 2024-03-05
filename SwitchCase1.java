// Using this Switch case in application that used to OPTION in a Application contauins the keyword like Save,open,save as,close,exit.

package switchcase1;
import java.util.Scanner;
public class SwitchCase1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Option i.e New,Open, Save, Save As, Close, Exit");
        String option = sc.nextLine();
        option = option.toLowerCase();
        switch(option){
            case "new": System.out.println("New file is created!");
            break;
            case "open": System.out.println("File is opened!");
            break;
            case "save as": System.out.println("File is Saved AS!");
            break;
            case "close": System.out.println("Closed the file!");
            break;
            case "exit": System.out.println("Exit the Application");
            break;
            default: System.out.println("Invalid Option"); }
    }
}
                
    
    

