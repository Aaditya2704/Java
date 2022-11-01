public class SumOfNNumbers {
    static void Solve(int N, int sum) {
        if (N < 0) {
            System.out.print(sum);
            return;
        }
        Solve(N - 1, sum + N);
    }

    public static void main(String[] args) {
        int n = 6;
        Solve(n, 0);

    }
}
