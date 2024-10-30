package yunghome;

import java.util.Random;

class Human{
    String name;
    int line;
    int position;

    Human(String name, int line){
        this.name = name;
        this.line = line;
        this. position = 0;
    }

    boolean humanrace(int not){
        Random r = new Random();
        int move = r.nextInt(10)+1;
        if (not == this.line){
            System.out.println(name + "돌발상황 발생!");
            return false;
        }else {
            position += move;
            System.out.println(name + " 앞으로 " + move + "미터 전진! 현재 거리 : " + position + "미터");
            return position >= 100;
        }
    }
}


public class 돌발상황 {
    public static void main(String[] args) {
        Random r = new Random();

        Human hu1 = new Human("한국선수", 1);
        Human hu2 = new Human("중국선수", 2);
        Human hu3 = new Human("미국선수", 3);
        Human hu4 = new Human("러시아선수", 4);
        int cnt = 1;
        while (hu1.position < 100 || hu2.position < 100 || hu3.position < 100 || hu4.position < 100){
            System.out.println("현재 라운드 : " + cnt);
            int not = r.nextInt(4)+1;
            hu1.humanrace(not);
            hu2.humanrace(not);
            hu3.humanrace(not);
            hu4.humanrace(not);
            System.out.println("===================");
            cnt++;
        }
        if (hu1.position > hu2.position && hu1.position > hu3.position && hu1.position > hu4.position){
            System.out.println("이동거리 : " + hu1.position + "미터! " + hu1.name + "가 우승하였습니당!!");
        }
        if (hu2.position > hu1.position && hu2.position > hu3.position && hu2.position > hu4.position){
            System.out.println("이동거리 : " + hu2.position + "미터! " + hu2.name + "가 우승하였습니당!!");

        }
        if (hu3.position > hu1.position && hu3.position > hu2.position && hu3.position > hu4.position){
            System.out.println("이동거리 : " + hu3.position + "미터! " + hu3.name + "가 우승하였습니당!!");
        }
        if (hu4.position > hu1.position && hu4.position > hu2.position && hu4.position > hu3.position){
            System.out.println("이동거리 : " + hu4.position + "미터! " + hu4.name + "가 우승하였습니당!!");
        }

    }
}
