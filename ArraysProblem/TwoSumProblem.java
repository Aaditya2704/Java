import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class TwoSumProblem {

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] output = Solve(nums, target);
        System.out.println(Arrays.toString(output));
    }

    public static int[] Solve(int[] nums2, int target2) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            int complement = target2 - nums2[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums2[i], i);
            }
        }
        return new int[] {};
    }
}
