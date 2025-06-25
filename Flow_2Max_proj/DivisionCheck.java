import java.util.Scanner;

public class DivisionCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks percentage: ");
        double percentage = scanner.nextDouble();

        if (percentage >= 60) {
            System.out.println("Division 1");
        } else if (percentage >= 45) {
            System.out.println("Division 2");
        } else if (percentage >= 30) {
            System.out.println("Division 3");
        } else {
            System.out.println("Fail");
        }

        scanner.close();
    }
}
