package Yung;

import java.util.Scanner;

public class Scanner연습 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();

        System.out.print("좋아하는 음식을 입력하세요 : ");
        String love = sc.next();

        System.out.print("그 다음 좋아하는 음식을 입력하세요 : ");
        String like = sc.next();

        System.out.print("좋아하는 숫자를 입력하세요 : ");
        int i = sc.nextInt();

        System.out.println(name + "이 좋아하는 음식은 : " + love + "이고, 두 번째로 좋아하는 음식은 " + like + "입니다 " + "좋아하는 숫자는 : " + i );

        System.out.println(name);
        System.out.println(like);
        System.out.println(love);
        System.out.println(i);

        System.out.println(like + love);

        int a = 10;
        int b = 15;

        int num = (a + b) * a;

        System.out.println(num);

    }
}
