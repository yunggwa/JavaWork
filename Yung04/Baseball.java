package Yung04;

import java.util.Random;
import java.util.Scanner;

public class Baseball {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        String str = " ";
        //컴 중복되지않은 랜덤수 3개 만들기 1~9까지
        int[] com = new int[3];
        for (int i = 0; i < com.length; i++){
            int num = r.nextInt(9)+1;
            com[i] = num;
        }
        if (com[0] != com[1] && com[0] != com[2] && com[1] != com[2]){
                System.out.println("com의 숫자는 : " + com[0] + str + com[1] + str + com[2]);
        }
        while (true){
            //유저 입력 sout

            int[] user = new int[3];
            for (int i = 0; i < user.length; i++){
                System.out.print((i + 1) + " 번째 숫자를 입력해주세요 : ");
                user[i] = sc.nextInt();
            }
            System.out.println(user[0] + str + user[1] + str + user[2]);

            //스트라이크와 볼 카운트
            int st = 0;
            int ball = 0;

            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    if (com[i] == user[j]) {
                        if (i == j) {
                            st++;
                        } else {
                            ball++;
                        }
                    }
                }
            }
            if (st == 0 && ball == 0){
                System.out.println("아웃입니다~");
            }
            else if (st  == 3) {
                System.out.println("홈런입니다");
                break;
            }else {
                System.out.println(st + " 스트라이크, " + ball + " 볼 입니다!!");
            }


        }


    }

}
