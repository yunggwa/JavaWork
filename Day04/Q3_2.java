package Day04;

import java.util.Random;
import java.util.Scanner;

public class Q3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();




//        while (true){
//            for (i = 0; i < 3; i++){
//                int num = r.nextInt(9)+1;
//                com[i] = num;
//            }
//            if (com[0] != com[1] && com[0] != com[2] && com[1] != com[2]){
//                System.out.print(com[0]+ "," + com[1] +","+ com[2]);
//                break;
//            }
//        }
        int[] user = new int[3];

        int[] com = new int[3];
        int i;
        int j;
        for (i = 0; i < com.length; i++){
            int num = r.nextInt(9)+1;
            com[i] = num;
            j = i;
            if (com[0] != com[1] && com[0] != com[2] && com[1] != com[2]) {
                System.out.println(com[0] + "," + com[1] + "," + com[2]);
//                break;
                System.out.print(i + "번째 숫자를 입력해주세요");
                user[i] = sc.nextInt();
                if ((user[0] == user[1] || user[0] == user[2] || user[1] == user[2]) && (user[0] < 0 || user[0] > 10 || user[1] < 0 || user[1] > 10 || user[2] < 0 || user[2] > 10)) {
                    System.out.println("다시 입력하세요");
                } else {
                    int st = 0;
                    int ball = 0;
                    if (com[i] == user[i]) {
                        st++;
                    } else {
                        ball++;
                    }
                    if (st == 0 && ball == 0) {
                        System.out.println("Out입니다.");
                    } else if (st == 3) {
                        System.out.println("홈런입니다.");
                        break;
                    } else {
                        System.out.println("Strike : " + st + ", Ball : " + ball);
                    }

                }

            }



//            for (i = 0; i < 3; i++) {
//                for (j = 0; j < i; i++) {
//                    if (com[i] == com[j]) {
//                        j--;
//                        com[i] = r.nextInt(9)+1;
//
//                    }
//                    System.out.println(com[0] + "," + com[1] + "," + com[2]);
//                }
//            }
//            for (i = 0; i < 3; i++){
//                user[i] = sc.nextInt();
//                System.out.println((i+1) + "번째 숫자를 입력해주세요");
//                if ((user[0] == user[1] || user[0] == user[2] || user[1] == user[2]) && (user[0] < 0 || user[1] > 10 || user[1] < 0 || user[1] > 10 || user[2] < 0 || user[2] > 10)) {
//                    System.out.println("다시 입력하세요");
//                }else {
//                    int st = 0;
//                    int ball = 0;
//                    for (i = 0; i < 3; i++){
//                        if (com[i] == user[i]){
//                            st++;
//                        }else {
//                            ball++;
//                        }
//                    }
//                    if (st == 0 && ball == 0){
//                        System.out.println("Out입니다.");
//                    } else if (st == 3) {
//                        System.out.println("홈런입니다.");
//                        break;
//                    }else {
//                        System.out.println("Strike : "+ st +", Ball : " + ball);
//                    }
//
//                }
//            }

//            if ((user[0] == user[1] || user[0] == user[2] || user[1] == user[2]) && (user[0] < 0 || user[1] > 10 || user[1] < 0 || user[1] > 10 || user[2] < 0 || user[2] > 10)) {
//                System.out.println("다시 입력하세요");
//            }else {
//                int st = 0;
//                int ball = 0;
//                if (com[0] == user[0]){
//                    st++;
//                }
//                if (com[1] == user[1]){
//                    st++;
//                }
//                if (com[2] == user[2]){
//                    st++;
//                }
//            }for (i = 0; i < 3; i++){
//                for (j = 0; j < i; i++){
//                    if (com[i] == com[j]){
//                        j--;
//                        break;
//                    }
//                }

        }




    }
}
