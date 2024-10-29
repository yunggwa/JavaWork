package Day09;

class X{
    int a;
    String str;
    B b;
}
class B{
    int k;
}
class D{
    B b = new B();
}

public class HasTest1 {
    public static void main(String[] args) {
        X x = new X();
        x.b.k = 30;
        x.b = new B();
        System.out.println(x.b.k); //30

        D d = new D();
        d.b.k = 20;
        System.out.println(d.b.k); //20
        d.b = new B();
        System.out.println(d.b.k); //0
    }
}
