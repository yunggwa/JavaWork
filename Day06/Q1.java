package Day06;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random(); //랜덤객체를 생성해서 변수 r에 대입
        boolean[][] hosu = new boolean[5][5];

        int y = -1;
        int x = -1;

        int fishcnt = 0;

        while(true){
            //i가 0부터 시작해서 3미만까지 반복
            for (int i = 0; i < 3; i++){
                int hy = r.nextInt(5); // 0~4 난수를 받아서 정수 변수 h에 대입
                int hx = r.nextInt(5); //변수 y에 대입
                //5x5   배열에 h행과 y열에 값이 true이면 실행
                if (hosu[hy][hx]){ //true
                    //for문 초기화변수 i를 1감소
                    i--;
                }
                else { //5x5 배열에 h행과 y열안에 값을 true로 변경
                    hosu[hy][hx] = true;
                    fishcnt++;
                }
            }
            for (int i = 0; i < hosu.length; i++){
                for (int j = 0; j< hosu[i].length; j++){
                    if (hosu[i][j]){ //true
                        System.out.print("● ");
                    }else { //false
                        System.out.print("○ ");
                    }
                }
                System.out.println();

            }
            //캐스팅
            while (y < 0 || y > 4 || x < 0 || x > 4){
                System.out.print("행 입력 : ");
                y = sc.nextInt();
                System.out.print("열 입력 :");
                x = sc.nextInt();
            }

            //캐스팅 된 호수 출력
            for (int i = 0; i < hosu.length; i++){
                for (int j = 0; j < hosu[i].length; j++){
                    //1.찌위치
                    if (i == y && j == x){
                        System.out.print("X ");
                    }
                    //2.물고기
                    else if (hosu[i][j]){
                        System.out.print("● ");
                    }
                    else {
                        System.out.print("○ ");
                    }
                    //3.아무것도 없는
                }
                System.out.println();
            }
            //물고기 잡을때까지 반복\
            while (fishcnt > 0){
                System.out.print("1.위 2.아래 3.왼쪽 4.오른쪽 :");
                int num = sc.nextInt();
                if (num == 1){
                    y--;
                    if (y < 0){
                        System.out.println("더 이상 위로 움직일 수 없습니다");
                        y = 0;
                    }
                }else if (num == 2){
                    y++;
                    if (y > 4){
                        System.out.println("더 이상 아래로 움직일 수 없습니다");
                        y = 4;
                    }
                } else if (num == 3) {
                    x--;
                    if (x < 0){
                        System.out.println("더 이상 왼쪽으로 움직일 수 없습니다");
                        x = 0;
                    }

                } else if (num == 4) {
                    x++;
                    if (x > 4){
                        System.out.println("더 이상 오른쪽으로 움직일 수 없습니다");
                        x = 4;
                    }

                }else {
                    System.out.println("잘못된 입력입나다");
                }
                if (hosu[y][x]){
                    System.out.println("물고기를 잡았습니다");
                    hosu[y][x] = false;
                    fishcnt--;
                }
                for (int i = 0; i < hosu.length; i++){
                    for (int j = 0; j < hosu[i].length; j++){
                        //1.찌위치
                        if (i == y && j == x){
                            System.out.print("X ");
                        }
                        //2.물고기
                        else if (hosu[i][j]){
                            System.out.print("● ");
                        }
                        else {
                            System.out.print("○ ");
                        }
                        //3.아무것도 없는
                    }
                    System.out.println();
                }
            }
            System.out.println("물고기를 모두 잡았습니다");
        }
    }
}
