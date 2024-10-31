package yunghome복습;

import java.util.Random;
import java.util.Scanner;

public class fishingpre2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        boolean[][] fishing = new boolean[5][5];
        int fishcnt = 0;
        int Y = -1;
        int X = -1;

        //호수에 물고기배치
        for (int i = 0; i < 3; i++){
            int fy = r.nextInt(5);
            int fx = r.nextInt(5);
            if (fishing[fy][fx]){
                i--;
            }else {
                fishing[fy][fx] = true;
                fishcnt++;
            }
        }
        //물고기출력
        for (int i = 0; i < fishing.length; i++){
            for (int j = 0; j < fishing[i].length; j++){
                if (fishing[i][j]){
                    System.out.print(" ^ ");
                }else {
                    System.out.print(" ~ ");
                }
            }
            System.out.println();
        }
        while (Y < 0 || Y > 4 || X < 0 || X > 4){
            System.out.println("행 입력 : ");
            Y = sc.nextInt();
            System.out.println("열 입력 : ");
            X = sc.nextInt();
        }

        //물고기잡은거 확인
        if (fishing[Y][X]){
            System.out.println("물고기를 잡았당!");
            fishing[Y][X] = false;
            fishcnt--;
        }
        for (int i = 0; i < fishing.length; i++){
            for (int j = 0; j < fishing[i].length; j++){
                if (i == Y && j == X){

                }
            }
        }
    }
}
