public class DownwardActualTriangle {
    public static void main(String[] args) {
        int a = 6;
        for (int i = 1; i <= a; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = a - 1; j >= i; j--) {
                System.out.print("*");
            }
            for (int j = a - 2; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
