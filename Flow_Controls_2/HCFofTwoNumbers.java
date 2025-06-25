import java.util.Scanner;

public class HCFofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int hcf = 1;
        int min = (a < b) ? a : b;

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        System.out.println("HCF of " + a + " and " + b + " is: " + hcf);

        scanner.close();
    }
}
