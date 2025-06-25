public class SwapFourWithoutTemp {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        a = a + b + c + d; 
        b = a - (b + c + d); 
        c = a - (b + c + d); 
        d = a - (b + c + d); 
        a = a - (b + c + d); 

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
