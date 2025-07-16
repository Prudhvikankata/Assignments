public class APattern29 {
    public static void main(String[] args) {
        int rows = 6;
        for (int i = 0; i < rows; i++) {
            for (char ch = 'A'; ch < 'A' + rows - i; ch++) {
                System.out.print(ch);
            }
            int spaces = i * 2 - 1;
            if (i > 0) {
                for (int s = 0; s < spaces; s++) {
                    System.out.print(" ");
                }
            }
            for (char ch = (char) ('A' + rows - i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
