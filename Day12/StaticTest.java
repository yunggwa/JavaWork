package Day12;
class A{
    static  int a; //클래스변수

    int b; //멤버변수
}
public class StaticTest {
    public static void main(String[] args) {
        A.a = 20;
        //위치만 알려주면 된다
        A a = new A(); //
        A a1 = new A(); // 얘가 접근하나 쟤가 접근하나 int a는 하나다 똑같이 20 스태틱특징
    }
}
