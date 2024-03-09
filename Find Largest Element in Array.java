import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter thr Size of the Array");
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int Arr[] =new int [size];
        for (int i=0;i<Arr.length;i++){
            Arr[i]=sc.nextInt();}
        int max=Arr[0];
        for(int i=0;i<Arr.length;i++){
            if(Arr[i]>max){
                max=Arr[i];}}
        System.out.println("Largest Number in array: ");
        System.out.println(max);
    }
}