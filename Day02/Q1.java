package Day02;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. 변수 선언과 동시에 초기화 id 와 password
        //2. 입력
        String id = "Korea";
        String password = "1234";

        //3. 입력 받은 값과 선언한 변수 값 비교해서 출력
        System.out.print("id 입력 : ");
        String idInput = sc.next();

        System.out.print("pw 입력 : ");
        String pwInput = sc.next();

        //3-1 모두 맞는 경우
        if(idInput.equals(id)&&pwInput.equals(password)) {
            System.out.println("환영합니다. Korea님");
        }
        //3-2 패스워드만 맞는 경우
        else if(!(id.equals(idInput))){ //실제론 false지만 !를 만나서 true
            System.out.println("id가 올바르지 않습니다. ");
        }

        else if(!(password.equals(idInput))){
            System.out.println("pw가 올바르지 않습니다. ");
        }

        else {
            System.out.println("둘 다 올바르지 않습니다. ");
        }

    }
}



