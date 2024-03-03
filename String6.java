package string6;
public class String6
{
    public static void main(String[] args)
    {
       String str="www.sbi.com";
       System.out.println(str.startsWith("www"));
       System.out.println(str.endsWith("com"));
       System.out.println(str.charAt(3));
       System.out.println(str.indexOf("sbi"));
       String str2=str.replace("w", "e");
       System.out.println(str2);
       System.out.println(str.equals(str2));
    }
    
}
