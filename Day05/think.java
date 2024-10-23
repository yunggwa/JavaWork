package Day05;

import java.util.Random;
import java.util.Scanner;

public class think {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random(); //랜덤객체를 생성해서 변수 r에 대입
        boolean[][] hosu = new boolean[5][5];

        int top ;
        int down;
        int left;
        int right;

        while(true){
            //i가 0부터 시작해서 3미만까지 반복
            for (int i = 0; i < 3; i++){
                int h = r.nextInt(5); // 0~4 난수를 받아서 정수 변수 h에 대입
                int y = r.nextInt(5); //변수 y에 대입
                //5x5   배열에 h행과 y열에 값이 true이면 실행
                if (hosu[h][y]){ //true
                    //for문 초기화변수 i를 1감소
                    i--;
                }
                else { //5x5 배열에 h행과 y열안에 값을 true로 변경
                    hosu[h][y] = true;
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
            System.out.print("행을 입력해주세요");
            int col = sc.nextInt();
            System.out.print("열을 입력해주세요");
            int row = sc.nextInt();
            if (col < 1 || col > 5 || row < 1 || row > 5){
                System.out.println("다시 캐스팅해주세요.");
            }else {
                System.out.println("1.위 2.아래 3.왼쪽 4.오른쪽");
                int num = sc.nextInt();
                if (!(num < 1 || num > 5)){
                    if (num == 1){
                    }
                }

            }
        }


    }
}
