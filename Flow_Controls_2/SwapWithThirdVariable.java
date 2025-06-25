import java.util.Scanner;

public class SwapWithThirdVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int a = scanner.nextInt();

        System.out.print("Enter second value: ");
        int b = scanner.nextInt();

        for (int i = 0; i < 1; i++) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("After swapping:");
        System.out.println("First value: " + a);
        System.out.println("Second value: " + b);

        scanner.close();
    }
}
