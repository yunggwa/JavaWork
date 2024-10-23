package Day07;

public class CallByValueTest {
    static int abc(int a){
//        int b = 30;
        a = 20; //void를 바꿔서 리턴해서 값을 대입하지않으면 나중에 호출했을때도 값 변경 x
        return a;
    }

    public static void main(String[] args) {
        int a = 10;
        abc(a);
        System.out.println(a);//10출력
        System.out.println(abc(a));//20출력
        //
    }
}
