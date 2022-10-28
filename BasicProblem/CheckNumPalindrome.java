public class CheckNumPalindrome {
    public static void main(String[] args) {
        int a = 313;
        int N = a;
        int reverse = 0;
        int digit = 0;
        while (a != 0) {
            digit = a % 10;
            reverse = reverse * 10 + digit;
            a /= 10;
        }
        if (reverse == N) {
            System.out.println("Number is palindrome number");
        } else {
            System.out.println("Number is not a palindrome number");
        }
    }
}
