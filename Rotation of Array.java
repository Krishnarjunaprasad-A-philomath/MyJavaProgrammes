public class Main {
    public static void main(String[] args) {
        int A[] = {5, 6, 23, 12, 17, 25, 64};
        //Left Rotation
        System.out.println("Before Left Rotation: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println(" ");
        int temp = A[0];
        for (int i = 1; i < A.length; i++) {
            A[i - 1] = A[i];
        }
        System.out.println("After Left Rotation: ");
        A[A.length - 1] = temp;
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        // Right Rotation
        A = new int[]{5, 6, 23, 12, 17, 25, 64};
        System.out.println("");
        System.out.println("Before Right Rotation: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");}
        int temp2=A[A.length-1];
        for (int i = A.length - 1; i > 0; i--) {
            A[i] = A[i - 1];
        }
        System.out.println("");
        System.out.println("After Right Rotation: ");
        A[0] = temp2;
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

    }
}