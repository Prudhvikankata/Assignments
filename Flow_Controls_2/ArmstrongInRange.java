import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the upper limit (n): ");
        int n = scanner.nextInt();

        System.out.println("Armstrong numbers between 1 and " + n + ":");

        for (int num = 1; num <= n; num++) {
            int original = num;
            int digits = 0;
            int sum = 0;

            for (int temp = num; temp != 0; temp /= 10) {
                digits++;
            }

            for (int temp = num; temp != 0; temp /= 10) {
                int digit = temp % 10;
                int power = 1;
                for (int i = 0; i < digits; i++) {
                    power *= digit;
                }
                sum += power;
            }

            if (sum == original) {
                System.out.print(original + " ");
            }
        }

        scanner.close();
    }
}
