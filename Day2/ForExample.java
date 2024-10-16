package Day2;

public class ForExample {
    public static void main(String[] args) {
        int i;
        int sum;
        // 초기화문에 보시면 하나가 아니라 2개를 초기화
        //조건문은 무조건 한개만! 초기화문이나 증가감소문은 여러개 가능
        for(i = 1, sum = 0; i <= 10; i++){
            sum += i;
        }

        //for문 초기화문에서 선언된 변수는 for문 안에서만 사용이 가능
        for(int j = 0; j <= 10; j++){

        }
        System.out.println(sum);
        System.out.println(i);
    }

}
