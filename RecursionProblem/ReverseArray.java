
public class ReverseArray {
    static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

    public static void reverse(int a[], int i, int n) {
        if (i >= n / 2) {
            return;
        }
        swap(a[i], a[n - i - 1]);
        reverse(a, i + 1, n);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int length = arr.length;
        reverse(arr, 0, length - 1);
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
