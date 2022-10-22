import java.util.Arrays;

public class PositiveNegativeSorting {
    public static void main(String[] args) {
        int[] a = { 12, -3, -4, 2, -5, 22 };
        int length = a.length;
        int[] result = new int[length];
        int pos = 0, neg = 1;
        for (int i = 0; i < length - 1; i++) {
            if (a[i] > 0) {
                result[pos] = a[i];
                pos += 2;
            }
            if (a[i] < 0) {
                result[neg] = a[i];
                neg += 2;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
