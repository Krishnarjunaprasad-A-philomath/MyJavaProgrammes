import java.util.*;
class Rectangle{
    public double length;
    public double breadth;
    public double height;

    public double area(){
        return length*breadth*height;
    }
    public double perimeter(){
        return 2*length*breadth;
    }
    public double Diagonal(){
        return Math.sqrt(length*length)+(breadth*breadth);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rectangle Re=new Rectangle();
        System.out.println("Enter the Length Of the Rectangle:");
        Re.length=sc.nextDouble();
        System.out.println("Enter the breadth Of the Rectangle:");
        Re.breadth=sc.nextDouble();
        System.out.println("Enter the height Of the Rectangle:");
        Re.height=sc.nextDouble();
        System.out.println("Area of Rectangle: "+Re.area());
        System.out.println("Perimeter of Rectangle: "+Re.perimeter());
        System.out.println("Diagonal of Rectangle: "+Re.Diagonal());
    }
}