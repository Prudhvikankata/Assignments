public class DominoBill {
    public static void main(String[] args) {
        double pizzaPrice = 399.0;
        int count = 2;
        double discountRate = 20.0;

        double total = pizzaPrice * count;
        double discount = (total * discountRate) / 100;
        double finalAmount = total - discount;

        System.out.printf("Final Price: %.2f%n", finalAmount);
    }
}
