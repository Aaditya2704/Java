public class ActualTriangle {
    public static void main(String[] args) {
        int a = 6;

        for (int i = 1; i <= a; i++) {
            for (int k = 1; k <= a - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
