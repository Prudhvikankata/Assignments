import java.util.Scanner;

public class LCMofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int max = (a > b) ? a : b;
        int lcm = max;

        for (; ; lcm++) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
        }

        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);

        scanner.close();
    }
}
