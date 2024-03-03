
package string4;

public class String4 {
    public static void main(String[] args) {
       String New,New1,New2,New3,New4,New5,New6;
		New = "  NotePad  ";
		New1 = New.toLowerCase();
		New2 = New.toUpperCase();
		New3 = New.trim();
		New4 = New.substring(4);
		New5 = New.substring(2,5);
		New6 = New.replace('e','g');
                System.out.println(New.length());
		System.out.println("String: "+New);
		System.out.println("LowerCase: "+New1);
		System.out.println("UpperCase :"+New2);
		System.out.println("Trimming of String: "+New3);
		System.out.println("SubString: "+New4);
		System.out.println("SubString of String: "+New5);
		System.out.println("Repalce the E with G in String: "+New6);
    }
    
}
