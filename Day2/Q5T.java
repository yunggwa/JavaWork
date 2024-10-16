package Day2;

import java.util.Scanner;

public class Q5T {
    public static void main(String[] args) {
        /*
        1. 입력 -> 국어 영어 수학
        2. 분기를 통한 출력
        2-1 올바른 경우 평균과 학점 출력
        2-2 올바르지 않은 경우 -> 과목 잘 못 입력 됐습니다.
         */

        //1. 입력
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 : ");
        int ko = sc.nextInt();
        System.out.print("영어 : ");
        int en = sc.nextInt();
        System.out.print("수학 : ");
        int math = sc.nextInt();

        //2. 확인
        if(ko >= 0 && ko <= 100 && en >= 0 && en <= 100 && math >= 0 && math <= 100){
            double avr = (ko + en + math) / 3.0;
            if (avr >= 95){
                System.out.printf("평균 %.1f이고 학점은 A+입니다", avr);
            } else if (avr >= 90) {
                System.out.printf("평균 %.1f이고 학점은 A입니다", avr);
            }else if (avr >= 85) {
                System.out.printf("평균 %.1f이고 학점은 B+입니다", avr);
            }else if (avr >= 80) {
                System.out.printf("평균 %.1f이고 학점은 B입니다", avr);
            }else if (avr >= 75) {
                System.out.printf("평균 %.1f이고 학점은 C입니다", avr);
            }else if (avr >= 60) {
                System.out.printf("평균 %.1f이고 학점은 D입니다", avr);
            }else {
                System.out.printf("평균 %.1f이고 학점은 F입니다", avr);
            }
        }else {
            if (ko < 0 || ko > 100){
                System.out.print("국어 ");
            }
            if (en < 0 || en > 100){
                System.out.print("영어 ");
            }
            if (math < 0 || math > 100){
                System.out.print("수학 ");
            }
            System.out.print("점수가 잘못입력됐습니다");
        }
    }
}
