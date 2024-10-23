package Day07;

import java.util.Random;

public class Q3 {
    //숫자 랜덤
    static int number(){
        Random r = new Random();
        char a = 'A';
        int ran = r.nextInt(26)+a;
        return ran;
    }

    //더하기연산
    static int puls(int ran){
        return ran + ran;
    }

    static void add(){
        for(int i = 0; i < 10; i++){
        }
    }

    public static void main(String[] args) {

    }
}
