import java.lang.*;
import java.util.*;
class Main{
    public static void main(String args[]){
        int Sum=0;
        int Product=1,size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        size=sc.nextInt();
        int  Arr []=new int [size];
        for (int i=0;i<size;i++){
            Arr[i]=sc.nextInt();}
        for (int j=0;j<size;j++){
            Sum=Sum+Arr[j];}
        for(int j=0;j<size;j++){
            Product=Product * Arr[j];
        }
        System.out.println("Sum of the Array: "+ Sum);
        System.out.println("Product of the Array: "+ Product);
    }
}