import java.util.Arrays;

public class NextPermutaiton {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2 };
        Solution(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Solution(int[] A) {
        if (A == null || A.length <= 1) {
            return;
        }
        int i = A.length - 2;
        while (i >= 0 && A[i] >= A[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = A.length - 1;
            while (A[j] <= A[i])
                j--;
            swap(A, i, j);
        }
        reverse(A, i + 1, A.length - 1);
    }

    public static void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    public static void reverse(int[] A, int i, int j) {
        while (i < j)
            swap(A, i++, j--);
    }
}
