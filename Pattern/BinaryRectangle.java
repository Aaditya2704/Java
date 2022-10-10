public class BinaryRectangle {
    public static void main(String[] args) {
        int a = 6;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");

            }
            System.out.println();
        }
    }
}
