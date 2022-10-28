public class GCD {
    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        int ans = 0;
        for (int i = 2; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
