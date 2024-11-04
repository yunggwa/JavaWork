package Yung06;

import java.util.Random;
import java.util.Scanner;

public class fishing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        //호수 배열 만들기
        boolean[][] lake = new boolean[5][5];
        int fishcnt = 0; //낚시 횟수 초기화랑 제한을 위한 카운트 변수

        int y = -1;
        int x = -1; //0으로 지정하면 처음은 무조건 자동캐스팅이 되기때문에 -1값지정

        //물고기 3마리 배치
        for (int i = 0; i < 3; i++){
            int ly = r.nextInt(5);
            int lx = r.nextInt(5); //[5][5]배열을 위한 랜덤값
            if (lake[ly][lx]){
                i--; // true면 i를 초기화시키고 다시 랜덤 돌리기
            }else {
                lake[ly][lx] = true; //랜덤물고기가 발견된다면 값을 true로 변경후에
                fishcnt++; //피쉬카운트 증가
            }
        }

        //배치된 물고기 출력
        for (int i = 0; i < lake.length; i++){
            for (int j = 0; j < lake[i].length; j++){
                if (lake[i][j]){
                    System.out.print(" ^ "); //값이 트루면 물고기
                }else {
                    System.out.print(" ~ "); //false일 경우 물결

                }
            }
            System.out.println(); //5 5 를 위한 개행
        }

        //캐스팅
        while (y < 0 || y > 4 || x < 0 || x > 4) {
            System.out.print("행을 입력하세요 : ");
            y = sc.nextInt();
            System.out.print("열을 입력하세요 : ");
            x = sc.nextInt();
        }
        System.out.println("y : " + y + " X : " + x);
        //물고기를 잡았는지 확인!
        if (lake[y][x]){ //값이 true일때! (물고기가 있을 때!)
            System.out.println("물고기를 잡았다!");
            lake[y][x] = false; //잡은 후 값을 false로 바꿔줘서 물로 바꿔주기
            fishcnt--; //캐스팅 카운트 감소 (최대 3)
        }

        //물고기를 잡은후 출력
        for (int i = 0; i < lake.length; i++){
            for (int j = 0; j < lake[i].length; j++){
                if (i == y && i == x){
                    System.out.print(" x ");
                } else if (lake[i][j]) {
                    System.out.print(" ^ ");
                }else {
                    System.out.print(" ~ ");

                }
            }
            System.out.println();
        }

        //무한루프로 캐스팅
        while (fishcnt > 0){ //와일문안에 아예 조건 주기 fishcnt가 0이 되면 자동 종료
            System.out.print("1.위 2.아래 3.왼쪽 4.오른쪽 : ");
            int num = sc.nextInt();
            if (num == 1){
                y--;
                if (y < 0){
                    y = 0;
                    System.out.println("위로는 이동 불가능!");
                }
            }
            else if (num == 2){
                y++;
                if (y > 4){
                    y = 4;
                    System.out.println("아래는 이동 불가능!");
                }
            }
           else if (num == 3){
                x--;
                if (x < 0){
                    x = 4;
                    System.out.println("왼쪽으로 이동 불가능!");
                }
            }
           else if (num == 4){
                x++;
                if (x > 4){
                    x = 0;
                    System.out.println("오른쪽으로 이동 불가능!");
                }
            }else {
                System.out.println("잘못입력! 다시 입력부탁!");
            }

                //물고기 잡은 여부 확인 / 물고기 + 캐스팅된 호수 출력
            if (lake[y][x]){ //값이 true일때! (물고기가 있을 때!)
                System.out.println("물고기를 잡았다!");
                lake[y][x] = false; //잡은 후 값을 false로 바꿔줘서 물로 바꿔주기
                fishcnt--; //캐스팅 카운트 감소 (최대 3)
            }
            for (int i = 0; i < lake.length; i++){
                for (int j = 0; j < lake[i].length; j++){
                    if (i == y && j == x){
                        System.out.print(" x ");
                    } else if (lake[i][j]) {
                        System.out.print(" ^ ");
                    }else {
                        System.out.print(" ~ ");

                    }
                }
                System.out.println();
            }

        }
        System.out.println("물고기를 다 잡았습니다!");


    }
}
