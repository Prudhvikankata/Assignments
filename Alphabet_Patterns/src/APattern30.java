public class APattern30 {
    public static void main(String[] args) {
        int rows = 6;
        for (int i = 0; i < rows; i++) {
            if (i == rows - 1) {
                System.out.print("A");
                for (int s = 0; s < 9; s++) {
                    System.out.print(" ");
                }
                System.out.println("A");
                continue;
            }
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
        for (int i = rows - 2; i >= 0; i--) {
            if (i == rows - 1) {
                System.out.print("A");
                for (int s = 0; s < 9; s++) { 
                    System.out.print(" ");
                }
                System.out.println("A");
                continue;
            }
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
