import java.util.*;

class KandaneAlgorithms {
    public static int maxSubArray(int[] nums, ArrayList<Integer> subarray) {
        int maxSoFar = Integer.MIN_VALUE, max = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            max += nums[i];

            if (max > maxSoFar) {
                subarray.clear();
                maxSoFar = max;
                subarray.add(sum);
                subarray.add(i);
            }
            if (max < 0) {
                max = 0;
                sum = i + 1;

            }
        }

        return maxSoFar;
    }

    public static void main(String args[]) {
        int arr[] = { -2, 4, 3, 1, 6, -5, 3 };
        ArrayList<Integer> subarray = new ArrayList<>();
        int lon = maxSubArray(arr, subarray);
        System.out.println("The longest subarray with maximum sum is " + lon);
        System.out.println("The subarray is ");
        for (int i = subarray.get(0); i <= subarray.get(1); i++) {
            System.out.print(arr[i] + " ");
        }

    }
}