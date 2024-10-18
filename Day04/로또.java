package Day04;

import java.util.Random;

public class 로또 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[6];

        for (int i = 0; i < 6; i++){
            int lotto = r.nextInt(45)+1;
            arr[i] = lotto;
            for (int j = 0; j < 6; j++) {
                if (arr[i] == arr[j]){
                    continue;
                }else {

                    System.out.print(lotto + " ");
                    break;
                }
            }

        }
    }
}
