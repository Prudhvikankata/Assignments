public class APattern23 {
    public static void main(String[] args) {
        int rows = 6;
        for (int i = 0; i < rows; i++) {
            for (int s = 0; s < rows - i - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A' + i) + " ");
            }
            System.out.println();
        }
    }
}
