public class Main {
    static void show(int ...A){
        for(int x:A){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        show();
        show(20,30,40,70);
        System.out.println(" ");
        show(new int[]{2,34,43,22,35,56});
    }
}
