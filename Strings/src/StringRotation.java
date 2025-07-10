import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter original string: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter string to check rotation: ");
        String s2 = scanner.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("Not a rotation.");
        } else {
            String combined = s1 + s1;
            if (combined.contains(s2)) {
                System.out.println("Yes, it's a rotation.");
            } else {
                System.out.println("No, it's not a rotation.");
            }
        }

        scanner.close();
    }
}
