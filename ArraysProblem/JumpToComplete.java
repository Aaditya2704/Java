import java.util.Scanner;

public class JumpToComplete {
    static int countJumps(int[] arr, int size) {
        int jump = 0, currentPosition = 0, actualPosition = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == 0 && i == currentPosition) {
                return -1;
            }
            if ((i + arr[i]) > actualPosition) {
                actualPosition = i + arr[i];
            }
            if (i == currentPosition) {
                jump++;
                currentPosition = actualPosition;
            }
            
        }
        return jump;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int[] a = new int[size];
            for (int i = 0; i < size; i++) {
                a[i] = sc.nextInt();
            }
            int jumps = countJumps(a, size);
            if (jumps == -1) {
                System.out.println("Jump can't be performed");
            } else {
                System.out.println("Jumps needed to complete the arrays are " + jumps);
            }
        }
    }
}
