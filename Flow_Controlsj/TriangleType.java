import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        int a = scanner.nextInt();

        System.out.print("Enter side 2: ");
        int b = scanner.nextInt();

        System.out.print("Enter side 3: ");
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("Equilateral triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }

        scanner.close();
    }
}
