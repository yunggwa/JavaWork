package Day08;

import java.util.Scanner;

public class Q2 {

    //좌석
    static int[] seatInput(Scanner sc, int[] yx, int seatcnt) {
        System.out.println("예약하실 좌석을 입력해주세요 " + seatcnt + " 석");
        System.out.print("행 입력 : ");
        yx[0] = sc.nextInt();
        System.out.print("열 입력 : ");
        yx[1] = sc.nextInt();
        return yx;
    }

    static int airseat(boolean[][] seat, int[] yx, int seatcnt) {
        if (yx[0] > 9 || yx[0] < 1 || yx[1] > 2 || yx[1] < 1) {
            System.out.println("잘못된 입력입니다.");
        } else {
            if (seat[yx[0]-1][yx[1]-1]) {
                System.out.println("비어 있는 좌석");
                for (int i = 0; i < seat.length; i++) {
                    for (int j = 0; j < seat[i].length; j++) {
                        if (!seat[i][j]) {
                            System.out.println("행 : " + (i + 1) + "열 : " + (j + 1));
                        }
                    }
                }
            } else {
                System.out.println("예약이 완료 됐습니다");
                seat[yx[0]-1][yx[1]-1] = true;
                seatcnt--;
            }

        }
        return seatcnt;
    }
    static void stat(){
        Scanner sc = new Scanner(System.in);
        int seatcnt = 18;
        int[] yx = new int[2];
        boolean[][] seat = new boolean[9][2];

        while (seatcnt > 0){
            seatInput(sc,yx,seatcnt);
           seatcnt =  airseat(seat, yx, seatcnt);
        }
        System.out.println("모든 예약이 완료되었습니다");
    }

    public static void main(String[] args) {
        stat();
    }


}
