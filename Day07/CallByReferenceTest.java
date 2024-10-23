package Day07;

public class CallByReferenceTest {
    //참조자료형은 리턴하지않아도 객체 공유
    static  void abc(int[] a){
        a[0] = 20; //a의 0번째 인덱스 값 20
    }
    static int[] def(){
        int[] a = new int[2]; //int배열 a 길이 2개
        a[0] = 10; //a의 0번째 인덱스값 10
        return a; //값2개인 a배열값 리턴
    }

    public static void main(String[] args) {
        int[] a = new int[2];
        abc(a); //abc함수 호출 배열a매개변수
        System.out.println(a[0]); //20출력

        int[] b = def(); //배열b에 def함수대입
        System.out.println(b[0]); //10출력
    }
}
