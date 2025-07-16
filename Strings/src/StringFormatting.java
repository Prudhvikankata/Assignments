import java.util.Scanner;

public class StringFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Middle Name: ");
        String middleName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        String formatted = lastName + ", " + firstName + " " + middleName;

        System.out.println("Formatted Name: " + formatted);
    }
}
