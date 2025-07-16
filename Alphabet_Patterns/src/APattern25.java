public class APattern25 {
    public static void main(String[] args) {
        int ch = 'A';
        for (int i = 0; i < 5; i++) {
            char[] row = new char[i + 1];
            for (int j = 0; j <= i; j++) {
                row[j] = (char) ch++;
            }
            if (i % 2 != 0) {
                for (int j = row.length - 1; j >= 0; j--) {
                    System.out.print(row[j] + " ");
                }
            } else {
                for (int j = 0; j < row.length; j++) {
                    System.out.print(row[j] + " ");
                }
            }
            System.out.println();
        }
    }
}
