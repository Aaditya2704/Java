import java.util.Scanner;
import java.util.Arrays;

public class CyclicRotation {

    static void reverseArray(int[] a, int low, int high) {
        int mid = (high - low + 1) / 2;
        int temp;
        for (int i = 0; i < mid; i++) {
            temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array:");
            int size = sc.nextInt();
            int[] a = new int[size];
            System.out.print("Enter the array:");
            for (int i = 0; i < size; i++) {
                a[i] = sc.nextInt();
            }
            System.out.print("Enter number you want to rotate the array:");
            int k = sc.nextInt();
            // LOGIC
            int partition = size - (k + 1);
            reverseArray(a, partition + 1, size - 1);
            reverseArray(a, 0, partition);
            reverseArray(a, 0, size - 1);
            System.out.println(Arrays.toString(a));
        }

    }
}
/*
 * main thing in this problem is the partition
 * carefully look at the partition formula
 * carefully send the low and high point in the function
 * ***********************MAIN LOGIC*******************
 * FIRST REVERSE THE CYCLIC ROTATION
 * SECOND REVERSE THE ARRAY FROM THE START POSITION TO THE PARTITION
 * LAST REVERSE THE WHOLE ARRAY FROM START TO THE LAST
 */