package Day04;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int com = r.nextInt(100)+1;
        int count = 0;
        while (true){
            System.out.println("숫자를 입력해주세요");
            int user = sc.nextInt();
            if(user < 0 || user > 100){
                System.out.println("잘못 입력하셨습니다");
            }else {
                count++;
                if(com > user) {
                    System.out.println("업");
                } else if (com < user) {
                    System.out.println("다운");
                }
                else {
                    System.out.println("맞췄습니다 축하합니다");
                    break;
                }
                System.out.println("도전 횟수 : " + count);
            }
        }





    }
}
