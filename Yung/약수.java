package Yung;

import java.util.Scanner;

public class 약수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 하나 입력하세요");
        int num = sc.nextInt();
        int i;

        System.out.print(num + "의 약수는 ");
        for(i = 1; i < num; i++){
            if(num % i == 0){
                System.out.print(i + ",");
            }
        }
        System.out.print(num + "입니다");
    }
}
