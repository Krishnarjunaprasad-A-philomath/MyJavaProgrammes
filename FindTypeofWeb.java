package findtypeofweb;
import java.util.Scanner;
public class FindTypeofWeb {
    public static void main(String[] args) {
        System.out.println("Enter the URL: ");
        Scanner sc=new Scanner(System.in);
        String url = sc.nextLine();
        url = url.toLowerCase(); // Convert to lowercase and assign back to the variable

        // Check if the colon exists in the URL
        if (url.contains(":")) {
            String prototype = url.substring(0, url.indexOf(":"));

            if (prototype.equals("https")) {
                System.out.println("Hypertext Transfer Protocol");
            } else {
                System.out.println("File Transfer Protocol");
            }
        } else {
            System.out.println("Invalid URL format");
            return; // Exit the program if the URL format is invalid
        }
            System.out.println("Website Prototype would be: ");
        // Check if the dot exists in the URL
        if (url.contains(".")) {
            String ext = url.substring(url.lastIndexOf("."));

            if (ext.equals(".com")) {
                System.out.println("Commercial Website");
            } else if (ext.equals(".gov")) {
                System.out.println("Government Website");
            } else if (ext.equals(".org")) {
                System.out.println("Organization Website");
            } else {
                System.out.println("Other Website");
            }
        } else {
            System.out.println("Invalid URL format");
        }
    }
}