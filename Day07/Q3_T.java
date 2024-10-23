package Day07;

import java.util.Random;

public class Q3_T {
    /*
    1. 난수값 만들기 주고 안 받고
    2. 난수값 연산 + 65 주고 받고
    3. 더하는 결과값 문자로 바꾸기 주고 받고
    4. 10번 실행하는거 안 주고 안 받고
    5. 10개 문자를 더하기 연산 주고 받고
    6. 10개 문자를 출력 안 주고 받고
     */

    //주고 안받고 랜덤번호생성
    static int randomMake(){
        Random r = new Random();
        return r.nextInt(26);
    }

    //주고 받고 난수값 + 알파벳A값(65)받기
    static int add(int ran){
        return 65 + ran;
    }

    //주고 받고 결과값을 문자값으로 변환
    static char makeChar(int result){
        return (char)result;
    }
    //안주고 안받고  모든거 종합
    static void start(){
        String str = "";
        for (int i = 0; i < 10; i++){
//            int ran = randomMake();
//            int val = add(ran);
//            char ch = makeChar(val);
            str += makeString(makeChar(add(randomMake())));
        }
        printString(str);
    }

    //주고 받고 랜덤문자값리턴
    static String makeString(char ch){
       return ch + " ";
    }

    //안주고 받고 출력
    static void printString(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        start();
    }
}
