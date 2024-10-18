package Yung;

import java.util.Scanner;

public class 성별요금 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("남 / 여 중에 하나를 입력해주세요");
        String gen = sc.next();

        System.out.print("나이를 입력해주세요");
        int age = sc.nextInt();

        if(gen.equals("남") && age > 0 || gen.equals("여") && age > 0){
            if(age < 18){
                System.out.println(gen + "무료입니다");
            } else if (age >= 18 && age < 60) {
                System.out.println(gen + "10,000원");
            }else {
                System.out.println(gen +"5,000원");
            }
        }else {
                System.out.println("잘못된 입력입니당");
            }

    }
}
