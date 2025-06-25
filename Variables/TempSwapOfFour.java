public class TempSwapOfFour {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
      
        int temp = a;
        a = b;
        b = c;
        c = d;
        d = temp;


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
