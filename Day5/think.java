package Day5;

import java.util.Random;

public class think {
    public static void main(String[] args) {
        Random r = new Random(); //랜덤객체를 생성해서 변수 r에 대입
        boolean[][] hosu = new boolean[5][5];

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

    }
}
