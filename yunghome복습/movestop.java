package yunghome복습;

import java.util.Random;

class Robot{
    String name;
    int y;
    int x;
    int maxY = 1000;
    int maxX = 1000;
    Robot(String name){
        this.name = name;
    }
    void move(int deltaY, int deltaX){
        if (deltaY > 100){
            System.out.println("Y축 최대한계를 넘었습니다 ");
            x += deltaX;
            System.out.println("y로 0 만큼 이동 " + "x로 " + deltaX + "만큼 이동 = " + name + "의 현재위치는 Y는 : " + y + ", X는 : " + x + "입니다~" );


        } else if (deltaX > 100) {
            System.out.println("X축 최대한계를 넘었습니다 ");
            y += deltaY;
            System.out.println("y로 " + deltaY + "만큼 이동 " + "x로 0 만큼 이동 = " + name + "의 현재위치는 Y는 : " + y + ", X는 : " + x + "입니다~" );

        }else {
            y += deltaY;
            x += deltaX;
            System.out.println("y로 " + deltaY + "만큼 이동 " + "x로 " + deltaX + "만큼 이동 = " + name + "의 현재위치는 Y는 : " + y + ", X는 : " + x + "입니다~" );
        }
    }
}

public class movestop {
    public static void main(String[] args) {
        Robot robot = new Robot("로봇윤경");
        Random r = new Random();

        while (robot.maxY > robot.y || robot.maxX > robot.x){
            int a = r.nextInt(120)+1;
            int b = r.nextInt(120)+1;
            robot.move(a, b);
        }
        System.out.println("도착했습니다");

    }
}
