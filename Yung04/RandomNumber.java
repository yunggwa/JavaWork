package Yung04;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        //랜덤숫자를 만들기 1 ~ 100까지!
        int com = r.nextInt(100)+1;

        //총 도전횟수를 알기위해 만드는 카운트변수
        int cnt = 0;

        while (true){ //맞출때까지 하기 위해 무한루프
            System.out.print("숫자를 입력해주세요 : ");
            int num = sc.nextInt(); //사용자 숫자입력
            if (num > 100 || num < 0){ //100을 넘는 숫자나 0 보다 아래 숫자를 입력하면 잘못출력
                System.out.println("잘못 입력 하셨습니다 다시 입력해주세요");
            }else {
                cnt++; //숫자입력하면 카운트 증가
                // num을 0 이상 100미만의 숫자로 잘 입력했을 때
                if (com > num){ //랜덤숫자가 입력숫자보다 클 때
                    System.out.println("업");
                } else if (com < num) { //랜덤숫자가 입력숫자보다 작을 때
                    System.out.println("다운");
                } else { //맞췄을 때
                    System.out.println("축하드려요! 맞추셨습니다!");
                    break; //맞추면 빠져나오면서 종료
                }
            }
        }
            System.out.println("총 도전횟수 : " + cnt + "회");
    }
}
