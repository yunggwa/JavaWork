package Day09;

class A{
    int a; //멤버변수
    void  print(int a){ //매개변수 인자
        int b; //메소드변수 지역변수
    }

    //생성자
    A(){
        a = 10;
    } //디폴트처럼 보이지만 아니다
}

public class classTest1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);
    }
}
