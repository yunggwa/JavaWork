package Day09;

class C{
    int x;
    int k;
    C(int a, int b){
        x= a;
        k= b;
    }
}

public class classTest2 {
    public static void main(String[] args) {
        C c = new C(5, 3);
        C c2 = new C(6, 7);
        System.out.println(c.x + "," + c.k);
        System.out.println(c2.x + "," + c2.k);
    }
}
