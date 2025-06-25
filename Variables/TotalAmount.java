public class TotalAmount{
    public static void main(String[] args) {
        double basicSalary = 85000.0;

        double ta = (15.0 / 100) * basicSalary;
        double da = (20.0 / 100) * basicSalary;
        double hra = (18.0 / 100) * basicSalary;
        double pf = (20.0 / 100) * basicSalary;
        double tax = (25.0 / 100) * basicSalary;

        double grossSalary = basicSalary + ta + da + hra;
        double netSalary = grossSalary - (pf + tax);

        System.out.printf("Gross Salary: %.2f%n", grossSalary);
        System.out.printf("Net Salary: %.2f%n", netSalary);
    }
}
