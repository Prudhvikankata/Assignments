import java.util.Scanner;

public class SubstringFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String str = scanner.nextLine();

        System.out.print("Enter substring: ");
        String sub = scanner.nextLine();

        int count = 0;
        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }

        System.out.println("Frequency of substring: " + count);
        scanner.close();
    }
}
