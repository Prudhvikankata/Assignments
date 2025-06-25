public class Salary {
    public static void main(String[] args) {
        double salary = 85000.0;
        double taxRate = 20.0;

        double taxAmount = (salary * taxRate) / 100;

        System.out.printf("Tax Amount: %.2f%n", taxAmount);
    }
}
