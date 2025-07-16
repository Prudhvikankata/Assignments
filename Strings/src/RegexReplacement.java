public class RegexReplacement {
    public static void main(String[] args) {
        String text = "The rain in Spain stays mainly in the plain.";

        String replaced = text.replaceAll("ain", "XYZ");

        System.out.println("Original: " + text);
        System.out.println("Replaced: " + replaced);
    }
}
