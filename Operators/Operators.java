public class Operators{
    public static void main(String[] args) {
        int a=20;
        int b=10;
        int c=30;
        int n=5;

        // Arithmetic Operators
       System.out.println( (a+b) + " " + (a*b) + " " + (a-b) + " " + (a/b) + " " + (a%b));

        //Increment and Decrement Operators 
        System.out.println( ++n + " " + n++ + " " + --n + " " + n-- );

        //Compound Assignment Operators
       System.out.println((n += 2) + " " + (n -= 2) + " " + (n *= 2) + " " + (n /= 2) + " " + (n %= 2));

        //Relational Operators
        System.out.println((a == b) + " " + (a != b) + " " + (a > b) + " " + (a < b) + " " + (a >= b) + " " + (a <= b));

        //Logical Operators
        System.out.println(((a > b) && (b < n)) + " " + ((a < b) || (b > n)) + " " + (!(a == b)));

        //Bitwise Operators
        System.out.println((a & b) + " " + (a | b) + " " + (a ^ b) + " " + (~a) + " " + (a << 2) + " " + (a >> 2));

        //Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Max: " + max);

        //Mix of Operators
        boolean result = (a + b > c) && (b != 0);
        System.out.println(result);        
    }
}