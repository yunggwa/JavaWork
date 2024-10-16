package Yung;

import java.util.Scanner;

public class 계절온도받기조건문 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("월을 입력해주세요!");
        int month = sc.nextInt();
        System.out.print("온도를 입력해주세요");
        int temp = sc.nextInt();

        //온도는  -15보다 작으면 안되고 37도보다 높으면 안된다
        //월은 1미만으로 가면 안되고 13이상으로 가면안된다

        if(month < 1 || month > 12 || temp < -15 || temp > 37){
            System.out.println("잘못된 입력입니다");
        }else {
            if(month >=3 && month <=5){
                if (temp >=3 && temp <= 15){
                    System.out.println("계절은 봄입니다. 온도는" + temp + "입니다");
                }else {
                    System.out.println("계절과 온도가 맞지 않습니다");
                }
            }
            if(month >=6 && month <=8){
                if (temp >=18 && temp <= 37){
                    System.out.println("계절은 여름입니다. 온도는" + temp + "입니다");
                }else {
                    System.out.println("계절과 온도가 맞지 않습니다");
                }
            }
            if(month >=9 && month <=11){
                if (temp >=3 && temp <= 15){
                    System.out.println("계절은 가을입니다. 온도는" + temp + "입니다");
                }else {
                    System.out.println("계절과 온도가 맞지 않습니다");
                }
            }
            if(month == 1 || month == 2 || month == 12){
                if (temp >= -15 && temp <= 2){
                    System.out.println("계절은 겨울입니다. 온도는" + temp + "입니다");
                }else {
                    System.out.println("계절과 온도가 맞지 않습니다");
                }
            }

        }
    }
}
