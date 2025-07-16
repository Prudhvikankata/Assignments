public class APattern32 {
    public static void main(String[] args) {
        char ch = 'J';
        for (int i = 1; i <= 4; i++) {
            if (i % 2 == 1) { // Odd rows: descending letters
                for (int j = 0; j < i; j++) {
                    System.out.print(ch--);
                    if (j < i - 1) System.out.print(" ");
                }
            } else { // Even rows: ascending letters starting from ch - i
                char start = (char)(ch - i + 1);
                for (int j = 0; j < i; j++) {
                    System.out.print((char)(start + j));
                    if (j < i - 1) System.out.print(" ");
                }
                ch = (char)(ch - i);
            }
            System.out.println();
        }
    }
}
