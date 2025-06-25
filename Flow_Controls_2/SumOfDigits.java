import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;

        for (int n = number; n != 0; n /= 10) {
            int digit = n % 10;
            sum += digit;
        }

        System.out.println("Sum of digits of " + number + " is: " + sum);

        scanner.close();
    }
}
