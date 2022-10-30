public class Factorial {
    static int SolveFact(int N) {

        if (N == 0) {
            return 1;
        } else {
            return (N * SolveFact(N - 1));
        }
    }

    public static void main(String[] args) {
        int n = 6;
        int fact = SolveFact(n);
        System.out.println(fact);
    }
}
