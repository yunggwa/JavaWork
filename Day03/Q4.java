package Day03;

import java.util.Random;

public class Q4 {
    public static void main(String[] args) {
        Random r = new Random();

        char a = 'A';
//        int en = r.nextInt(25) + a;

        int sum = 0;
        for (int i = 0; i < 10; i++){
            int en = r.nextInt(26) + a;
            sum += en;
            System.out.print((char) en + "+");
        }
        System.out.print("=" + sum);
    }
}
