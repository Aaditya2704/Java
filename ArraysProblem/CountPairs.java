import java.util.Scanner;
import java.util.HashMap;

public class CountPairs {
    public static int getPairs(int arr[], int k, int size) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (mp.containsKey(k - arr[i])) {
                count++;
            }
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int sizeOfArray = sc.nextInt();
            int[] a = new int[sizeOfArray];
            for (int i = 0; i < sizeOfArray; i++) {
                a[i] = sc.nextInt();
            }
            System.out.print("Enter the sum of pairs you want to find: ");
            int k = sc.nextInt();
            // LOGIC
            int availablePairs = getPairs(a, k, sizeOfArray);
            System.out.println(availablePairs);
        }
    }
}
