package Day15;

import java.util.Random;
import java.util.Scanner;

//부모클래스 제품 - 제품 : 브랜드, 제품명, 출력하는거 추상화로
abstract class Product{
    Random r = new Random();
    String type;
    String br;
    abstract void print();
}
class Computer extends Product{
    Computer(){
        type = "컴퓨터";
        String[] brands = {"삼성", "LG"};
        br = brands[r.nextInt(brands.length)];
    }

    @Override
    void print() {
        System.out.println(type + ", " + br);
    }
}
class Aircon extends Product{
    Aircon(){
        type = "에어컨";
        String[] brands = {"삼성", "LG"};
        br = brands[r.nextInt(brands.length)];
    }

    @Override
    void print() {
        System.out.println(type + ", " + br);
    }
}
class Ref extends Product{
    Ref(){
        type = "냉장고";
        String[] brands = {"삼성", "LG"};
        br = brands[r.nextInt(brands.length)];
    }

    @Override
    void print() {
        System.out.println(type + ", " + br);
    }
}
class Airclener extends Product{
    Airclener(){
        type = "공기청정기";
        String[] brands = {"삼성", "다이슨"};
        br = brands[r.nextInt(brands.length)];
    }

    @Override
    void print() {
        System.out.println(type + ", " + br);
    }
}
public class Q2_T {
    public static void main(String[] args) {
        Random r = new Random();
        //1. 입력객체, 랜덤객체
        Scanner sc = new Scanner(System.in);

        //2. 제품 40개 배열 객체 생성
        Product[] pList = new Product[40];

        //3.40개 배열에 실제 객체 추가
        for (int i = 0; i < pList.length; i++){
            int num = r.nextInt(4);
            if (num == 0){
                pList[i] = new Computer();
            } else if (num == 1) {
                pList[i] = new Aircon();
            } else if (num == 2) {
                pList[i] = new Ref();
            }else {
                pList[i] = new Airclener();
            }
            pList[i].print();
        }
        System.out.print("제품 입력 : ");
        String type = sc.next();
        System.out.print("제조사 입력 : ");
        String br = sc.next();

        boolean chexk = true;
        for (int i = 0; i < pList.length; i++){
            if (pList[i].type.equals(type) && pList[i].br.equals(br)){
                System.out.println(i + "번째 제품이에용.");
                chexk = false;
                break;
            }
        }
        if (chexk){
            System.out.println("제품이 없습니다");
        }
    }
}
