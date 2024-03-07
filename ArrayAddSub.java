package arrayadd.sub;
public class ArrayAddSub {
    public static void main(String[] args) {
        int Array[]={21,23,44,56,44,87},Addition =0,Subtraction =0,RevSubtraction=0;
        for(int i=0;i<Array.length;i++){
            Addition = Addition+Array[i];}
        System.out.println("Addition of the Array: "+Addition);
        for (int a=0;a<Array.length;a++){
            Subtraction=Subtraction-Array[a];}
        System.out.println("Subtraction of the Array: "+Subtraction);
        for (int b=Array.length-1;b>0;b--){
            RevSubtraction=RevSubtraction-Array[b];}
        System.out.println("RevSubtraction of the Array: "+RevSubtraction);
        
            
    }
    
}
