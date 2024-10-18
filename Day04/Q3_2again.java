package Day04;

import java.util.Random;
import java.util.Scanner;

public class Q3_2again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int[] com = new int[3];

        for (int i = 0; i < 3; i++) {
            com[i] = r.nextInt(9) + 1;
            for (int j = 0; j < i; j++) {
                if (com[i] == com[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(com[0] + "," + com[1] + "," + com[2]);

        int st = 0;
        int ball = 0;
        int[] user = new int[3];

        while(true){
            for (int i = 0; i < 3; i++){
                System.out.print(i + 1 + "번째 : ");
                user[i] = sc.nextInt();
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
}
