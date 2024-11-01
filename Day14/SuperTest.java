package Day14;
class A{
    int a;
    A(int a){

    }
    A(String str){

    }
}
class B extends A{
    B(){
        super(5);
    }
    B(String str){
        super("야호");
    }
    void abc(){
        this.a = 20;
        super.a = 30;
    }
}
public class SuperTest {
    public static void main(String[] args) {
        B b = new B("궈뉸경");
        B b1 = new B();
    }
}
