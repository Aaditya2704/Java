
public class CheckPalidrome {

    public static boolean reverse(String s, int i, int N) {
        if (i >= N / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(N - i - 1))
            return false;
        return true;
    }

    public static void main(String[] args) {
        String s = "aadidtya";
        int length = s.length();
        System.out.println(reverse(s, 0, length));
    }
}
