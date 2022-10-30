public class SumOfNNumbers {
    static void Solve(int N) {
        int sum = N * (N + 1) / 2;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int n = 6;
        Solve(n);

    }
}
