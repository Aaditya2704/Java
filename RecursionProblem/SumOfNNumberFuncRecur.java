public class SumOfNNumberFuncRecur {
    static int Solve(int n) {
        if (n == 0) {
            return 0;
        }
        return (n + Solve(n - 1));
    }

    public static void main(String[] args) {
        int n = 5;
        int sum = Solve(n);
        System.out.print(sum);

    }
}
