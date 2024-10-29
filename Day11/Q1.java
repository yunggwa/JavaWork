package Day11;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int  com = r.nextInt(31)+1;

        while (true){
        System.out.print("숫자를 입력해주세요 : ");
        int user = sc.nextInt();
        if (user > 31 || user < 1){
            System.out.println("잘못된 입력입니다");
        }else {
            if (user > com){
                System.out.println("컴퓨터 다운");
            } else if (user < com) {
                System.out.println("컴퓨터 업");
            }else {
                System.out.println("정답입니다");
                break;
            }
        }

        }
    }
}
