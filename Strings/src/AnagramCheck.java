import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams.");
        } else {
            char[] a1 = str1.toCharArray();
            char[] a2 = str2.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            if (Arrays.equals(a1, a2)) {
                System.out.println("Strings are anagrams.");
            } else {
                System.out.println("Not anagrams.");
            }
        }

        scanner.close();
    }
}
