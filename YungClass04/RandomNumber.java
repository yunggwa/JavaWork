package YungClass04;

import java.util.Random;
import java.util.Scanner;

class Com{
    Random r = new Random();
    int comrandom = r.nextInt(100)+1;
}
class User{
    int print(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력 : ");
        return sc.nextInt();
    }
}
class Game{
    Com com;
    User user;
    Game(){
        com = new Com();
        user = new User();

        //컴 랜덤값 변수
        int random = com.comrandom;
//        System.out.println("컴퓨터의 숫자는 : " + random);
        while (true){
        //유저입력값 변수
            int userprint = user.print();
            if (userprint > 100 || userprint < 0){
                System.out.println("잘못 입력하셨습니다");
            }else {
                if (random > userprint){
                    System.out.println("업");
                } else if (random < userprint) {
                    System.out.println("다운");
                }else {
                    System.out.println("축하드립니다! 정답!!");
                    break;
                }
            }
        }
    }
}
public class RandomNumber {
    public static void main(String[] args) {
        new Game();
    }
}
