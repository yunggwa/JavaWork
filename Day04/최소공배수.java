package Day04;

import java.util.Scanner;

public class 최소공배수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int big = 1;

        while (true){
            System.out.print("첫 번째 숫자를 입력해주세요 : ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력해주세요 : ");
            int num2 = sc.nextInt();
            for(int i = 1; i <= num1 && i <= num2; i++){
                if (num1 % i == 0 && num2 % i == 0){
                    big = i;
                }
            }
            System.out.println("최대 공약수는 : " + big);
            System.out.println("최소 공배수는 : " + (num1*num2)/big);
        }
    }
}
