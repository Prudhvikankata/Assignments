import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        char[] characters = input.toCharArray();


        String reversed = "";


        for (int i = characters.length - 1; i >= 0; i--) {
            reversed += characters[i];
        }


        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}
