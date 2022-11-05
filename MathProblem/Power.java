
public class Power {

    public static void main(String[] args) {
        int n = 2, k = 3;
        int ans = 1;
        while (k != 0) {
            if (k % 2 == 0) {
                n = n * n;
                k /= 2;
            } else {
                ans = ans * n;
                k--;
            }
        }

        System.out.print(ans);
    }
}
