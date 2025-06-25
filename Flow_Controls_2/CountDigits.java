import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int count = 0;

        for (int n = number; n != 0; n /= 10) {
            count++;
        }

        System.out.println("Number of digits in " + number + " is: " + count);

        scanner.close();
    }
}
