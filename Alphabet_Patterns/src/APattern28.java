public class APattern28 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (char ch = 'A'; ch < 'A' + rows - i; ch++) {
                System.out.print(ch);
            }
            for (char ch = (char) ('A' + rows - i - 2); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
