import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks in Maths: ");
        int maths = scanner.nextInt();

        System.out.print("Enter marks in Physics: ");
        int physics = scanner.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = scanner.nextInt();

        System.out.print("Enter marks in English: ");
        int english = scanner.nextInt();

        System.out.print("Enter marks in Hindi: ");
        int hindi = scanner.nextInt();

        int totalMarks = maths + physics + chemistry + english + hindi;
        double percentage = (totalMarks / 500.0) * 100;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else if (percentage >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }

        scanner.close();
    }
}
