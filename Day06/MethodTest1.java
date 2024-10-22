package Day06;

import java.util.Random;
import java.util.Scanner;

public class MethodTest1 {
    //static 바로 사용 가능
    //main 스페셜 -> 프로그램이 실행하면 무조건 main부터 시작
    public static void main(String[] args) {
        //안 주고 받고 형태
        //이름 main
        //리턴이 없고 매개변수는 String 1차원 배열을 받습니다.

        System.out.println("헬로우"); // 안 주고 받고 형태
        Scanner sc = new Scanner(System.in); //class

        int num = sc.nextInt(); // 주고 안 받고 형태  앞에 변수가 있기때문에 리턴

        Random r = new Random(); //class

       int ran = r.nextInt(10); // 주고 받고
    }
}
