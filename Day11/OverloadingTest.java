package Day11;

class A{

    A(){
        System.out.println("매개변수 없음");
    }
    A(int a){

    }
    A(double a){

    }
    int add(int a, int b){
        return a + b;
    }
    double add(double a, double b){
        return  a + b;
    }
    int add(int a){
        return  a + 5;
    }
}
public class OverloadingTest {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.add(10));
        System.out.println(a.add(5, 7));
        System.out.println(a.add(1.7, 2.8));

        A a1 = new A(10.7);

        System.out.println();
    }
}
