public class APattern19 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int s = 0; s < 5 - i; s++) {
                System.out.print(" ");
            }
            for (char ch = (char) ('F' - i); ch <= 'F'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
