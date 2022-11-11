public class SubarrayWithSum {
    public static void main(String[] args) {
        int[] a = { 5, 3, 2, 1 };
        int k = 10;
        int length = findMaxLen(a, k);
        System.out.println(length);
    }

    static int findMaxLen(int[] a, int k) {
        int sum = 0;
        int len = 0;
        for (int i = 0; i < a.length; i++) {
            if (sum > k) {
                sum = 0;
                len = 0;
            }
            if (sum < k) {
                sum += a[i];
                len++;
            }
            if (sum == k) {
                break;
            }
        }
        return len;
    }
}
