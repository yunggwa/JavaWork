package Day01;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 :");
        int a = sc.nextInt();

        System.out.print("숫자 입력 :");
        int b = sc.nextInt();

        System.out.print(" 더하기는 :"+(a + b));

        System.out.print(" 빼기는 :"+(a - b));


        /*
        숫자 2개를 입력 받아서
        더하기 빼기 결과 값을
        출력하는 프로그램을 만드세요.

        1. 숫자 2개 입력 -> 입력 Scanner 정수변수 2개
        2. 더하기 연산 출력
        3. 빼기 연산 출력

         */
//
//        Scanner sc = new Scanner(System.in);
//        //숫자 1입력
//        System.out.print("숫자 1: ");
//        int num1 = sc.nextInt();
//        //숫자 2입력
//        System.out.println("숫자 2: ");
//        int num2 = sc.nextInt();
//        //더하기 결과값 출력
//        System.out.println("더하기 값 출력 : " + (num1 + num2));
//        //빼기 결과값 출력
//        System.out.println("빼기 값 출력 : " + (num1 - num2));

    }
}
