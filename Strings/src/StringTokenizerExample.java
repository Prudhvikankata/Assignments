import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String sentence = "Hello this is a Java program";

        StringTokenizer tokenizer = new StringTokenizer(sentence, " ");

        System.out.println("Words using StringTokenizer:");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
