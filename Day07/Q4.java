package Day07;

import java.util.Scanner;

public class Q4 {
    //구구단
    static void gugudan1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 구구단을 입력하세요");
        int num = sc.nextInt();
        re(num);
    }
    static void re(int num){
        for(int i = 2; i < 10; i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }
    static void gugudan2(){
        for (int i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++){
                System.out.println(i+" * "+j+" = "+(i*j));
            }
        }
    }

    //별
    static void star1(){

    }

}
