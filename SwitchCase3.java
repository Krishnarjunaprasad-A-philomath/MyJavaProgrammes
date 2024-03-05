package switchcase3;
import java.util.Scanner;
public class SwitchCase3 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the URl: ");
        String url = sc.nextLine();
        String Domine = url.substring(url.lastIndexOf("."));
        Domine = Domine.toLowerCase();
        switch(Domine){
            case ".com":System.out.println("Commerical Website");
            break;
            case ".org":System.out.println("Organizational Website");
            break;
            case ".gov":System.out.println("GOvernment Website");
            break;
            case ".in":System.out.println("interrelational Website");
            break;
            default:System.out.println("Enter valid Website address");}}}
// Test Cases: www.instagram.com
//www.APPSC.gov
//www.ApSSDC.org
//tirumala.org
//tirumalavenkata.orf