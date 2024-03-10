import java.lang.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the Size of the Array: ");
        Scanner sc=new Scanner(System.in);
        int size =sc.nextInt();
        int Arr[]=new int[size];
        for (int i=0;i<Arr.length;i++){
            Arr[i]=sc.nextInt();
        }
        int min1=Arr[0];
        int min2=Arr[0];
        for(int j=0;j<Arr.length;j++){
            if(Arr[j]<min1){
                min2 =min1;
                min1 = Arr[j];
            }
        else{
            if (Arr[j]<min2){
                min2=Arr[j];}}}
        System.out.println("Minmum Element in Array:"+min1);
        System.out.println("2nd minmum Element in Array:"+min2);}}