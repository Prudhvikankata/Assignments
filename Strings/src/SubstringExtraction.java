public class SubstringExtraction {
    public static void main(String[] args) {
        String input = "HelloWorld";
        int start = 2;
        int end = 7;

        String substring = input.substring(start, end);

        System.out.println("Original String: " + input);
        System.out.println("Substring (" + start + " to " + end + "): " + substring);
    }
}
