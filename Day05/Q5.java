package Day05;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int[][] arr = new int[9][2]; //비행기 좌석 배열 생성

        boolean[][] seat = new boolean[9][2];
        int cnt = 18;

        while (cnt > 0){
            //입력
            System.out.println("예약하실 좌석을 입력해주세요 " + cnt + " 석");
            System.out.print("행 : ");
            int col = sc.nextInt();
            System.out.print("열 : ");
            int row = sc.nextInt();
            if (col > 9 || col < 1 || row > 2 || row < 1){
                System.out.println("잘못된 입력입니다.");
            }else {
                if (seat[col-1][row-1]){
                    System.out.println("비어 있는 좌석");
                    for (int i = 0; i < seat.length;i++){
                        for (int j = 0; j < seat[i].length; j++){
                            if (!seat[i][j]){
                                System.out.println("행 : " + (i + 1)+ "열 : " + (j + 1));
                            }
                        }
                    }
                }
                else {
                    System.out.println("예약이 완료 됐습니다");
                    seat[col-1][row-1] = true;
                    cnt--;
                }
            }
        }
        System.out.println("모든 좌석이 예약됐습니다.");
//        while (true){
//            System.out.println("예약하실 좌석을 입력해주세요 " + cnt + " 석");
//            System.out.print("행 : ");
//            int col = sc.nextInt();
//            System.out.print("열 : ");
//            int row = sc.nextInt();
//
//            if (col > 9 || col < 0 || row > 9 || row < 0){
//                System.out.println("잘못된 입력입니다.");
//            }else {
//                for (int i = 0; i < arr.length; i++){
//                    for (int j = 0; j < arr.length; j++){
//                        arr[i][j] = cnt++;
//                        if (arr[i][j] == -1){
//                            System.out.println("예약이 끝났습니다");
//                        }else {}
//                    }
//                }
//            }
//        }


    }
}
