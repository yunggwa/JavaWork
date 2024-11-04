package Day15;

import java.util.Random;

abstract class Ani{
    String color; //개별클래스안에 말구 색깔은 변하지 않아서 부모에게 주는게 효율적
    Ani(){
        Random r = new Random();
        String[] colors = {"빨간색","주확색","노란색","초록색","파란색","남색","보라색"};
        color = colors[r.nextInt(colors.length)];
    }
    abstract void print(); //추상화 메소드
}
class Dog extends Ani{
    @Override
    void print() {
        System.out.println("나는" + color + "강아지입니다");
    }
}
class Cat extends Ani{
    @Override
    void print() {
        System.out.println("나는" + color + "고양이입니다");
    }
}
class Mia extends Ani{
    @Override
    void print() {
        System.out.println("나는" + color + "미어캣입니다");
    }
}
class Panda extends Ani{
    @Override
    void print() {
        System.out.println("나는" + color + "팬더입니다");
    }
}
public class Q1 {
    public static void main(String[] args) {
        Random r = new Random();
        Ani[] woori = new Ani[10];
        for (int i = 0; i < woori.length; i++){
            int num = r.nextInt(4);
            if (num == 0){
                woori[i] = new Dog();
            } else if (num == 1) {
                woori[i] = new Cat();
            }else if (num == 2) {
                woori[i] = new Mia();
            }
            else {
                woori[i] = new Panda();
            }
        }
        for (int i = 0; i < woori.length; i++){
            woori[i].print();
        }
    }
}
