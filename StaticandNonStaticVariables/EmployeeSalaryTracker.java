public class EmployeeSalaryTracker {
    int empId;
    String name;
    double salary;

    static int totalEmployees = 0;
    static double totalSalaryExpense = 0;

    public EmployeeSalaryTracker(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;

        totalEmployees++;
        totalSalaryExpense += salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        EmployeeSalaryTracker e1 = new EmployeeSalaryTracker(101, "Sri", 60000);
        EmployeeSalaryTracker e2 = new EmployeeSalaryTracker(102, "Vinya", 70000);
        EmployeeSalaryTracker e3 = new EmployeeSalaryTracker(103, "Tata", 80000);

        e1.displayDetails();
        System.out.println("-----");
        e2.displayDetails();
        System.out.println("-----");
        e3.displayDetails();
        System.out.println("-----");

        System.out.println("Total Employees: " + EmployeeSalaryTracker.totalEmployees);
        System.out.println("Total Salary Expense: " + EmployeeSalaryTracker.totalSalaryExpense);
    }
}
