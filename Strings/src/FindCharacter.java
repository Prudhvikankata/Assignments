public class FindCharacter {
    public static void main(String[] args) {
        String input = "programming";
        char target = 'g';

        int index = input.indexOf(target);

        System.out.println("String: " + input);
        System.out.println("Character: " + target);
        System.out.println("Index: " + index);
    }
}
