public class APattern21 {
    public static void main(String[] args) {
        int rows = 6;
        for (int i = 0; i < rows; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j < rows; j++) {
                if (j < rows - i - 1) {
                    System.out.print("A ");
                } else {
                    System.out.print(ch + " ");
                }
            }
            System.out.println();
        }
    }
}
