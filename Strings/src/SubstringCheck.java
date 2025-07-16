public class SubstringCheck {
    public static void main(String[] args) {
        String text = "Hello World";
        String sub = "World";

        boolean contains = text.contains(sub);

        System.out.println("Text: " + text);
        System.out.println("Substring: " + sub);
        System.out.println("Contains Substring: " + contains);
    }
}
