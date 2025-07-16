public class APattern8{
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (char ch = 'F'; ch >= 'F' - i + 1; ch--) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
