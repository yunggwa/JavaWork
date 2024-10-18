package Day04;

import java.util.Random;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int com1 = r.nextInt(10)+1;
        int com2 = r.nextInt(10)+1;
        int com3 = r.nextInt(10)+1;


        while (true){
            if(com1 == com2 || com1 == com3 || com2 == com3){
                com1 = r.nextInt(10)+1;
                com2 = r.nextInt(10)+1;
                com3 = r.nextInt(10)+1;
            }else {
                System.out.print("첫 번째 숫자를 입력해주세요");
                int user1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력해주세요");
                int user2 = sc.nextInt();
                System.out.print("세 번째 숫자를 입력해주세요");
                int user3 = sc.nextInt();
                if ((user1 == user2 || user1 == user3 || user2 == user3) && (user1 < 0 || user1 > 10 || user2 < 0 || user2 > 10 || user3 < 0 || user3 > 10)){
                    System.out.println("다시 입력하세요");
                }else {
                    if ((com1 == user1 ||com1 == user2 ||com1 == user3) && (com2 == user1 ||com2 == user2 ||com2 == user3)&&(com3 == user1 ||com3 == user2 ||com3 == user3)){

                        System.out.println("홈런입니다");
                    } else if ((com1 == user1 ||com1 == user2 ||com1 == user3) || (com2 == user1 ||com2 == user2 ||com2 == user3) || (com3 == user1 ||com3 == user2 ||com3 == user3)) {
                            System.out.println("1Strike입니다");
//                        if(com2 == user2 || com2 == user3 || com3 == user2 || com3 == user3){
//                        }
                    } else if (!(com1 == user1 ||com1 == user2 ||com1 == user3) && !(com2 == user1 ||com2 == user2 ||com2 == user3)&&!(com3 == user1 ||com3 == user2 ||com3 == user3)) {
                        System.out.println("OUT입니다");
                    }else {
                        System.out.println("2ball입니다.");
                    }


                    System.out.println(com1 + "+" + com2 + "+" + com3);
                }
            }

        }
    }
}