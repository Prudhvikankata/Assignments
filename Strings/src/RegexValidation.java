import java.util.regex.Pattern;

public class RegexValidation {
    public static void main(String[] args) {
        String email = "abc@gmail.com";
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        boolean isValid = Pattern.matches(regex, email);

        System.out.println("Email: " + email);
        System.out.println("Is Valid: " + isValid);
    }
}
