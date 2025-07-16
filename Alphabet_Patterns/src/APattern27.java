public class APattern27 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = i; j < i + rows; j++) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }
}
