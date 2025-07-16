public class APattern7 {
    public static void main(String[] args) {
        for (int i = 6; i >= 1; i--) {
            for (char ch = 'F'; ch > 'F' - i; ch--) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
