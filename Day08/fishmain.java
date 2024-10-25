package Day08;

import java.util.Random;
import java.util.Scanner;

public class fishmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        boolean[][] bada= new boolean[5][5];

        //물고기 랜덤생성
        int fishcnt = 0;
        for (int i = 0; i < 3; i++){
            int by = r.nextInt(5);
            int bx = r.nextInt(5);
            if (bada[by][bx]){
                i--;
            }else {
                bada[by][bx] = true;
                fishcnt++;
            }
        }
        //
        for (int i = 0; i < bada.length; i++){
            for (int j = 0; j < bada[i].length; j++){
                if (bada[i][j]){
                    System.out.print(" o ");
                }else {
                    System.out.print(" ~ ");
                }
            }
            System.out.println();
        }


    }
}
