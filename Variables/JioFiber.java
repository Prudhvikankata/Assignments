public class JioFiber{
    public static void main(String[] args) {
        double basePrice = 699.0;
        double gstpercentage= 18.0;

        double gst = (basePrice * gstpercentage) / 100;

        double TotalPrice = basePrice + gst;

        System.out.printf("TotalPrice: %.2f%n", TotalPrice);

    }
}
