public class APattern34 {
    public static void main(String[] args) {
        int totalRows = 9;
        for (int i = 1; i <= totalRows; i++) {
            int cols = (i <= 5) ? i : 10 - i;
            int ch = 'A' + i - 1;
            int jump = i;
            for (int j = 0; j < cols; j++) {
                System.out.print((char) wrapChar(ch) + " ");
                ch += jump;
            }
            System.out.println();
        }
    }

    private static int wrapChar(int ch) {
        if (ch > 'Z') {
            return 'A' + (ch - 'Z' - 1);
        }
        return ch;
    }
}
