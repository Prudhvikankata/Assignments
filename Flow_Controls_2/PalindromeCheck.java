import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int original = number;
        int reverse = 0;

        for (int n = number; n != 0; n /= 10) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
        }

        if (original == reverse) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }
}
