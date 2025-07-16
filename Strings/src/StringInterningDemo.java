public class StringInterningDemo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = s3.intern();

        System.out.println("s1 == s2: " + (s1 == s2)); // true (same literal)
        System.out.println("s1 == s3: " + (s1 == s3)); // false (new object)
        System.out.println("s1 == s4: " + (s1 == s4)); // true (interned)
    }
}
