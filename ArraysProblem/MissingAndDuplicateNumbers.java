public class MissingAndDuplicateNumbers {

    static int x, y;

    static void getTwoElements(int arr[], int n) {

        int xor1;

        int set_bit_no;

        int i;
        x = 0;
        y = 0;

        xor1 = arr[0];

        for (i = 1; i < n; i++)
            xor1 = xor1 ^ arr[i];

        for (i = 1; i <= n; i++)
            xor1 = xor1 ^ i;

        set_bit_no = xor1 & ~(xor1 - 1);

        for (i = 0; i < n; i++) {
            if ((arr[i] & set_bit_no) != 0)

                x = x ^ arr[i];

            else

                y = y ^ arr[i];
        }
        for (i = 1; i <= n; i++) {
            if ((i & set_bit_no) != 0)

                x = x ^ i;

            else

                y = y ^ i;
        }
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 5, 4, 6, 7, 5 };
        int size = arr.length;
        getTwoElements(arr, size - 1);
    }
}