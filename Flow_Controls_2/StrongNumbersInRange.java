import java.util.Scanner;

public class StrongNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter upper limit (n): ");
        int n = scanner.nextInt();

        System.out.println("Strong numbers between 1 and " + n + ":");

        for (int num = 1; num <= n; num++) {
            int original = num;
            int sum = 0;

            for (int temp = num; temp != 0; temp /= 10) {
                int digit = temp % 10;
                int fact = 1;

                for (int i = 1; i <= digit; i++) {
                    fact *= i;
                }

                sum += fact;
            }

            if (sum == original) {
                System.out.print(original + " ");
            }
        }

        scanner.close();
    }
}
