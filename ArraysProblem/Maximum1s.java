public class Maximum1s {
    static int findMaxConsecutive1s(int[] arr) {
        int counter = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                counter++;
            } else {
                counter = 0;
            }
            max = Math.max(counter, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = { 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1 };
        int max = findMaxConsecutive1s(a);
        System.out.println(max);
    }
}