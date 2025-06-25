import java.util.Scanner;

public class PowerUsingPowMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();

        double result = 0;

        for (int i = 0; i < 1; i++) {
            result = Math.pow(base, exponent);
        }

        System.out.println(base + " ^ " + exponent + " = " + result);

        scanner.close();
    }
}
