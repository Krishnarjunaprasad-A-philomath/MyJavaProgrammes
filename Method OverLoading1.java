import java.util.*;

public class Main {
    static int area(int x, int y) {
        System.out.println("Area of the Rectangle:");
        return (x * y);
    }
    static float area(float x) {
        System.out.println("Area of the Circle:");
        float a = (float) Math.PI * (x * x);
        return a;
    }
    static float areas(float x) {
        System.out.println("Area of the Square:");
        return (x * x);
    }
    static int areaT(int x, int y) {
        System.out.println("Area of the Triangle:");
        return ((1 / 2) * x * y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Shape:");
        String shape = sc.nextLine();
        shape = shape.toLowerCase();
        if (shape.equals("rectangle")) {
            System.out.println("Enter the Length of Rectangle:");
            int length = sc.nextInt();
            System.out.println("Enter the Breadth of Rectangle:");
            int breadth = sc.nextInt();
            int area = area(length, breadth);
            System.out.println(area);
        } else if (shape.equals("circle")) {
            System.out.println("Enter the Radius of Circle:");
            float radius = sc.nextFloat();
            float area = area(radius);
            System.out.println(area);
        } else if (shape.equals("triangle")) {
            System.out.println("Enter the Length of Triangle:");
            int length = sc.nextInt();
            System.out.println("Enter the Height of Triangle:");
            int height = sc.nextInt();
            int area = areaT(length, height);
            System.out.println(area);
        } else if (shape.equals("square")) {
            System.out.println("Enter the Side of Square:");
            int side = sc.nextInt();
            float area = areas(side);
            System.out.println(area);
        } else {
            System.out.println("Please select a shape like Rectangle, Circle, Triangle, or Square");
        }
    }
}
