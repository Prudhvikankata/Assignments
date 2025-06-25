public class Interest{
    public static void main(String[] args) {
        double principal = 500000.0;
        double rate = 6.8;
        int time = 5;

        double interest = (principal * rate * time) / 100;
        double finalAmount = principal + interest;

        System.out.printf("Interest Amount: %.2f%n", interest);
        System.out.printf("Final Amount: %.2f%n", finalAmount);
    }
}
