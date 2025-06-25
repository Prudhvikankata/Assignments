import java.util.Scanner;

public class SumOfPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sum += i;
            }
        }

        System.out.println("Sum of all prime numbers from 1 to " + n + " is: " + sum);

        scanner.close();
    }
}
