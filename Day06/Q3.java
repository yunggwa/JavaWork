package Day06;

import java.util.Scanner;

public class Q3 {
    static int score(){
        Scanner sc = new Scanner(System.in);
        System.out.print("국어점수 : ");
        int ko = sc.nextInt();
        System.out.print("영어점수 : ");
        int en = sc.nextInt();
        System.out.print("수학점수 : ");
        int ma = sc.nextInt();

        return  ko + en + ma;
    }

    static int avg(){
        int a = score();
        return a/3;
    }

    static int gr(int avg){

        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = score();
        System.out.println(a);
        System.out.println(avg());

        int avg = sc.nextInt(gr(avg()));
        if (avg > 100 || avg < 0){
            System.out.println("잘못 입력 했습니다");
        }else {
            if (avg >= 95){
                System.out.println("A+ 95점 이상");
            }
            else if (avg >= 90){
                System.out.println("A 90점 이상");
            }
            else if (avg >= 85){
                System.out.println("B+ 85점 이상");
            }
            else if (avg >= 70){
                System.out.println("C 70점 이상");
            }
            else if (avg >= 60){
                System.out.println("D 70점 이상");
            }
            else{
                System.out.println("F 60점 미만");
            }
        }
        System.out.println(gr(avg()));
    }
}
