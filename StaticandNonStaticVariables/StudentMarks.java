public class StudentMarks {
    String name;
    int mark1, mark2, mark3;

    public void calculateAverage() {
        int total = mark1 + mark2 + mark3;       
        double average = total / 3.0;            

        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {
        StudentMarks student = new StudentMarks();
        student.name = "Priya";
        student.mark1 = 85;
        student.mark2 = 90;
        student.mark3 = 80;
        student.calculateAverage();
    }
}
