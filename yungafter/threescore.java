package yungafter;

import java.util.Scanner;

public class threescore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("국어 점수 : ");
            int ko = sc.nextInt();
            System.out.print("영어 점수 : ");
            int en = sc.nextInt();
            System.out.print("수학 점수 : ");
            int ma = sc.nextInt();
            if (ko > 100 || ko < 0 || en > 100 || en < 0 || ma > 100 || ma < 0){
                if (ko > 100 || ko < 0){
                    System.out.print("국어");
                }
                if (en > 100 || en < 0){
                    System.out.print("영어");
                }
                if (ma > 100 || ma < 0){
                    System.out.print("수학");
                }
                System.out.println(" 점수를 잘못 입력했습니다");
                break;
            }else {
                double result = (ko + en + ma) / 3.0;
                if (result >= 95){
                    System.out.println("A+ 평균 " + result + "점 입니다");
                }
                else if (result >= 90){
                    System.out.println("A 평균 " + result + "점 입니다");
                }
                else if (result >= 85){
                    System.out.println("B+ 평균 " + result + "점 입니다");
                }
                else if (result >= 80){
                    System.out.println("B 평균 " + result + "점 입니다");
                }
                else if (result >= 75){
                    System.out.println("C+ 평균 " + result + "점 입니다");
                }
                else if (result >= 70){
                    System.out.println("C 평균 " + result + "점 입니다");
                }
                else if (result >= 60){
                    System.out.println("D 평균 " + result + "점 입니다");
                }
                else {
                    System.out.println("F 평균 " + result + "점입니다");
                }


            }

//            System.out.println(result);

        }
    }
}
