import java.util.Scanner;
import java.util.Arrays;

public class CyclicRotation {

    static void reverseArray(int[] a, int m, int k) {
        int mid = (k + m) / 2;
        for (int i = k; i < mid; i++) {
            int temp;
            temp = a[i];

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter number you want to rotate the array:");
        int k = sc.nextInt();
        // LOGIC
        int startOfsubArray = size - (k + 1);
        reverseArray(a, size, startOfsubArray);
        System.out.println(Arrays.toString(a));

    }
}
