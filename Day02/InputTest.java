package Day02;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문장을 입력해주세요");

        String str = sc.nextLine();
//        String str1 = sc.next();

        System.out.println(str);
//        System.out.println(str1);
    }
}
