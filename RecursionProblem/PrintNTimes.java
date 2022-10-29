public class PrintNTimes {

    static void PrintNumbers(int count, int n) {
        if (count > n)
            return;
        System.out.print(count);
        count++;
        PrintNumbers(count, n);
    }

    public static void main(String[] args) {
        int n = 6;
        PrintNumbers(1, n);
    }
}