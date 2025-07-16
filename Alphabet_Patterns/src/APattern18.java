public class APattern18 {
    public static void main(String[] args) {
        String str = "ABCDEF";
        int len = str.length();

        for (int i = 0; i < len; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = i; j < len; j++) {
                System.out.print(str.charAt(j) + " ");
            }
            System.out.println();
        }

        for (int i = len - 1; i >= 0; i--) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = i; j < len; j++) {
                System.out.print(str.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}
