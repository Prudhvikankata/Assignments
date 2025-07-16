public class APattern14 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
