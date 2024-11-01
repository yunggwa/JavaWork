package Day14;

class Dino{
    int tall;
    int weight;
    String name;
    void print(){
        System.out.print("나는 공룡이야~");
    }
}

class Tira extends Dino{

    Tira(String name){
        this.name = name;
        tall = 2;
        weight = 1;
    }
    void print(){
        System.out.println("나는 키 : " + tall + "m 몸무게 : " + weight + "톤인" + name + "이다");
    }
}
class Tiri extends Dino{
    Tiri(String name){
        this.name = name;
        tall = 3;
        weight = 2;
    }
    void print(){
        System.out.println("나는 키 : " + tall + "m 몸무게 : " + weight + "톤인" + name + "이다");
    }
}
class Bu extends Dino{
    Bu(String name){
        this.name = name;
        tall = 5;
        weight = 3;
    }
    void print(){
        System.out.println("나는 키 : " + tall + "m 몸무게 : " + weight + "톤인" + name + "이다");
    }
}


public class Q1 {
    static void sound(Dino d){
        d.print();
    }
    public static void main(String[] args) {
//        Dino t = new Tira("티라노사우루스");
//        Dino r = new Tiri("티리케라톱수");
//        Dino b = new Bu("부경사우르스");
//        t.print();
//        r.print();
//        b.print();

        Tira tr = new Tira("티라노사우르스");
        Tiri ti = new Tiri("티리케라톱수");
        Bu bu = new Bu("부경사우르스");
        sound(tr);
        sound(ti);
        sound(bu);
    }
}
