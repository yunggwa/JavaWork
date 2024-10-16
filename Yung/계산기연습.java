package Yung;

import java.util.Scanner;

public class 계산기연습 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자 : ");
        int num1 = sc.nextInt();

        System.out.print("연산자 * / + - 중에 하나를 입력하시오");
        String op = sc.next();

        System.out.print("두번째 숫자 : ");
        int num2 = sc.nextInt();

        if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")){
            if (op.equals("+")){
                System.out.printf("결과값 : %d", num1 + num2);
            }
            else if (op.equals("-")){
                System.out.printf("결과값 : %d",  num1 - num2);
            }
            else if (op.equals("*")){
                System.out.printf("결과값 : %d", num1 * num2);
            }
            else {
                System.out.printf("결과값 : %.1f", (double)num1 /num2);
            }
        }else {
            System.out.println("잘못된 연산자입니다");
        }
    }
}

