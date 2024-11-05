package Day16;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Water{
    private int qua;
    //물 수량 변수 get set
    public int getQua() {
        return qua;
    }

    public void setQua(int qua) {
        this.qua = qua;
    }

    Water(int qua){
        this.qua = qua;
    }
}
class Human{
    private ArrayList<Water> waterArrayList = new ArrayList<>();

    void addWater(Water water){
        waterArrayList.add(water);
    }

    int waterqua(){
        int re = 0;
        for (Water water : waterArrayList){
            re += water.getQua();
        }
        return re;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        Human hu1 = new Human();
        Human hu2 = new Human();
        Human hu3 = new Human();


//        hu.bottle = new int[30];
//        Water water = new Water();
//        water.qua = new int[30];

//        int[] pp = new int[3];
        ArrayList<Water> waterArrayList = new ArrayList<>();
        for (int i = 0; i < 30; i++){
            int qua = r.nextInt(8)+1;
            waterArrayList.add(new Water(qua));

        }
        for (int i = 0; i < 10; i++){
            hu1.addWater(waterArrayList.get(i)); //1~10
            hu2.addWater(waterArrayList.get(i + 10)); //11 ~ 20
            hu3.addWater(waterArrayList.get(i + 20)); // 21 ~30
        }

        int re1 = hu1.waterqua();
        int re2 = hu2.waterqua();
        int re3 = hu3.waterqua();

        System.out.println("첫 번째 사람의 물 수량은 : " + re1);
        System.out.println("두 번째 사람의 물 수량은 : " + re2);
        System.out.println("세 번째 사람의 물 수량은 : " + re3);

        System.out.println("물을 제일 많이 가지고 있는 사람을 맞추시오");
        while (true){
            System.out.print("1. 첫번째사람 2. 두번째 사람 3. 세번째 사람 : ");
            int num = sc.nextInt();
            if (num > 3 || num < 0){
                System.out.println("잘못된 입력입니다");
            }else {
                if (num == 1){
                    if (re1 > re2 && re1 > re3){
                        System.out.println("정답 - >ㅇ< 첫 번째 사람의 물 수량은 : " + re1);
                        break;
                    }else {
                        System.out.println("땡 - !! 다시 선택");
                    }
                }else if (num == 2){
                    if (re2 > re1 && re2 > re3){
                        System.out.println("정답 - >ㅇ< 두 번째 사람의 물 수량은 : " + re2);
                        break;
                    }else {
                        System.out.println("땡 - !! 다시선택");
                    }
                }else {
                    if (re3 > re1 && re3 > re2) {
                        System.out.println("정답 - >ㅇ< 세 번째 사람의 물 수량은 : " + re3);
                        break;
                    } else {
                        System.out.println("땡 - !! 다시 선택");
                    }
                }
            }
        }

    }
}
