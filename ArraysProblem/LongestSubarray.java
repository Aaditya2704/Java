import java.util.*;

class LongestSubarray {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 6, 0 };
        int k = 7;
        int sum = subArraySum(arr, k);
        System.out.println(sum);
    }

    public static int subArraySum(int[] arr, int k) {
        int sum = 0, count = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (mp.containsKey(sum - k)) {
                count += mp.get(sum - k);
            }
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}