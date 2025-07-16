public class APattern12 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                char toPrint = (char) (ch + j * 5);
                if (toPrint <= 'Z') {
                    System.out.print(toPrint + " ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}
