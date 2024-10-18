package Day02;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("월을 입력해주세요");
        int month = sc.nextInt();

        System.out.print("온도를 입력해주세요");
        int temp = sc.nextInt();



        if(month > 2 && month <6) {
            if (temp > 2 && temp < 16) {
                System.out.println(month + "월 봄입니다 " + "온도는 " + temp + "도 입니다.");
            }else if (temp >= -15 && temp <=37) {
                System.out.println("계절과 온도가 맞지않습니다");
            }
            else {
                System.out.println("잘못된 입력입니다");
            }
        } else if (month > 5 && month < 9) {
            if(temp > 17 && temp < 38){
                System.out.println(month + "월 여름입니다 " + "온도는 " + temp + "도 입니다.");
            }else if (temp >=-15 && temp <=37) {
                System.out.println("계절과 온도가 맞지않습니다");
            }
            else {
                System.out.println("잘못된 입력입니다");
            }
        } else if (month > 8 && month < 12) {
            if (temp > 2 && temp < 16){
                System.out.println(month + "월 가을입니다 " + "온도는 " + temp + "도 입니다.");
            }else if (temp >= -15 && temp <=37) {
                System.out.println("계절과 온도가 맞지않습니다");
            }
            else {
                System.out.println("잘못된 입력입니다");
            }

        } else if (month <= 2 || month == 12) {
            if (temp >= -15 && temp < 3){
                System.out.println(month + "월 겨울입니다 " + "온도는 " + temp + "도 입니다.");
            } else if (temp >= 15 && temp <=37) {
                System.out.println("계절과 온도가 맞지않습니다");
            } else {
                System.out.println("잘못된 입력입니다");
            }

        }else {
            System.out.println("잘못된 입력입니다");
        }


    }
}
