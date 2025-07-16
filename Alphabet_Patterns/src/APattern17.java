public class APattern17 {
    public static void main(String[] args) {
        String str = "ABCDEF";
        int len = str.length();

        for (int i = 0; i < len; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            System.out.println(str.substring(i));
        }
        for (int i = len - 2; i >= 0; i--) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            System.out.println(str.substring(i));
        }
    }
}
