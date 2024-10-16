package Yung;

public class 삼항연산자 {
    public static void main(String[] args) {

        int a = 10;
        int b = 30;

        String st1 = "a가 큽니다";
        String st2 = "b가 큽니다";
        int num = a > b ? a + b : b - a;

        String num3 = a > b ? "a가 큽니다" : "b가 큽니다"; //삼항연산자에서 결과출력물이 문자면 String으로 준다
        System.out.println(num3);

        String str0 = st1 != st2 ? "같지않아요" : "같아요";

        int str3 = st1 != st2 ? 10 : 20;
        System.out.println(str3);
//
//        System.out.println(num);
//        System.out.println(str0);
    }
}
