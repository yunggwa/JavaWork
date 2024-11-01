package Day14;

import java.util.Random;

class Food{
    int[] food = {100};
}
class Shak extends Food{
    int[]shak = new int[5];
//        Random r = new Random();
//        int a = r.nextInt(7)+8;
    void ran(){
        Random r = new Random();
        int a = r.nextInt(7)+8;
        for (int i = 0; i < shak.length; i++){
            shak[i] = i + 1;
            System.out.println(shak[i] + "상어는" + a + "마리 만큼 잡아먹었습니다");
            if (food != null){
            }
        }
    }

}
public class Q2 {
    public static void main(String[] args) {
        Shak s = new Shak();
        s.ran();
    }
}
