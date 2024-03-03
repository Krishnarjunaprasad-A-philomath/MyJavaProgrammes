package string3;
public class String3 {
    public static void main(String[] args) {
        String Str4= "Hello world!";	
	char c[]={'A','B','C','D'};
	byte b[]={65,66,67,68};
	String Str1=new String(c);
	String Str2=new String(b);
        String Str5=new String(b,2,2);
	System.out.println(Str4+ " " +Str1+" "+Str2+ " "+Str5);
    }
    
}
