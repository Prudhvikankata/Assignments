public class APattern6 {
    public static void main(String[] args) {
        int rows = 6;
        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
