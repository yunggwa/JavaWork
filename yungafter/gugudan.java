package yungafter;

import java.util.Scanner;

public class gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("1.구구단 2.전체구구단 3.종료 : ");
            int num = sc.nextInt();
            if (num < 0 || num > 3){
                System.out.println("잘못된 입력입니다");
            }else {
                if (num == 1){
                    System.out.print("원하는 구구단을 입력해주세요 : ");
                    int gugu = sc.nextInt();
                    if (gugu < 2 || gugu > 9){
                        System.out.println("잘못된 입력입니다");
                    }else {
                        for (int i = 1; i < 10; i++){
                            System.out.println(gugu+" * "+i+" = "+(gugu*i));
                        }
                    }
                } else if (num == 2) {
                    for (int i = 1; i < 10; i++){
                        for (int j = 1; j < 10; j++){
                            System.out.println(i+" * "+j+" = "+(i*j));
                        }
                    }
                }else {
                    System.out.println("프로그램을 종료합니다");
                    break;
                }

            }

        }
    }
}
