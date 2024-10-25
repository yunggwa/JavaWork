package yungafter;

import java.util.Scanner;

public class airport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[][] airseat = new boolean[9][2];
        int[] seat = new int[2];
        int cnt = 18;

         while (cnt > 0){
             System.out.println("좌석은 총" + cnt + "자리 입니다");
             System.out.print("행을 입력 : ");
             seat[0] = sc.nextInt();
             System.out.print("열을 입력 : ");
             seat[1] = sc.nextInt();
             if (seat[0] > 9 || seat[0] < 1 || seat[1] > 9 || seat[1] < 1){
                 System.out.println("잘못된 입력입니다");
             }else {
                 for (int i = 0; i < seat.length; i++){
                     for (int j = 0; j < seat[i]; j++){

                     }
                 }
             }
         }
    }
}
