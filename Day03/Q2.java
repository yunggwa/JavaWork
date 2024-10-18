package Day03;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean check = true;

        while (check){
            System.out.print("숫자를 입력하세요");
            int choice = sc.nextInt();
            if (choice > 3){
                System.out.println("잘못된 입력입니다");
            }else {
                switch (choice){
                    case 1:
                        System.out.print("원하는 숫자를 입력하세요");

                        int num = sc.nextInt();
                        if(num > 9 || num < 0){
                            System.out.println("잘못된 입력입니다");

                        }else {
                            for (int s = 1; s < 10; s++){
                                System.out.println(num + " * " + s + " = " + (num*s));
                            }
                        }

                        break;
                    case 2:
                        for (int i = 2; i < 10; i++){
                            for (int j = 1; j < 10; j++){
                                System.out.println(i + " * " + j + " = " + (i*j));
                            }
                        }

                        break;
                    case 3:
                        System.out.println("종료합니다");
                        check = false;
                        break;

                    default:

                }

            }


        }
    }
}
