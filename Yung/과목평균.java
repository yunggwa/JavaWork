package Yung;

import java.util.Scanner;

public class 과목평균 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 점수 : ");
        int ko = sc.nextInt();

        System.out.print("영어 점수 : ");
        int en = sc.nextInt();

        System.out.print("수학 점수 : ");
        int math = sc.nextInt();

        double avg = (ko + en + math) / 3.0;

        if(math >= 0 && math <= 100 && ko >= 0 && ko <= 100 && en >= 0 && en <= 100){
            if(avg >= 95){
                System.out.printf("평균 학점은 %.1f A+학점입니다", avg);
            }
            else if(avg >= 90){
                System.out.printf("평균 학점은 %.1f A학점입니다", avg);
            }
            else if(avg >= 85){
                System.out.printf("평균 학점은 %.1f B+학점입니다", avg);
            }
            else if(avg >= 80){
                System.out.printf("평균 학점은 %.1f B학점입니다", avg);
            }
            else if(avg >= 75){
                System.out.printf("평균 학점은 %.1f C+학점입니다", avg);
            }
            else if(avg >= 70){
                System.out.printf("평균 학점은 %.1f C학점입니다", avg);
            }
            else if(avg >= 60){
                System.out.printf("평균 학점은 %.1f D점입니다", avg);
            }else {
                System.out.printf("평균 학점은 %.1f F점입니다", avg);
            }
        }else {
            if(ko < 0 || ko > 100){
                System.out.println("국어 점수가 잘못 입력 됐습니다");
            }
            if(en < 0 || en > 100){
                System.out.println("영어 점수가 잘못 입력 됐습니다");
            }
            if(math < 0 || math > 100){
                System.out.println("수학 점수가 잘못 입력 됐습니다");
            }
        }
    }
}
