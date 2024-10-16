package Day2;

public class WhileTest {
    public static void main(String[] args) {

        //1~10까지 더한 결과 값 출력

        int num = 0;
        int result = 0;

        while(num <= 10){

            result += num;
            num++;
            System.out.println(result);
        }
    }

}
