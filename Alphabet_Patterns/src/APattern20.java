public class APattern20 {
    public static void main(String[] args) {
        int rows = 6;
        for (int i = 0; i < rows; i++) {
            for (int s = 0; s < rows - i - 1; s++) {
                System.out.print("  ");
            }
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
