package Day11;


/*
시민 안에 마피아가 있고
경찰 객체가 따로 있다
 */


//import java.util.Random;
//import java.util.Scanner;
//
//class simin{
//    Random r = new Random();
//    int mafia;
//
//
//    void simin(Random r){
//        System.out.println("억울합니다 저는 마피아가 아닙니다");
//    }
//    void  mafia(Random r){
//        System.out.println("네 제가 마피아입니다");
//    }
//}
//
//class police{
//    void police(){
//        Scanner sc = new Scanner(System.in);
//    }
//}

import java.util.Random;
import java.util.Scanner;

//class Human{
//    String who;
//    int name;
//    Human(int name, String who){
//        this.name = name;
//        this.who = who;
//    }
//    int getName(){
//        return name;
//    }
//    boolean ismafia(){
//        return who.equals(who);
//    }
//}
class Human{
    int num;
    boolean ismafia;

    Human(int num, boolean ismafia){
        this.num = num;
        this.ismafia = ismafia;
    }

    int getNum(){
        return  num;
    }
    boolean isIsmafia(){
        return ismafia;
    }

    void print(boolean police){
        if (police && ismafia){
            System.out.println(num + " : 네 제가 마피아에용");
        } else if (ismafia) {
            System.out.println(num + ".....");

        } else {
            System.out.println(num + " : 억울해용 저는 아니에용");
        }
    }
}

class game{
    Human[] humans;
    game(int humanscnt){
        humans = new Human[humanscnt];
        int who = new Random().nextInt(humanscnt);

        for (int i = 0; i < humanscnt; i++){
            humans[i] = new Human(i, i == who);
        }
    }
    void start(){
        Scanner sc = new Scanner(System.in);
        System.out.print("경찰이 선택한 번호 ( 1 ~ "  + (humans.length) + " ) :");
        int police = sc.nextInt();

        for (Human humans : humans){
            humans.print(humans.getNum() == police);
        }

//        sc.close();
    }
}

public class Q3 {
    public static void main(String[] args) {
        game game = new game(5);
        game.start();


    }
}
