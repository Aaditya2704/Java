
public class CheckPalidrome {

    public static boolean reverse(String s, int start, int end) {
        String news = s;
        return false;

    }

    public static void main(String[] args) {
        String s = "Aaditya";
        int length = s.length();
        boolean newS = reverse(s, 0, length - 1);
        if (newS == true) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println("Is not a palindrome");
        }
    }
}
