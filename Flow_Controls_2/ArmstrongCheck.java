import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int original = number;
        int digits = 0;5
        int sum = 0;

        for (int n = number; n != 0; n /= 10) {
            digits++;
        }

        for (int n = number; n != 0; n /= 10) {
            int digit = n % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }
            sum += power;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
