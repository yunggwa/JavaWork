package yungafter;

import java.util.Scanner;

public class mes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("숫자를 입력해주세요 : ");
            int num = sc.nextInt();
            for (int i = 1; i <= num; i++){
                if (num % i == 0){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
