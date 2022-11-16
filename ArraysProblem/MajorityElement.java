
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 4, 4, 2, 4, 3, 4, 4, 3, 2, 4 };
        int ans = Solve(arr);
        System.out.println(ans);
    }

    public static int Solve(int[] arr) {
        int count = 0;
        int candidate = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                candidate = arr[i];
            }
            if (candidate == arr[i]) {
                count += 1;
            } else {
                count -= 1;
            }
        }
        return candidate;
    }
}
