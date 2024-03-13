public class Main {
    static int max(int x,int y){
        return x > y ? x : y;
    }
    static float max(float x,float y){
        return x > y ? x : y;}
    static int max(int x,int y,int z) {
        return x>y&& x>z ? x:(y>z?y:z);
    }
    public static void main(String[] args) {
        int a=34,b=45,c=42;
        float d=35.6f,e=54.3f;
        System.out.println(max(a,b));
        System.out.println(max(d,e));
        System.out.println(max(a,b,c));

    }
}