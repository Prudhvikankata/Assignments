public class UnicodeManipulation {
    public static void main(String[] args) {
        String text = "𝒜𝒷𝒸abc";

        System.out.println("Original String: " + text);
        System.out.println("Number of code units: " + text.length());
        System.out.println("Number of code points: " + text.codePointCount(0, text.length()));

        System.out.println("Code points:");
        text.codePoints().forEach(cp -> {
            System.out.println("Char: " + new String(Character.toChars(cp)) + ", Code Point: " + cp);
        });
    }
}
