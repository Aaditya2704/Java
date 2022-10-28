public class ReverseANumber {
    public static void main(String[] args) {
        int a = 123456;
        int reverse = 0;
        int digit = 0;
        while (a != 0) {
            digit = a % 10;
            reverse = reverse * 10 + digit;
            a /= 10;
        }
        System.out.println(reverse);
    }
}
