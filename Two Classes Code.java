import java.util.*;
class Rectangle{
    public int length;
    public int breadth;
    public int Area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length*breadth);
    }
}
class circle{
    public int radius;
    public double Area(){
        return ((2*Math.PI)*radius);
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangle re=new Rectangle();
        circle cr=new circle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length Of Rectangle:");
        re.length=sc.nextInt();
        System.out.println("Enter the Breadth Of Rectangle:");
        re.breadth=sc.nextInt();
        System.out.println("Area of Rectangle:"+re.Area());
        System.out.println("perimeter of Rectangle:"+re.perimeter());
        System.out.println("Enter the Radius of Circle:");
        cr.radius= sc.nextInt();
        System.out.println("Area of Circle:"+cr.Area());
    }
}