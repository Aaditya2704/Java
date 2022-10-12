import java.util.Scanner;;

class ArmstrongNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int newvlaue, power = 0, rem, sum = 0;
            System.out.print("Enter the number:");
            int n = sc.nextInt();
            newvlaue = n;
            // From this while we will get the length of the input
            while (n > 0) {
                power++;
                n /= 10;
            }
            n = newvlaue;
            // For calculating the Armstrong sum of the number
            while (n > 0) {
                rem = n % 10;
                sum += Math.pow(rem, power);
                n /= 10;
            }
            System.out.println("Armstrong Sum: " + sum);
            if (newvlaue == sum) {
                System.out.println("The number is a Armstrong number");
            } else {
                System.out.println("The number is not the Armstrong number");
            }
        }
    }
}