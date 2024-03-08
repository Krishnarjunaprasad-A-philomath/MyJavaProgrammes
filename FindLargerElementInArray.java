import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the size of the Array; ");
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int Array[]=new int [size];
        for (int i=0;i<size;i++){
            Array[i] = sc.nextInt();}
        int max=Array[0];
        for(int i=0;i<size;i++){
            if(Array[i]>max){
                max=Array[i];}}
        System.out.println(max);}}