import java.util.Scanner;

public class ReverseNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
