package yungJAVAp;

import java.util.Random;

public class lotto {
    public static void main(String[] args) {
        Random r =new Random();

        for (int i = 0; i < 5; i++){
            System.out.println("\n");
            for (int j = 0; j < 6; j++){
             int lotto = r.nextInt(45)+1;
                System.out.print(lotto + " ");

            }

        }
    }

}
