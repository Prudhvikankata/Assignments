public class SumExample {
    public static int addNumbers(int x, int y) {
        int a = x;
        int b = y;
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        int result = addNumbers(10, 20);
        System.out.println("Sum:" + result);  
    }
}
