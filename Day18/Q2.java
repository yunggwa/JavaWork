package Day18;

import java.util.Random;

//부스터 - 인터페이스 아무것도 X
interface Booster{}
//탈것 - 이동거리 게이지 이동함수
abstract class Vehicle{
    Random r = new Random();
    int distance;
    int gauge;
    abstract void move(int stop,int turn);
}
class Car extends Vehicle implements Booster{
    @Override
    void move(int stop, int turn) {
        int move = r.nextInt(21);
        if(stop != 1){
            distance += move;
        }
        gaugePrint(turn);
        ditancePrint();
    }

    void gaugePrint(int turn){
        gauge = turn % 4;
        System.out.println("자동차 게이지 : "+gauge+",");
    }
    void ditancePrint(){
        System.out.println("자동차의 주행거리 : "+distance);
    }
}
class Bicyle extends Vehicle implements Booster{
    @Override
    void move(int stop, int turn) {
        int move = r.nextInt(11);
        if(stop != 2){
            distance += move;
        }
        gaugePrint(turn);
        ditancePrint();
    }

    void gaugePrint(int turn){
        gauge = turn % 2;
        System.out.println("자전거 게이지 : "+gauge+",");
    }
    void ditancePrint(){
        System.out.println("자전거의 주행거리 : "+distance);
    }
}
class Motocycle extends Vehicle implements Booster{
    @Override
    void move(int stop, int turn) {
        int move = r.nextInt(16);
        if(stop != 3){
            distance += move;
        }
        gaugePrint(turn);
        ditancePrint();
    }

    void gaugePrint(int turn){
        gauge = turn % 3;
        System.out.println("오토바이 게이지 : "+gauge+",");
    }
    void ditancePrint(){
        System.out.println("오토바이의 주행거리 : "+distance);
    }
}

public class Q2 {
    static void boosterRun(int stop, Booster b){
        if(b instanceof Car){
            if(stop != 1&& ((Car) b).gauge == 3){
                ((Car) b).distance += 2;
            }
        }
        if(b instanceof Bicyle){
            if(stop != 2 && ((Bicyle) b).gauge == 1){
                ((Bicyle) b).distance += 5;
            }
        }
        if(b instanceof Motocycle){
            if(stop != 3 && ((Motocycle) b).gauge == 2){
                ((Motocycle) b).distance += 3;
            }
        }

    }
    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();
        Car c = new Car();
        Bicyle b= new Bicyle();
        Motocycle m = new Motocycle();

//        Vehicle[] v = new Vehicle[3];
//        v[0] = new Car();
//        v[1] = new Bicyle();
//        v[2] = new Motocycle();
        int turn = 0;
        int stop;
        while(true){
            stop = r.nextInt(3)+1;
            //부스터
            boosterRun(stop,c);
            boosterRun(stop,b);
            boosterRun(stop,m);
            //실제 이동
            c.move(stop,turn);
            b.move(stop,turn);
            m.move(stop,turn);
            Thread.sleep(500);

            if(c.distance >= 500 || b.distance >= 500 || m.distance >= 500){
                break;
            }
            turn++;
        }

        if(c.distance == b.distance || c.distance == m.distance || b.distance == m.distance){
            System.out.println("비겼습니다.");
        }
        else if(c.distance > b.distance && c.distance > m.distance){
            System.out.println("자동차 우승입니다.");
        }
        else if(b.distance > c.distance && b.distance > m.distance){
            System.out.println("자전거 우승입니다.");
        }
        else{
            System.out.println("오토바이 우승입니다.");
        }

    }
}
