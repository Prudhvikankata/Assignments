import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        if (true) {
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else {
            System.out.println("Conversion failed.");
        }

        scanner.close();
    }
}
