import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the array: ");
        int size=sc.nextInt();
        int A[]=new int[size];
        for(int i=0;i<size;i++){
            A[i]=sc.nextInt();
        }
        int max1=A[0];
        int max2=A[0];
        int max3=A[0];
        for(int i=0;i<A.length;i++){
            if (A[i]>max1){
                max3=max2;
                max2=max1;
                max1=A[i];}
            else{
                if (max2<A[i]){
                    max3=max2;
                    max2=A[i];}
            else {
                if(A[i] > max3){
                    max3 = A[i];}}
            }
            }
        System.out.println("Largest number in array: "+ max1);
        System.out.println("Second largest number in array: "+max2);
        System.out.println("Third largest number in array: "+max3);
    }

}