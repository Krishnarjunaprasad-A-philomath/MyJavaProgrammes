import java.util.*;
public class Main {
    public static void main(String[] args) {
        String Words[]={"Java","Python","PHP","C","CPP","Ruby","javaScript"};
        Arrays.sort(Words);
        for(String x:Words){
            System.out.println(x);
        }
    }
}