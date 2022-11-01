
public class ReverseArray {
    static void printArray(int[] a, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void reverse(int a[], int start, int end) {

        if (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            reverse(a, start + 1, end - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int length = arr.length;
        reverse(arr, 0, length - 1);
        printArray(arr, length);
    }
}
