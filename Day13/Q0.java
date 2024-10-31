package Day13;

import java.util.Scanner;

class Ctrl{
    int add(int a, int b){
        return a + b;
    }
    int mi(int a, int b){
        return a - b;
    }
    int k (int a, int b){
        return a * b;
    }
    int n (int a, int b){
        return a / b;
    }

    double add(double a, double b){
        return a + b;
    }
    double mi(double a, double b){
        return a - b;
    }

    void print(Scanner sc){
        while (true){
            System.out.println("1.정수연산 2.실수연산 3.종료 : ");
            int num = sc.nextInt();
            if (num == 1){
                System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 : ");
                int number = sc.nextInt();
                if (number > 4 || number < 0){
                    System.out.println("잘못 입력하셨습니다");
                }else {
                    System.out.println("숫자 1 입력 : ");
                    int num1 = sc.nextInt();
                    System.out.println("숫자 2 입력 : ");
                    int num2 = sc.nextInt();
                    if (number == 1){}
                    else if (number == 2){

                    }
                    else if (number == 3){}
                    else if (number == 4){}
                    else {}

                }
            }


        }
//        System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 : ");
    }
}

public class Q0 {
    public static void main(String[] args) {

    }
}
