public class Test7 {
    public static void main(String[] args) {
        int n = 1;
        do {
            for (int i = 0; i < n++; i++) {
                System.out.print("*");
            }
            System.out.println(System.lineSeparator());
        } while (n < 5);
    }
}