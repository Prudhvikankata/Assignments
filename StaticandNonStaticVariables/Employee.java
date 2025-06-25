public class Employee {
    int empId;
    String name;
    double salary;

    public void displayDetails() {
        System.out.println("Employee ID:" + empId);
        System.out.println("Name:" + name);
        System.out.println("Salary:" + salary);
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.empId = 101;
        emp.name = "Alice";
        emp.salary = 55000;
        emp.displayDetails();
    }
}
