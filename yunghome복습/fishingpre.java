package yunghome복습;

import java.util.Random;
import java.util.Scanner;

public class fishingpre {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        boolean[][] fishing = new boolean[5][5]; //호수
        int fishcnt = 0;
        int y = -1;
        int x = -1;

        //물고기 배치
        for (int i = 0; i < 3; i++){
            int fy = r.nextInt(5);
            int fx = r.nextInt(5);

            if (fishing[fy][fx]){
                i--; //i를 -하는 이유는 초기화변수 1감소
            }else {
                fishing[fy][fx] = true;
                fishcnt++;
            }
        }
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
        while (y > 4 || y < 0 || x > 4 || x < 0){
            System.out.print("행 입력 : ");
            y = sc.nextInt();
            System.out.print("열 입력 : ");
            x = sc.nextInt();
        }
        System.out.println("행 : " + y + ", 열 : " + x);


        if (fishing[y][x]){
            System.out.println("물고기를 잡았다!");
            fishing[y][x] = false;
            fishcnt--;
        }
        for (int i = 0; i < fishing.length; i++){
            for (int j = 0; j < fishing[i].length; j++){
                if (i == y && j == x){
                    System.out.print(" x ");
                } else if (fishing[i][j]) {
                    System.out.print(" ^ ");
                }else {
                    System.out.print(" ~ ");
                }
            }
            System.out.println();
        }

        while (fishcnt > 0){
            System.out.print("1.위 2.아래 3.왼쪽 4.오른쪽 : ");
            int num = sc.nextInt();
            if (num == 1){
                y--;
                if (y < 0){
                    System.out.println("더 이상 위로 갈 수 없습니다");
                    y = 0;
                }
            } else if (num == 2) {
                y++;
                if (y > 4){
                    System.out.println("더 이상 아래로 갈 수 없습니다");
                    y = 4;
                }
            } else if (num == 3) {
                x--;
                if (x < 0){
                    System.out.println("더 이상 왼쪽으로 갈 수 없습니다");
                    x = 0;
                }
            } else if (num == 4) {
                x++;
                if (x > 4){
                    System.out.println("더 이상 오른쪽으로 갈 수 없습니다");
                    x = 4;
                }
            }else {
                System.out.println("잘못된 입력입니다");
            }
            if (fishing[y][x]){
                System.out.println("물고기를 잡았따!");
                fishing[y][x] = false;
                fishcnt--;
            }
            for (int i = 0; i < fishing.length; i++){
                for (int j = 0; j < fishing[i].length; j++){
                    if (i == y && j == x){
                        System.out.print(" x ");
                    } else if (fishing[i][j]) {
                        System.out.print(" ^ ");
                    }else {
                        System.out.print(" ~ ");
                    }
                }
                System.out.println();
            }
        }
        System.out.println("물고기를 다 잡았다!");
    }
}
