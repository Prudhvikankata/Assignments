public class APattern2{
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
