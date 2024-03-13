public class Main {
    static void fun(int x){
        if (x>0){
            System.out.println(x);
            fun(x-1);
        }
    }
    static void fun2(int x){
        if (x>0){
            fun2(x-1);
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        fun(5);
        System.out.println(" ");
        fun2(6);
    }
}