package yungafter;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("첫번째 숫자 입력 :");
            int num1 = sc.nextInt();
            System.out.print("두번째 숫자 입력 :");
            int num2 = sc.nextInt();
            System.out.print("연산자입력 : ");
            String op = sc.next();
            if (op.equals("+")){
                System.out.println("결과값 : " + (num1 + num2));
            }
            else if (op.equals("-")){
                System.out.println("결과값 : " + (num1 - num2));
            }
            else if (op.equals("*")){
                System.out.println("결과값 : " + (num1 * num2));
            }
            else if (op.equals("/")){
                System.out.printf("결과값 : %.1f \n", (double)num1 / num2);
            }else {
                System.out.println("잘못된 연산자 입니다.");
            }
        }
    }
}
