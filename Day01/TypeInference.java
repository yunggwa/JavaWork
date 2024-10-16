package Day01;

public class TypeInference {
    public static void main(String[] args) {
        var i = 10;
        var j = 10.0;
        var str = "hello";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        //str = 3; 에러나는 이유는 선언시 정의된 자료형만 가능해진다
    }
}
