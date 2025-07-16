public class StringToInteger {
    public static void main(String[] args) {
        String input = "12345";
        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= '0' && ch <= '9') {
                result = result * 10 + (ch - '0');
            } else {
                System.out.println("Invalid input: contains non-digit characters.");
                return;
            }
        }
        System.out.println(result);
    }
}
