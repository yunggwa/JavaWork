package Yung;

import java.util.Random;

public class 문자숫자출력 {
    public static void main(String[] args) {
        Random r = new Random();
        String str = "";

        for (int i = 0; i < 10; i++){
            str  += (char)(r.nextInt(26)+(int)'A');
        }
        System.out.println(str);
    }
}
