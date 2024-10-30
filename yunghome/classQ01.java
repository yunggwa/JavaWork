package yunghome;

import java.util.Random;

class Car {
    int position;
    String model;

    Car(String model) { //생성자
        this.model = model;
        this.position = 0; //초기값을 설정
    }

    void moveForward(int distance) {
        System.out.println(model + "가 앞으로 이동한 거리 : " + distance + "미터");
        position += distance;
//        return position;

    }

    void moveBackward(int distance) {
        System.out.println(model + "가 뒤으로 이동한 거리 : " + distance + "미터");
        position -= distance;
//        return position;
    }

//    void Carmove() {
//        Random r = new Random();
//        while (position < 200) {
//            System.out.println("현재거리 : " + position + "미터");
//
//            int random = r.nextInt(2);
//            int move = r.nextInt(100) + 1;
//            if (random == 1) {
//                moveForward(move);
//            } else {
//                moveBackward(move);
//            }
//            System.out.println("도착했습니다 총 거리는 : " + position);
//        }
//    }
}
public class classQ01 {
    public static void main(String[] args) {
        Random r = new Random();
        Car car = new Car("포르쉐");

        while (car.position < 200) {
            System.out.println("현재거리 : " + car.position + "미터");
            int move = r.nextInt(100) + 1;

            int random = r.nextInt(2);
            if (random == 1) {
                 car.moveForward(move);
//                 System.out.println(car.model + "가 앞으로 이동한 거리 : " + move + "미터");
            } else {
               car.moveBackward(move);
//                System.out.println(car.model + "가 뒤으로 이동한 거리 : " + move + "미터");
            }
        }
        System.out.println("도착했습니다 총 거리는 : " + car.position);
    }
}

