// Various methods to create 2D Arrays!
public class Main {
    public static void main(String[] args) {
        int Arr[][]=new int[5][5];
        int A[][];
        A=new int[3][3];
        int c[][]={{2,3,4,4},{4,5,6,3},{2,5,7,3}};
        int d[][]=new int[3][];
        d[0]=new int[1];
        d[1]=new int[4];
        d[2]=new int[3];
        for(int i=0;i<d.length;i++){
            for (int j=0;j<d[i].length;j++){
                System.out.println(d[i][j]+" ");
            }
        }

    }
}