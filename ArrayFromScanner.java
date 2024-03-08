import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int size;
        System.out.println("Enter the Size of the Array:");
        Scanner sc= new Scanner(System.in);
        size=sc.nextInt();
        int Array[]=new int[size];
        for (int i=0;i<size;i++){
            Array[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println("Array of index "+i +" is "+Array[i]);
        }
    }
}