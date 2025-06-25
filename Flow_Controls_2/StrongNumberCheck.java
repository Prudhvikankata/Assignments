import java.util.Scanner;

public class StrongNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int original = number;
        int sum = 0;

        for (int n = number; n != 0; n /= 10) {
            int digit = n % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;
        }

        if (sum == original) {
            System.out.println(original + " is a Strong number.");
        } else {
            System.out.println(original + " is not a Strong number.");
        }

        scanner.close();
    }
}
