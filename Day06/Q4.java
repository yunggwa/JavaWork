package Day06;

import java.util.Scanner;

public class Q4 {
    static int number(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 : ");

        return sc.nextInt();
    }

    static int a (int num){
        for(int i = 1; i <= num; i++) {
            if (num % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.print(" 입니다");
        return num;
    }

    public static void main(String[] args) {
        a(number());

    }

}
