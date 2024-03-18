import java.util.*;
    class Cubiod {
        public int length;
        public int width;
        public int height;
        public int volume() {
            return length * width * height;
        }
        public int surfaceArea() {
            return 2 * length * width + 2 * length * width + 2 * width * height;
        }
        public int d() {
            return length * length + width * width + height * height;
        }
        public double diagonal() {
            return Math.sqrt(length * length + width * width + height * height);
        }
    }
public class Main {
    public static void main(String[] args) {
        Cubiod cd=new Cubiod();
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the Lenght Of Cubiod:");
        cd.length=sc.nextInt();
        System.out.println("Please Enter the Widht Of Cubiod:");
        cd.width=sc.nextInt();
        System.out.println("Please Enter the Height Of Cubiod:");
        cd.height=sc.nextInt();
        System.out.println("Volume Of Cubiod:"+cd.volume());
        System.out.println("SurfaceArea Of Cubiod:"+cd.surfaceArea());
        System.out.println("Diagonal Of Cubiod:"+cd.diagonal());
    }
}