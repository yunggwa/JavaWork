package yungafter;

import java.util.Scanner;

public class array03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원하는 숫자를 입력해주세요");
        int num = sc.nextInt();
        String str = " ";
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;
            System.out.print(array[i] + str);
        }
    }
}
