// This is a O(N) approach
public class SearchingInMatrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int len = arr.length;
        int k = 10;
        boolean b = false;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (arr[i][j] == k) {
                    b = true;
                    break;
                }
            }
        }
        if (b == false) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}
