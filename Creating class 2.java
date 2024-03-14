import java.util.*;
class cylinder{
    public float Radius;
    public float height;
    public double volume(){
        return Math.PI*Radius*Radius*height;
    }
    public double CSA(){
        return 2*Math.PI*Radius*height;
    }
    public double TSA(){
        return (2*Math.PI*Radius*height)+(2*Math.PI*Radius*Radius);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        cylinder cy=new cylinder();
        System.out.println("Enter the Radius Of cylinder:");
        cy.Radius=sc.nextFloat();
        System.out.println("Enter the height Of cylinder:");
        cy.height=sc.nextFloat();
        System.out.println("Volume Of cylinder:"+cy.volume());
        System.out.println("CSA Of cylinder:"+cy.CSA());
        System.out.println("TSA Of cylinder:"+cy.TSA());
    }
}