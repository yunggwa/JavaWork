package Day13;

import java.util.Scanner;

class Computer{
    String menu;
    String cpu;
    int price;
    Computer(String menu, String cpu, int price){
        this.menu = menu;
        this.cpu = cpu;
        this.price = price;
    }

    void use(){
        System.out.println("제조사가" + menu + "인" + cpu + "컴퓨터를 사용한다");
    }
}

class AirCorn{
    String menu;
    String type;
    int price;
    AirCorn(String menu, String type, int price){
        this.menu = menu;
        this.type = type;
        this.price = price;
    }

    void use(){
        System.out.println("제조사가" + menu + "인" + type + "에어컨을 사용한다");
    }
}

class Ref{
    String menu;
    String type;
    String size;
    int price;
    Ref(String menu, String type, String size, int price){
        this.menu = menu;
        this.type = type;
        this.size = size;
        this.price = price;
    }

    void use(){
        System.out.println("제조사가" + menu + "인" + type + "형" + size + "냉장고가 식품을 관리한다");
    }
}

class AirCleaner{
    String menu;
    int price;
    AirCleaner(String menu, int price){
        this.menu = menu;
        this.price = price;
    }

    void use(){
        System.out.println("제조사가" + menu + "인 공기청정기가 공기를 깨끗하게 한다");
    }
}

class Mart{
    //1.컴퓨터 10대
    Computer[] c = new Computer[10];
    AirCorn[] a = new AirCorn[10];
    Ref[] r = new Ref[10];
    AirCleaner[] ac = new AirCleaner[10];

    Mart(){
        for (int i = 0; i < 10; i++){
            if (i < 5){
                c[i] = new Computer("삼성", "i7", 200);
                a[i] = new AirCorn("삼성", "벽걸이", 100);
                r[i] = new Ref("삼성", "양문", "600L", 200);
                ac[i] = new AirCleaner("LG", 80);
            }else {
                c[i] = new Computer("LG", "i5", 150);
                a[i] = new AirCorn("LG", "스탠드", 250);
                r[i] = new Ref("LG", "4도어", "800L", 350);
                ac[i] = new AirCleaner("다이슨", 60);
            }
        }
    }
}

class Consumer{
    String name;
    Computer[] c = new Computer[10];
    AirCorn[] a = new AirCorn[10];
    Ref[] r = new Ref[10];
    AirCleaner[] ac = new AirCleaner[10];

    Consumer(String name){
        this.name = name;
    }

    int money;

    void receiveComputer(Computer com){
        for (int i = 0; i < c.length; i++){
            if (c[i] == null){
                c[i] = com;
                break;
            }
        }
    }
    void receiveAirCorn(AirCorn aircorn){
        for (int i = 0; i < c.length; i++){
            if (a[i] == null){
                a[i] = aircorn;
                break;
            }
        }
    }
    void receiveRef(Ref ref){
        for (int i = 0; i < c.length; i++){
            if (r[i] == null){
                r[i] = ref;
                break;
            }
        }
    }
    void receiveAircleaner(AirCleaner aircleaner){
        for (int i = 0; i < c.length; i++){
            if (ac[i] == null){
                ac[i] = aircleaner;
                break;
            }
        }
    }

    //제품구매목록 출력
    void allprint(){
        for (int i = 0; i < 10; i++){
            if (c[i] != null){
                c[i].use();
            }
            if (a[i] != null){
                a[i].use();
            }
            if (r[i] != null){
                r[i].use();
            }
            if (ac[i] != null){
                ac[i].use();
            }
        }
    }
    int index = -1;
    //상성 0~5 엘지 5~10
    Computer sendComputer(int start, int end){
        for (int i = start; i < end; i++){
            if (c[i] != null){
                index = i;
                return c[i];
            }
        }
        return null;
    }
    AirCorn sendAircorn(int start, int end){
        for (int i = start; i < end; i++){
            if (a[i] != null){
                index = i;
                return a[i];
            }
        }
        return null;
    }
    AirCleaner sendAirCleaner(int start, int end){
        for (int i = start; i < end; i++){
            if (ac[i] != null){
                index = i;
                return ac[i];
            }
        }
        return null;
    }
    Ref sendRef(int start, int end){
        for (int i = start; i < end; i++){
            if (r[i] != null){
                index = i;
                return r[i];
            }
        }
        return null;
    }
    void changeNullComputer(){
        c[index] = null;
    }
    void changeNullAircorn(){
        a[index] = null;
    }
    void changeNullRef(){
        r[index] = null;
    }
    void changeNullAirCleaner(){
        ac[index] = null;
    }
}



public class MartTest {
    public static void main(String[] args) {
        Mart m = new Mart();
        Consumer[] cons = new Consumer[3];
        Scanner sc = new Scanner(System.in);

        //1,돈받기
        for (int i = 0; i < cons.length; i++){
            cons[i] = new Consumer((i + 1) + "번");
            System.out.print((i + 1) + "번째 소비자 : ");
            cons[i].money = sc.nextInt();
        }

        //물건사기 / 물건산거출력

        while (cons[0].money >= 60 || cons[1].money >= 60 || cons[2].money >= 60){
            for (int i = 0; i < cons.length; i++){
                System.out.println((i + 1) + "번째 소비자 남은 금액 : " + cons[i].money);
                if (cons[i].money >= 60){
                    System.out.print((i + 1) + "번째 소비자 상품을 선택 1. 컴퓨터 2. 에어컨 3. 냉장고 4.공기청정기 : ");
                    int num = sc.nextInt();

                    if (num == 1){
                        System.out.print("1. 삼성 2.LG : ");
                        int type = sc.nextInt();
                        if (type == 1){
                            if (cons[i].money >= 200){
                            }else {
                                System.out.println("돈이 부족합니다");
                            }
                        }
                        else if (type == 2){}
                        else {
                            System.out.println("잘못된 입력입니다");
                        }
                    }
                    else if (num == 2){}
                    else if (num == 3){}
                    else if (num == 4){}
                    else {
                        System.out.println("잘못된 입력입니다");
                    }
                }
            }
        }


    }
}
