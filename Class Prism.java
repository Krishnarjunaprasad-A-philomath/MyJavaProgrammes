import java.util.*;
class Prism{
    public int Base;
    public int Height;
    public int lenghtA;
    public int lenghtB;
    public int lenghtC;
    public int perimeterRectangle(){
        return 2*(Base*Height);
    }
    public int perimeterTriangular(){
        return lenghtA+lenghtB+lenghtC;
    }
    public int volume(){
        return Base*Height;
    }
    public int SurfaceAreaRec(){
        return (2*Base)+(2*(Base*Height)*Height);
    }
    public int SurfaceAreaTri(){
        return (2*Base)+((lenghtA+lenghtB+lenghtC)*Height);
    }
    public int LateralSurfaceAreaRec(){
        return (2*(Base*Height)*Height);
    }
    public int LateralSurfaceAreaTri(){
        return ((lenghtA+lenghtB+lenghtC)*Height);
    }
}

public class Main {
    public static void main(String[] args) {
        Prism ps=new Prism();
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the Base:");
        ps.Base=sc.nextInt();
        System.out.println("Please Enter the Height:");
        ps.Height=sc.nextInt();
        System.out.println("Please Enter the Shape of BASE:");
        String shape=sc.next();
        shape =shape.toLowerCase();
        if (shape.equals("rectangle")){
            System.out.println("Volume of the Prism:"+ps.volume());
            System.out.println("perimeter of the Prism:"+ps.perimeterRectangle());
            System.out.println("SurfaceArea of the Prism:"+ps.SurfaceAreaRec());
            System.out.println("LateralSurfaceArea of the Prism:"+ps.LateralSurfaceAreaRec());
        }
        else if(shape.equals("triangle")){
            System.out.println("Please Enter the lenghtA:");
            ps.lenghtA=sc.nextInt();
            System.out.println("Please Enter the lenghtB:");
            ps.lenghtB=sc.nextInt();
            System.out.println("Please Enter the lenghtC:");
            ps.lenghtC= sc.nextInt();
            System.out.println("Volume of the Prism:"+ps.volume());
            System.out.println("perimeter of the Prism:"+ps.perimeterTriangular());
            System.out.println("SurfaceArea of the Prism:"+ps.SurfaceAreaTri());
            System.out.println("LateralSurfaceArea of the Prism:"+ps.LateralSurfaceAreaTri());
        }
        else{
            System.out.println("Please Enter the Shape fo Base Rectangle OR Triangle:");
        }
    }
}