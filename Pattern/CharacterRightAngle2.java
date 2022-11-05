public class CharacterRightAngle2 {
    public static void main(String[] args) {
        int a = 5;
        char ch = 64;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                ch = (char) (64 + j);
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}
