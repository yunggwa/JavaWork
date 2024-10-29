package Day11;

import java.util.Scanner;

public class Q1_T {

    /*
    1. 입력
    2. 연산 -> main
    2-1 카운팅
    2-2 입력한 문자 + 카운팅 -> 문자선택
    3. 출력
     */

    static String input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        return sc.next();
    }
    //연산 , 카운팅
    static String makeResult(String str){
        char ch = str.charAt(0);
        int cnt = 0;
        String result = "";
        for (int i = 0; i < str.length(); i++){
            if (ch == str.charAt(i)){
                cnt++;
            }else {
                result += makeChar(ch, cnt);
                ch = str.charAt(i);
                cnt = 1;
            }
        }
        result += makeChar(ch, cnt);
        return result;
    }
    static char makeChar(char ch, int cnt){
        char result;
        char[][]key = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'},
                {'J', 'K', 'L'},
                {'M', 'N', 'O'},
                {'P', 'Q', 'R'},
                {'S', 'T', 'U'},
                {'V', 'W', 'X'},
                {'Y'},
                {'*'},
                {'Z'},
                {'#'}
        };

        if (ch == '9'){
            result = key[8][0];
        } else if (ch == '*') {
            result = key[9][0];
        } else if (ch == '0') {
            result = key[10][0];
        } else if (ch == '#') {
            result = key[11][0];
        }else {
            cnt = (cnt - 1) % 3;
            result = key[(ch - '0')][cnt];
        }
        return result;
    }

    static void output(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
//        String string = input();
        output(makeResult(input()));
    }
}
