import java.util.Scanner;

public class DigitCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a digit.");
        } else {
            System.out.println(ch + " is not a digit.");
        }

        scanner.close();
    }
}
