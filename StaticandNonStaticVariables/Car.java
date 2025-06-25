public class Car {
    String model;
    double price;

    static int carCount = 0;

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
        carCount++; 
    }

    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }


    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 25000);
        Car c2 = new Car("Honda", 27000);
        Car c3 = new Car("Tesla", 40000);

        c1.displayDetails();
        System.out.println("-----------");
        c2.displayDetails();
        System.out.println("-----------");
        c3.displayDetails();
        System.out.println("-----------");

        System.out.println("Total Cars Created: " + Car.carCount);
    }
}
