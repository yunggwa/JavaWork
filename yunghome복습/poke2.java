package yunghome복습;

import java.util.Random;
import java.util.Scanner;

class Pokemon{
    String name;
    String color;
    String size;

    Pokemon(){
        Random r = new Random();
        String[] names = {"피카츄", "파이리", "꼬부기", "이상해씨"};
        String[] colors = {"노란색", "빨간색", "파란색", "초록색"};
        String[] sizes ={"대", "중", "소", "미니"};

        this.name = names[r.nextInt(names.length)];
        this.color = colors[r.nextInt(colors.length)];
        this.size = sizes[r.nextInt(sizes.length)];
        talk();
    }
    void talk(){
        System.out.println("포켓몬은 : " + this.name + " 색깔은 : " + this.color + " 크기는 : " + size + " 입니다");
    }
}
class ball{
    Pokemon pm;
}
class Jiwoo{
    ball balls;
}
class Oh{
    ball[] b1 = new  ball[3];

    Oh(){
        for (int i = 0; i < b1.length; i++){
            b1[i] = new ball();
        }
    }
}
public class poke2 {
    public static void main(String[] args) {
        Jiwoo j = new Jiwoo();
        Oh o = new Oh();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < o.b1.length; i++){
            o.b1[i].pm = new Pokemon();
        }
        while (true){
            System.out.println("1 2 3 중에 고르세요");
            int num = sc.nextInt();
            if (num == 1 || num == 2 || num == 3){
                j.balls = o.b1[num-1];
                o.b1[num-1] = null;
                break;
            }else {
                System.out.println("잘못된 입력");
            }
        }
        j.balls.pm.talk();
    }
}
