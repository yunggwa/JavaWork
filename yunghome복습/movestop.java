package yunghome복습;

class Robot{
    String name;
    int y;
    int x;
    int maxY;
    int maxX;
    Robot(String name){
        this.name = name;
        this.y = y;
        this.x = x;
        this.maxY = 100;
        this.maxX = 100;
    }
    void move(int deltaY, int deltaX){
        if (deltaY > maxY){
            y = 0;
            x += deltaX;
            System.out.println("Y축 최대한계를 넘었습니다");
        } else if (deltaX > maxX) {
            x = 0;
            y += deltaY;
            System.out.println("X축 최대한계를 넘었습니다");
        }else {
            print();
        }
    }
    void print(){
        System.out.println(name + "의 현재위치는 Y는 : " + y + ", X는 : " + x + "입니다~" );
    }
}

public class movestop {
    public static void main(String[] args) {
        Robot robot = new Robot("로봇윤경");
        robot.move(160, 50);
        robot.print();
    }
}
