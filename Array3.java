import java.lang.*;
import java.util.Scanner;
public class Array3
{
    public static void main(String arg[])
    {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        size=sc.nextInt();
        int Array []=new int [size];
        System.out.println("Enter the elements in the Array:");
        for (int i=0;i<size-1;i++){
            Array[i]=sc.nextInt();}
        for (int i=0;i<size-1;i++){
            System.out.println(Array[i]);}
    }
}