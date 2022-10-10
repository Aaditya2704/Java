import java.util.Scanner;
import java.util.HashMap;

class UnionOfTwoArrays {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int sizeOfFirstArray = sc.nextInt();
            int sizeOfSecondArray = sc.nextInt();

            int[] a1 = new int[sizeOfFirstArray];
            int[] a2 = new int[sizeOfSecondArray];

            for (int i = 0; i < sizeOfFirstArray; i++) {
                a1[i] = sc.nextInt();
            }
            for (int i = 0; i < sizeOfSecondArray; i++) {
                a2[i] = sc.nextInt();
            }
            // LOGIC
            HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();

            for (int i = 0; i < sizeOfFirstArray; i++) {
                mp.put(a1[i], 1);
            }
            for (int i = 0; i < sizeOfSecondArray; i++) {
                mp.put(a2[i], 1);
            }
            for (Integer i : mp.keySet()) {
                System.out.print(i + " ");
            }
        }

    }
}