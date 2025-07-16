public class APattern31 {
    public static void main(String[] args) {
        char ch = 'J';
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(ch--);
                if (j < i - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
