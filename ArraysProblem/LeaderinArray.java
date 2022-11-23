public class LeaderinArray {
    public static void main(String[] args) {
        int[] arr = { 4, 7, 1, 0, 6 };
        System.out.println("The leaders of the second array are: ");
        printLeaders(arr, arr.length);
    }

    public static void printLeaders(int[] a, int length) {
        int max = a[length - 1];
        System.out.print(a[length - 1] + " ");
        for (int i = length - 1; i >= 0; i--) {
            if (a[i] > max) {
                System.out.print(a[i] + " ");
                max = a[i];
            }
        }
    }
}
