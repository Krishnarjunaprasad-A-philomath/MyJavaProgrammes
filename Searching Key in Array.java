
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the size of the Array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] Arr = new int[size];

        System.out.println("Enter the elements of the Array:");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Searching key Value:");
        int key = sc.nextInt();

        boolean keyFound = false;

        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == key) {
                System.out.println("Key Found at index: " + i);
                keyFound = true;
                break; // Exit the loop once the key is found
            }
        }

        if (!keyFound) {
            System.out.println("Key not found");
        }
    }
}
