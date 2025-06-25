public class Circle {
    double radius;

    public void printArea() {
        double area = Math.PI * radius * radius; 
        System.out.println("Area of Circle: " + area);
    }

    public void printCircumference() {
        double circumference = 2 * Math.PI * radius; 
        System.out.println("Circumference of Circle: " + circumference);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 5.0;

        circle.printArea();
        circle.printCircumference();
    }
}
