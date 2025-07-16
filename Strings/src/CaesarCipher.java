public class CaesarCipher {
    public static void main(String[] args) {
        String text = "hello world";
        int shift = 3;
        String encrypted = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) ('a' + (ch - 'a' + shift) % 26);
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ('A' + (ch - 'A' + shift) % 26);
            }

            encrypted += ch;
        }
        System.out.println("Encrypted: " + encrypted);
    }
}
