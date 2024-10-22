package Day06;

public class MethodTest2 {
    static int a; //메모리 바로 올라가서 전역변수가 된다
    //주고 받고 형태
    static String printHello(String name){
        a = 10;
        return "안녕하세요" + name + "님";
    }

    //안 주고 받고
    static int sum(){
        int a = 10;
        int b = 20;
        return a +b;
    }

    // 주고  안 받고
    static void outputName(String name){
        System.out.println("안녕하세요" + name + "님");
    }

    //안 주고 안 받고
    static void printBye(){
        System.out.println("잘가요");
    }

    public static void main(String[] args) {
        String result = printHello("권윤경");
        System.out.println(result); //안녕하세요 권윤경님
        System.out.println(a); // 10
        System.out.println(sum());
        outputName("yungyung"); //안녕하세요 융융님
        printBye(); //잘가요
    }
}
