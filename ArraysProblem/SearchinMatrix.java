//This is O(log(m*n)) approach;
public class SearchinMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int lo = 0;
        if (matrix.length == 0)
            return false;
        int n = matrix.length;
        int m = matrix[0].length;
        int hi = (n * m) - 1;

        while (lo <= hi) {
            int mid = (lo + (hi - lo) / 2);
            if (matrix[mid / m][mid % m] == target) {
                return true;
            }
            if (matrix[mid / m][mid % m] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int k = 10;
        boolean ans = searchMatrix(arr, k);
        System.out.println(ans);
    }
}
