package YungMethod04;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    //랜덤숫자를 출력하는 메소드
    static int com(Random r){
        //확인할 방법이 없기때문에 리턴
        return r.nextInt(100)+1;
        //출력을 해서 결과값을 봐야하기때문에 리턴ㅌ
    }
    //숫자 입력 메소드
    static int user(Scanner sc){
        return sc.nextInt();
    }
    static boolean game(int num, int com){
        if (num > 100 || num < 0){ //100을 넘는 숫자나 0 보다 아래 숫자를 입력하면 잘못출력
            System.out.println("잘못 입력 하셨습니다 다시 입력해주세요");
            return true;
        }else {
//            cnt++; //숫자입력하면 카운트 증가
            // num을 0 이상 100미만의 숫자로 잘 입력했을 때
            if (com > num) { //랜덤숫자가 입력숫자보다 클 때
                System.out.println("업");
                return true;
            } else if (com < num) { //랜덤숫자가 입력숫자보다 작을 때
                System.out.println("다운");
                return true;
            } else { //맞췄을 때
                System.out.println("축하드려요! 맞추셨습니다!");
                return false;
                //맞추면 빠져나오면서 종료
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        //int com = r.nextInt(100) + 1;
        int com = com(r); //int변수에 다시 메소드 담기
        boolean check = true;

        while (check){
            System.out.print("숫자를 입력해주세요 : ");
            //int user = sc.nextInt();
            int user = user(sc); //int 변수에 다시 메소드 담기
            check = game(user, com);
            //체크라는 변수에 이 게임이 담기는것이 된다
        }
    }
}