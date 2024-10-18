package Day03;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력해주세요");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++){
            if (i % 2 == 0){

            }
            if(i % 2 != 0){
                System.out.print(i);
            }

        }
    }
}
