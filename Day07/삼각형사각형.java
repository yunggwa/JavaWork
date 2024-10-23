package Day07;

import java.util.Scanner;

public class 삼각형사각형 {
    //입력
    static int input1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("가로 입력 : ");
        int width = sc.nextInt();

        return width;
    }
    static  int input2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("세로 입력 : ");
        int height = sc.nextInt();

        return height;
    }
    //사격형넓이
    static int sq(int width, int height){
        return width * height;
    }

    //삼각형넓이
    static void tr(int width, int height){
        System.out.println("삼각형의 넓이는 : " + width * height);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("1.사각형 넓이 2.삼각형 넓이 3.종료 : ");
            int ch = sc.nextInt();
            if (ch > 3 || ch < 0){
                System.out.println("잘못된 입력입니다");
            }else {
                if (ch == 1){
                    System.out.println("사각형의 넓이는 : " + sq(input1(), input2()));
                } else if (ch == 2) {
                    tr(input1(), input2());
                }else {
                    System.out.println("종료합니다");
                    break;
                }
            }


        }

//        System.out.println("가로 입력 : ");
//        int width = sc.nextInt();
//        System.out.println("세로 입력 : ");
//        int height = sc.nextInt();

    }
}
