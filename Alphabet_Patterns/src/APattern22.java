public class APattern22 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (char ch = (char) ('A' + i); ch <= 'F'; ch++) {
                System.out.print(ch + " ");
            }
            for (char ch = (char) ('E'); ch >= (char) ('A' + i); ch--) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
