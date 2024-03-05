package menudrivenforarthematic;
import java.util.Scanner;
public class MenuDrivenForArthematic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("=====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MULTI");
        System.out.println("DIVD");
        
        System.out.println("Enter two numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Arthematic operation: ");
        String operator=sc.nextLine();
        operator = operator.toUpperCase();
        switch(operator){
            case "ADD": System.out.println(x+y);
            break;
            case "SUB": System.out.println(x-y);
            break;
            case "MULTI":System.out.println(x*y);
            break;
            case "DIVD": System.out.println(x/y);
            break;
            default : System.out.println("Enter the mentioned Arthematic Operation:");}}}

