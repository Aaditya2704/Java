public class PrintNto1 {
    static void Print(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        n--;
        Print(n);
    }

    public static void main(String[] args) {
        int n = 6;
        Print(n);
    }
}
