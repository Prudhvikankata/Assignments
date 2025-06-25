public class SwapThreeWithTemp {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int temp = a;
        a = b;
        b = c;
        c = temp;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
