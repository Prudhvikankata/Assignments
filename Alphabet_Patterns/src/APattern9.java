public class APattern9 {
    public static void main(String[] args) {
        for (int i = 6; i >= 1; i--) {
            for (char ch = 'A'; ch <= 'A' + i - 1; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
