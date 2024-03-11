public class Main {
    public static void main(String[] args) {
        int A[][]={{3,5,9},{6,7,2},{9,5,7}};
        int B[][]={{4,5,2},{7,8,4},{8,4,9}};
        int c[][]=new int[3][3];
        for(int i=0;i<A.length;i++){
            for(int j=0;j< A[0].length;j++){
                c[i][j]=A[i][j]-B[i][j];
            }}
        for(int x[]:c){
            for (int y:x){
                System.out.println(y+" ");
            }
            System.out.println("");}}}