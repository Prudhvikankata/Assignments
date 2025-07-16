public class APattern24 {
    public static void main(String[] args) {
        char[] letters = {'J', 'A', 'V', 'A'};
        int[] counts = {1, 3, 5, 8};
        int totalRows = letters.length;

        for (int i = 0; i < totalRows; i++) {
            for (int s = 0; s < totalRows - i - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < counts[i]; j++) {
                System.out.print(letters[i]);
            }
            System.out.println();
        }
    }
}
