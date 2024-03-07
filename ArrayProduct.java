package arrayproduct;
public class ArrayProduct {
    public static void main(String[] args) {
        int Arr[]={2,3,5,54,34,34,23},Product=1;
        for (int i=0;i<Arr.length;i++){
            Product = Product*Arr[i];}
        System.out.println("Product of the Array: "+Product);
        System.out.println("Elements of Array: ");
        for (int x:Arr){
            System.out.println(x);}
        System.out.println("Reverse Order Of Elements in Array: ");
        for (int i=Arr.length-1;i<0;i--){
            System.out.println(Arr[i]);}
    }
    
}
