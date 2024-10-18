package Day03;

import java.util.Random;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("가위 바위 보 게임 시작!");
//        System.out.println("com : " + com);


        while(true){
            System.out.println("1. 게임시작 2. 종료 : ");
            int start = sc.nextInt();
            if(start < 0 || start > 2){
                System.out.println("잘못 입력하셨습니다 첫 화면으로 돌아갑니다");
            }else {
                if (start == 1){
                    System.out.println("1.가위 2.바위 3.보 를 선택해주세요 : ");
                    int user = sc.nextInt();
                    if (user < 0 || user > 3){
                        System.out.println("잘못입력하셨습니다");
                    }else {
                        while (true){
                            int com = r.nextInt(3)+1;
                            if (user < com){
                                System.out.println("user :  " + user + "\ncom : " + com + "\n게임결과 : user 승");
                                break;
                            } else if (user == com) {
                                System.out.println("user :  " + user + "\ncom : " + com + "\n게임결과 : 무승부");
                                break;
                            } else if (user > com) {
                                System.out.println("user :  " + user + "\ncom : " + com + "\n게임결과 : com 승");
                                break;

                            }
                    }
                }


                }
                else {
                    System.out.println("종료합니다");
                    break;
                }

            }
        }
    }
}
