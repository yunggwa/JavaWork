package yungafter;

import java.util.Scanner;

public class month {
    public static void main(String[] args) {

        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.print("월을 입력해주세요 : ");
            int month = sc.nextInt();
            System.out.print("온도를 입력해주세요 : ");
            int temp = sc.nextInt();
            if (month <= 12 && month > 0 && temp <= 37 && temp >= -15){
                if ((month >= 3 && month <= 5) && (temp >= 3 && temp <= 15)){
                    System.out.println("계절은 봄입니다 온도는" + temp + "입니다");
                } else if ((month >= 6 && month <= 8) && (temp >= 18 && temp <= 37)){
                    System.out.println("계절은 여름입니다 온도는" + temp + "입니다");
                } else if ((month >= 9 && month <= 11) && (temp >= 3 && temp <= 15)){
                    System.out.println("계절은 가을입니다 온도는" + temp + "입니다");
                }else if ((month == 1 && month == 2 && month == 12) && (temp <= 2 && temp >= -15)){
                    System.out.println("계절은 겨울입니다 온도는" + temp + "입니다");
                }else {
                    System.out.println("계절과 온도가 맞지않습니다");
                }
            }else {
                System.out.println("잘못된 입력입니다");
            }
        }
    }
}
