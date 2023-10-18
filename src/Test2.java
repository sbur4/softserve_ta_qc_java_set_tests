public class Test2 {
    public static void main(String[] args) {
        int y1 = 2;
        int k1;
        for (k1 = 4; k1 >= 1; k1--) {
            y1 = y1 * k1;
            // y=2*4=8y/ k=4
            // y=8*3=24y/ k=3
            // y=24*2=48y/ k=2 => k--=1=0
            System.out.println("k" + k1);
            System.out.println("y" + y1);
        }
    }
}