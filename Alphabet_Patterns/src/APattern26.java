public class APattern26 {
    public static void main(String[] args) {
        int[] startCodes = { 'A', 'B', 'D', 'G', 'K' };

        for (int i = 0; i < startCodes.length; i++) {
            int count = i + 1;
            if (i % 2 == 0) {
                for (int j = 0; j < count; j++) {
                    System.out.print((char)(startCodes[i] + j) + " ");
                }
            } else {
                for (int j = 0; j < count; j++) {
                    System.out.print((char)(startCodes[i] + count - 1 - j) + " ");
                }
            }
            System.out.println();
        }
    }
}
