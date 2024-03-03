package string7;
public class String7 {
    public static void main(String[] args) {
        String str="programmer@gmail.com";
        System.out.println(str.endsWith(".com"));
        System.out.println(str.indexOf("@"));
        System.out.println("Username of String:"+str.substring(0,10));
        System.out.println("Domian Name:"+str.substring(10));
    }
    
}
