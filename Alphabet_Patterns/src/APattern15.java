public class APattern15 {
    public static void main(String[] args) {
        int rows = 6;
        for (int i = rows; i >= 1; i--) {
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
