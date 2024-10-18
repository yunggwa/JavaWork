package Day02;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 하나 입력해주세요.");
        int num = sc.nextInt();
//        int i;
//        System.out.print(num + "의 약수는 1," );
//
//        for (i = 2; i < num; i++){
//            if(num % i == 0){
//
//                System.out.print(i);
//                System.out.print(",");
//            }
//        }
//        System.out.print(num + "입니다");
        //8의 약수는
        //1,2,4,
        //8입니다

        System.out.print(num + "의 약수는");
        for(int i = 1; i < num; i++){
            if (num % i == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.print(num + "입니다");
    }
}


