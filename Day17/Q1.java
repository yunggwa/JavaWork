package Day17;

import java.util.Random;
import java.util.Scanner;

class Burf{
    int power;
    int dburf;
    int heal;
}
class Battle{
    Burf buf;
    Knight knight;
    Villain villain;
    Random r = new Random();
    int random = r.nextInt(3)+1;
    Battle(){
        knight = new Knight();
        villain = new Villain();
        buf = new Burf();

        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        while (knight.hp > 0 && villain.hp > 0){
            System.out.println();
            System.out.println(cnt + " 번째 결투가 시작 됐습니다....");
            System.out.println("=============================");
            if (cnt % 2 == 0){
                if (random == 1){
                    buf.power = r.nextInt(101)+50;
                    System.out.println("공격력 증가 ! 기사의 공격력이 " + buf.power + " 만큼 증가했다!" );
                    knight.attack += buf.power;
                } else if (random == 2) {
                    buf.heal = r.nextInt(301);
                    System.out.println("힐 ~~ 기사의 체력이 " + buf.heal + " 만큼 증가했다!");
                    knight.hp += buf.heal;
//                    if (knight.hp > 2000){
//                        knight.hp -= buf.heal;
//                    }

                } else {
                    buf.dburf = r.nextInt(201)+100;
                    System.out.println("디버프@@@ 기사의 체력이 " + buf.dburf + " 만큼 감소했다...");
                    knight.hp -= buf.dburf;
                }
                System.out.println("기사의 공격 - !!!! ");
                villain.hp -= knight.attack;
                System.out.println("악당의 체력이 " + villain.hp + " 만큼 남았다...");
            }else {
                if (random == 1){
                    buf.power = r.nextInt(151)+50;
                    System.out.println("공격력 증가 ! 악당의 공격력이 " + buf.power + " 만큼 증가했다..");
                    villain.attack += buf.power;
                } else if (random == 2) {
                    buf.heal = r.nextInt(301)+0;
                    System.out.println("힐 !!! 악당의 체력이 " + buf.heal + " 만큼 증가했다..");
                    villain.hp += buf.heal;
//                    if (villain.hp > 1200){
//                        villain.hp -= buf.heal;
//                    }
                } else {
                    buf.dburf = r.nextInt(301)+100;
                    System.out.println("디버프 -!! 악당의 체력이 " + buf.dburf + " 만큼 감소했다!!!!");
                    villain.hp -= buf.dburf;
                }
                System.out.println("악당의 공격 - $$$$$$");
                knight.hp -= villain.attack;
                System.out.println("기사의 체력이 " + knight.hp + "만큼 남았다.. 힘내!");
            }
            cnt++;
            if (villain.hp < 0){
                System.out.println("기사의 승리 입니다~~~!!!");
            } else if (knight.hp < 0) {
                System.out.println("악당의 승리 입니다 .....");
            }else {
                System.out.println("좋은 승부였습니다....");
            }
        }
    }
}

class Unit{
    String name;
    int attack;
    int hp;
    int Maxhp;
    Unit(String name, int attack, int hp){
        this.name = name;
        this.attack = attack;
        this.hp = hp;
        hp = Maxhp;
    }
}

class Knight extends Unit {
    Knight(){
        super("기사", 80, 2000);
    }
}
class Villain extends Unit {
    Villain(){
        super("악당",80,1200);
    }
}

public class Q1 {
    public static void main(String[] args) {
        new Battle();
    }
}
