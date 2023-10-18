public class Test6 {
    public static void main(String[] args) {
        for (short i = 32766; ; i = (short) (i + 1)) {
            System.out.println(i);
            if (i == 32767) {
                break;
            }
        }
    }
}