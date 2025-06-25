public class Student {
    static String schoolName;
    int studentId;
    String name;

    public void displayDetails() {
        System.out.println("StudentID :" + studentId);
        System.out.println("Name: " + name);
        System.out.println("School Name: " + schoolName);
    }

    public static void main(String[] args) {
        Student.schoolName = "Krishnaveni Talent School";

        Student s1 = new Student();
        s1.studentId = 01;
        s1.name = "Sri";

        Student s2 = new Student();
        s2.studentId = 02;
        s2.name = "Vinya";

        s1.displayDetails();
        System.out.println("---------------------");
        s2.displayDetails();
    }
}
