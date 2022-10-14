import java.util.*;

public class FindFrequency {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int[] a = new int[size];
            for (int i = 0; i < size; i++) {
                a[i] = sc.nextInt();
            }
            System.out.print("Enter the element you want to find the frequency:");
            int k = sc.nextInt();
            int count = 0;
            for (int i = 0; i < size; i++) {
                if (k == a[i]) {
                    count++;
                }
            }
            System.out.println("the element appears " + count + " times");
        }
    }
}