package Day06;

import java.util.Scanner;

public class Q4 {

    //주고 안 받고
    static int number(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 : ");

        return sc.nextInt();
    }

    //주고 받고
    static String a (int num){
        String result = ""; //문자와 i(약수) 합쳐서 출력
        for(int i = 1; i <= num; i++) {
            if (num % i == 0){
                result = result + i + " "; //문자열이 된다
            }
        }
        return result;
    }
    //출력 안 주고 받고
    static void print(int num, String result){
        System.out.print(num + "의 약수는 : ");
        System.out.print(result);
        System.out.print(" 입니다");
    }


    public static void main(String[] args) {
        int num = number(); //입력값을 한번만 불러오기위해
        //함수자체를 호출하면 입력값을 여러번받게되는데
        //변수에 지정하면 리턴값만 불러오기때문에 함수호출은 한번만 된다
        //
//        String result = a(number());
        //print(number(), a(number()));
        //-> 이렇게 됐을때 넘버함수를 불러올 땐 호출이 이어져서 여러번 불러오기떄문에 두번이 호출된다
        print(num, a(num));
    }

}
