package yunghome복습;

import java.util.Random;

class Gc{
    String name;
    int x;
    int y;

    Gc(String name){
        this.name = name;
        this.x = 0;
        this.y = 0;
    }

    void moveup(int position){
        Random r = new Random();
        y += position;
        print();
    }
    void moveDown(int position){
        y -= position;
        print();
    }
    void moveLeft(int position){
        x -= position;
        print();
    }
    void moveRight(int position){
        x += position;
        print();
    }
    void print(){
        System.out.println(name + "의 현재 위치는 y : " + y + " x : " + x);
    }
}
public class gamecharacter {
    public static void main(String[] args) {
        Gc game = new Gc("용사 권윤경");
        game.moveup(10);
        game.moveRight(20);
        game.moveDown(100);

    }
}
