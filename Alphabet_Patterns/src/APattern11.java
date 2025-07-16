public class APattern11 {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'F'; ch++) {
            for (char c = ch; c >= 'A'; c--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
