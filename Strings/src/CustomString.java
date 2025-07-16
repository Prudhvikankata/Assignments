public class CustomString {
    private final String value;

    public CustomString(String value) {
        this.value = value;
    }

    public String customSubstring(int start, int end) {
        if (start < 0 || end > value.length() || start > end) {
            throw new IllegalArgumentException("Invalid indexes");
        }
        return value.substring(start, end);
    }

    public String reverse() {
        return new StringBuilder(value).reverse().toString();
    }

    public String getValue() {
        return value;
    }

    public static void main(String[] args) {
        CustomString myStr = new CustomString("CustomStringClass");
        System.out.println("Original: " + myStr.getValue());
        System.out.println("Custom Substring (2-8): " + myStr.customSubstring(2, 8));
        System.out.println("Reversed: " + myStr.reverse());
    }
}
