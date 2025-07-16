public class StringSplitting {
    public static void main(String[] args) {
        String input = "cat,dog,lion";
        String[] animals = input.split(",");

        System.out.println("Split Words:");
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
