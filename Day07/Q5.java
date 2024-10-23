package Day07;

import java.util.Random;
import java.util.Scanner;

public class Q5 {
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    //유저
    static void userInput(Scanner sc){
        int[] user = new int[3];
        for (int i = 0; i < user.length; i++){
            user[i] = sc.nextInt();
            System.out.println((i+1) + "번째 숫자 입력");
        }
    }
    //컴
    static void comInput(Random r){
        int[] com = new int[3];
        for (int i = 0; i < 3; i++) {
            com[i] = r.nextInt(9) + 1;
            for (int j = 0; j < i; j++) {
                if (com[i] == com[j]) {
                    i--;
                }
            }
        }
    }
    static void comparasion(int[]user, int[]com){
        int st = 0;
        int ball = 0;

        while(true){
            for (int i = 0; i < 3; i++){
                System.out.print(i + 1 + "번째 : ");
                if (user[i] < 1 || user[i] > 9){
                    i--;
                    continue;
                }
                for (int j = 0; j < i; j++){
                    if (user[i] == user[j]){
                        i--;
                        break;
                    }
                }
            }
            st = 0;
            ball = 0;

            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    if (user[i] == com[j]){
                        if (i == j){
                            st++;
                        }
                        else {
                            ball++;
                        }
                    }
                }
            }
            if (st == 0 && ball == 0){
                System.out.println("아웃입니다");
            } else if (st == 3) {
                System.out.println("홈런입니다");

            }else {
                System.out.println("strike : " + st + "," + "ball : " + ball);
            }
        }

    }
    static void finish(){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
    }

}
