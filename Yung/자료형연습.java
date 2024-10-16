package Yung;

import java.util.Scanner;

public class 자료형연습 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = 3.14F;

        System.out.println(a);
        System.out.printf("%s + %s = %s", "융","공",("융 + 공"));

        System.out.printf("나는 %s이다 \n", "권윤경"); //쿼리셀렉터처럼 처음 문자만 출력

        int num1 = 10;
        int num2 = 20;

        if(num1 != num2){
            System.out.println("같지않아");
        }else {
            System.out.println("같아");
        }

//        String str = System.out.println("담을수가없니?");
//        System.out.println(str);

    }
}
