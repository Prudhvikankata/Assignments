public class APattern16 {
    public static void main(String[] args) {
        int rows = 6;
        for (int i = 1; i <= rows; i++) {
            for (int s = 0; s < rows - i; s++) {
                System.out.print(" ");
            }
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        for (int i = rows - 1; i >= 1; i--) {
            for (int s = 0; s < rows - i; s++) {
                System.out.print(" ");
            }
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
