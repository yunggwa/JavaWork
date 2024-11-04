//package Day15;
//
//import java.util.Random;
//import java.util.Scanner;
//
//abstract class Mart{
//    String name;
//    String company;
//    Mart(){
//        Random r = new Random();
//        String[] names = {"컴퓨터", "에어컨", "냉장고", "공기청정기"};
//        name = names[r.nextInt(names.length)];
//        String[] companys = {"삼성", "LG"};
//        company = companys[r.nextInt(companys.length)];
//    }
//    abstract void print();
//}
//class Com extends Mart{
//    Com(){
//        String name = "컴퓨터";
//    }
//    @Override
//    void print() {
//        System.out.println("제품 : " + name + ",  제조사 : " + company);
//    }
//}
//class Aircon extends Mart{
//    Aircon(){
//        String name = "에어컨";
//    }
//    @Override
//    void print() {
//        System.out.println("제품 : " + name + ",  제조사 : " + company);
//    }
//}
//class Ref extends Mart{
//    Ref(){
//        String name = "냉장고";
//    }
//    @Override
//    void print() {
//        System.out.println("제품 : " + name + ",  제조사 : " + company);
//    }
//}
//class Aircl extends Mart{
//    Aircl(){
//        String name = "공기청정기";
//    }
//    @Override
//    void print() {
//        System.out.println("제품 : " + name + ",  제조사 : " + company);
//    }
//}
//public class Q2 {
//    public static void main(String[] args) {
//        Random r = new Random();
//        Scanner sc = new Scanner(System.in);
//        Mart[] mart = new Mart[40];
//        Mart[] comp = new Mart[2];
//        for (int i = 0; i < mart.length; i++){
//            int num = r.nextInt(4);
//            if (num == 0){
//                mart[i] = new Com();
//            } else if (num == 1) {
//                mart[i] = new Aircon();
//            } else if (num == 2) {
//                mart[i] = new Ref();
//            }else {
//                mart[i] = new Aircl();
//            }
////            for (int j = 0; j < comp.length;){
////                int num2 = r.nextInt(2);
////                if (num == 0
////                }
////            }
//        }
//        for (int i = 0; i < mart.length; i++){
//            mart[i].print();
//        }
//        while (true){
//            System.out.println("제품입력 : ");
//            String str1 = sc.next();
//            if (sc.equals("냉장고")){
//            }
//        }
//    }
//
//}
