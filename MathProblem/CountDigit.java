import java.util.Scanner;

public class CountDigit {
    static int count_digits(int n) {
        int x = n;
        int count = 0;
        while (x != 0) {
            x = x / 10;
            count++;
        }
        return count;
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println("Number of digits in " + n + " is " + count_digits(n));
        }
    }
}