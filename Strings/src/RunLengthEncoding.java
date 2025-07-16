public class RunLengthEncoding {
    public static void main(String[] args) {
        String input = "aabbbcccdda";
        String result = compress(input);
        System.out.println("Compressed: " + result);
    }

    static String compress(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) != s.charAt(i-1)) {
                sb.append(s.charAt(i-1)).append(count);
                count = 1;
            } else {
                count++;
            }
        }
        return sb.toString();
    }
}
