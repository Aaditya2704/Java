public class ReverseArray {
    static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

    static void reverse(int[] a, int i, int N) {
        if (i >= N / 2) {
            return;
        }
        swap(a[i], a[N - i - 1]);
        reverse(a, i + 1, N);
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        int length = a.length;
        reverse(a, 0, length);
        for (int i = 0; i < length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}