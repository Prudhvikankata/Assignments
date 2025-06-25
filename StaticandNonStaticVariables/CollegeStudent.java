public class CollegeStudent {
 
    int studentId;
    String studentName;
    static String collegeName;

    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + collegeName);
    }

    public static void main(String[] args) {
        CollegeStudent.collegeName = "Southern Arkansas University";

        CollegeStudent s1 = new CollegeStudent();
        s1.studentId = 1;
        s1.studentName = "Sri";

        CollegeStudent s2 = new CollegeStudent();
        s2.studentId = 2;
        s2.studentName = "Vinya";

        CollegeStudent s3 = new CollegeStudent();
        s3.studentId = 3;
        s3.studentName = "Tata";

        s1.displayDetails();
        System.out.println("-----");
        s2.displayDetails();
        System.out.println("-----");
        s3.displayDetails();
    }
}
