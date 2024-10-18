package Day02;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

//        double pi = 3.141597;
//        System.out.printf("%1f", pi);

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력해주세요");
        int num1 = sc.nextInt();

        System.out.print(" + , -, *, / 중에 하나를 입력해주세요");
        String Operator = sc.next();

        System.out.print("두 번째 숫자를 입력해주세요");
        int num2 = sc.nextInt();

        switch(Operator){
            case "+" :
                System.out.printf("결과 값 : %d입니다", num1+num2);
                break;
            case "-" :
                System.out.printf("결과 값 : %d입니다", num1-num2);
                break;
            case "*" :
                System.out.printf("결과 값 : %d입니다", num1*num2);
                break;
            case "/" :
                System.out.printf("결과 값 : %.1f입니다", (double)num1/num2);
                break;
            default:
                System.out.println("잘못된 연산자 입니다.");
                break;
        }


//        if(!(Operator == "*" || Operator == "/" || Operator == "+" || Operator == "-")){
//            System.out.println("잘못된 연산자 입니다.");
//        }else {
//            System.out.printf("결과값은 " + "%1f", num1+(Operator)+num2);
//        }
//
//
    }
}
