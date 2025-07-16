public class CountOccurrences {
    public static void main(String[] args) {
        String input = "programming";
        char target = 'g';
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("String: " + input);
        System.out.println("Character: " + target);
        System.out.println("Occurrences: " + count);
    }
}
