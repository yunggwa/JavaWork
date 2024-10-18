package Day03;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요");
        int num = sc.nextInt();
        if (num <= 0 || num > 6) {
            System.out.println("잘못된입력입니다");
        } else {
            System.out.print("원하는 숫자를 입력해주세요");
            int star = sc.nextInt();
            if (num == 1) {
                for (int i = 0; i < star+2; i++) {
                    for (int j = 0; j < star; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            if (num == 2) {
                for (int i = 0; i < star; i++) {
                    for (int j = 0; j < star; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            }
            if (num == 3) {
                System.out.println(".");
            }
            if (num == 4) {
                for (int i = 0; i < star; i++) {
                    for (int j = 2; j >= 0; j--) {
                        if (i < j) {
                            System.out.print(" ");
                        } else {
                            for (int k = 0; k <= i * 2; k++) {
                                System.out.print("*");
                            }
                            break;
                        }
                    }
                    System.out.println();
                }
                if (num == 5) {
                    for (int i = 0; i < star; i++) {
                        for (int j = 2; j >= 0; j--) {
                            if (i < j) {
                                System.out.print(" ");
                            } else {
                                for (int k = 0; k <= i * 2; k++) {
                                    System.out.print("*");
                                }
                                break;
                            }
                        }
                        System.out.println();
                    }
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = i; k - (i * 2) > 0; k--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                if (num == 6) {

                    System.out.println("프로그램을 종료합니다");
                }


            }
        }
    }
}
