package Day09;

class kor{
    int a;
    kor(int a){
        this.a = a;
    }
}

public class ThisTest1 {
    public static void main(String[] args) {
        kor k = new kor(5);
        System.out.println(k.a);
    }
}
