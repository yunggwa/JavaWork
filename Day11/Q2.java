package Day11;

import java.util.Random;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        int cnt = 0;
        int[][] num = {
                {65, 66, 67}, //A B C
                {68, 69, 70},
                {71, 72, 73},
                {74, 75, 76},
                {77, 78, 79},
                {80, 81, 82},
                {83, 84, 85},
                {86, 87, 88},
                {89}, {42}, {90}, {35}
        };
        while (true) {
            System.out.print("입력해주세요 : ");
            int user = sc.nextInt();

//            for (int i = 0; i < 12; i++){
//                for (int j = 0; j < num.length; j++){
//                    for (int k = 0; k < num[j].length; k++){
//                        user = num[i][j];
//                    }
//                }
//            }
            if (user == 1) {
                cnt++;
            }

            if (cnt == 3) {
                System.out.print("출력: ");
            }

            for (int i = 0; i < num.length; i++) {
                int[] a = num[i];
                System.out.print((char) a[i] + str);
            }

            for (int s : num[2]) {
                System.out.print((char) s + " ");
            }

            System.out.println();
            cnt = 0;


        }

        }
    }
