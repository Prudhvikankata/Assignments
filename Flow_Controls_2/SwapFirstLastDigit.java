import java.util.Scanner;

public class SwapFirstLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int original = num;

        int lastDigit = num % 10;
        int firstDigit = num;
        int digits = 0;

        for (int temp = num; temp != 0; temp /= 10) {
            firstDigit = temp;
            digits++;
        }

        int divisor = (int) Math.pow(10, digits - 1);
        int middlePart = (num % divisor) / 10;

        int swapped = lastDigit * divisor + middlePart * 10 + firstDigit;

        System.out.println("Original number: " + original);
        System.out.println("Number after swapping first and last digit: " + swapped);

        scanner.close();
    }
}
