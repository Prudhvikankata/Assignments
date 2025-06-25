import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        int[] freq = new int[10];

        for (long n = number; n != 0; n /= 10) {
            int digit = (int)(n % 10);
            freq[digit]++;
        }

        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + ": " + freq[i]);
            }
        }

        scanner.close();
    }
}
