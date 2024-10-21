package Day5;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력 : ");
        int num = sc.nextInt();
        int[][] arr = new int[num][num];

        int r = 0; //행
        int c = -1; //열

        int k = num; //반복횟수
        int sw = 1; //증가 감소를 위한 스위치
        int n = 1; // 1부터 증가해서 배열에 채워지는 값

        while(true){
            for (int i = 0; i < k; i++){
                c = c + sw; // 0 1 2 3 4 //3 2 10 // 1 2 3 // 2 1 // 2
                arr[r][c] = n++; // 숫자 1 2 3 4 5 들어감

            }
            k--;
            if (k == 0){
                break;
            }
            for (int i = 0; i < k; i++){
                r = r + sw; // 1 2 3 4 // 3 2 1 // 2 3 // 2
                arr[r][c] = n++;
            }
            sw *= -1;

        }
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; i > arr[i].length; j++){
                System.out.println(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
