import java.util.*;
class Cone{
    public double radius;
    public double height;
    public double SlantHeight(){
        return Math.sqrt((radius*radius)+(height*height));
    }
    public double SurfaceArea(){
        return Math.PI*radius*(radius+height);
    }
    public double Volume(){
        return (1.0/3)*Math.PI*(radius*radius)*height;
    }
}
public class Main {
    public static void main(String[] args) {
        Cone C=new Cone();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius of Cone:");
        C.radius=sc.nextDouble();
        System.out.println("Enter the Height of Cone:");
        C.height=sc.nextDouble();
        System.out.println("Slant height of Cone:"+C.SlantHeight());
        System.out.println("SurfaceArea of Cone:"+C.SurfaceArea());
        System.out.println("Volume of Cone:"+C.Volume());
    }
}