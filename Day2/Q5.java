package Day2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 점수를 입력해주세요");
        int ko = sc.nextInt();
        System.out.print("영어 점수를 입력해주세요");
        int en = sc.nextInt();
        System.out.print("수학 점수를 입력해주세요");
        int math = sc.nextInt();


        double avr = (math + en + ko) / 3;
        System.out.printf("%.2f ", avr );

        if(math > 100 || math < 0 || en > 100 || en < 0 || ko > 100 || ko < 0){
            if (math > 100 || math < 0){
                System.out.print("수학");
            }
            if (en > 100 || en < 0){
                System.out.print("영어 ");
            }
            if (ko > 100 || ko < 0){
                System.out.print("국어 ");
            }

            System.out.print("점수가 잘못 입력됐습니다");
        }else {
            if(avr >= 95){
                System.out.println("A+입니다");
            } else if (avr >= 90) {
                System.out.println("A입니다");
            } else if (avr >= 85 && avr < 90) {
                System.out.println("B+입니다");
            } else if (avr >= 80 && avr < 85) {
                System.out.println("B입니다");
            } else if (avr >= 75 && avr < 80) {
                System.out.println("C+입니다");
            } else if (avr >= 70 && avr < 75) {
                System.out.println("C입니다");
            } else if (avr >= 60 && avr < 70) {
                System.out.println("D입니다");
            } else{
                System.out.println("F입니다");
            }
        }
        }
    }

