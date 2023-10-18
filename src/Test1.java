public class Test1 {
    public static void main(String[] args) {
        int y = 0;
        int k = 5;
        while (k > 2) {
            k = k - 1;
            y = y + k * k;
            // k=5-1=4k/ y=0+4*4=16y
            // k=4-1=3k/ y=16+3*3=16+9=25y
            // k=3-1=2k/ y=25+2*2=25+4=29y
            System.out.println("y" + y);
            System.out.println("k" + k);
            // 16y 25y 29y =>3
            // 4k 3k 2k =>3
        }
    }
}