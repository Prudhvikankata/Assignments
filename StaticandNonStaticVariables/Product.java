public class Product {
    int id;
    String name;
    double price;

    public void calculateDiscount(double discountPercent) {
        double discountAmount = (price * discountPercent) / 100;
        double discountedPrice = price - discountAmount;

        System.out.println("Original Price: " + price);
        System.out.println("Discount: " + discountPercent + "%");
        System.out.println("Discounted Price: " + discountedPrice);
    }

    public void displayDetails() {
        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Product product = new Product();
        product.id = 101;
        product.name = "Wireless Headphones";
        product.price = 150.00;

        product.displayDetails();
        System.out.println("-----");

        product.calculateDiscount(20); 
    }
}
