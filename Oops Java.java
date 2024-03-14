// Writing a class for circle
import java.util.Scanner;
class circle{
    public double radius;

    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        circle c1=new circle();
        System.out.println("Enter the Radius of the Circle: ");
        c1.radius=sc.nextDouble();
        System.out.println("Area: "+c1.area());
        System.out.println("Perimeter: "+c1.perimeter());
        System.out.println("Circumference: "+c1.circumference());

    }
}