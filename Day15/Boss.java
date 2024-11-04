package Day15;

import java.util.Random;

abstract class Unit{
    Random r = new Random();
    String name;
    int price;
    int energy;
    int attack;
    int defence;
    String taket;
    double speed;
    String type;
    abstract  void  print();

}
class Jugg extends Yung.Unit {
    Jugg(){
        name = "저글링";
        price = 50;
        energy = 35;
        attack = 5;
        defence = 0;
        taket = "지상";
        speed = 2.612;
        type = "지상, 소형, 생체";
    }
    @Override
    void print() {
        System.out.println("저글링의 생산비용은 : " + super.price + " 에너지 : "
                + super.energy + " 공격력 : " + super.attack + " 방어력 : " + super.defence +
                " 공격대상 : " + super.taket + " 이동속도 : " + super.speed + " 유닛 특성 : "
                + super.type);
    }
}
class Hydra extends Yung.Unit {
    Hydra(){
        name = "저글링";
        price = 100;
        energy = 80;
        attack = 10;
        defence = 0;
        taket = "지상, 공중";
        speed = 1.741;
        type = "지상, 중형, 생체";
    }
    @Override
    void print() {
        System.out.println("히드라의 생산비용은 : " + super.price + " 에너지 : "
        + super.energy + " 공격력 : " + super.attack + " 방어력 : " + super.defence +
                " 공격대상 : " + super.taket + " 이동속도 : " + super.speed + " 유닛 특성 : "
        + super.type);
    }
}
class Marin extends Yung.Unit {
    Marin(){
        name = "마린";
        price = 50;
        energy = 50;
        attack = 6;
        defence = 0;
        taket = "지상, 공중";
        speed = 1.875;
        type = "지상, 소형, 생체";
    }
    @Override
    void print() {
        System.out.println("마린의 생산비용은 : " + super.price + " 에너지 : "
                + super.energy + " 공격력 : " + super.attack + " 방어력 : " + super.defence +
                " 공격대상 : " + super.taket + " 이동속도 : " + super.speed + " 유닛 특성 : "
                + super.type);
    }
}
public class Boss {
    public static void main(String[] args) {
        Yung.Unit jugg = new Jugg();
        Yung.Unit marin = new Marin();
        Yung.Unit hyra = new Yung.Hydra();
        jugg.print();
        marin.print();
        hyra.print();

        System.out.println("=============자습시-작 - !!!! =====");
    }
}
