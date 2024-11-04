package YungMethod04;

import java.util.Random;
import java.util.Scanner;

public class ComRandom {

static int[] Print(){
    Scanner sc = new Scanner(System.in);
    Random r = new Random();

    int[] com = new int[3];

    while (true) {
        for (int i = 0; i < com.length; i++) {
            int num = r.nextInt(10) + 1;
            com[i] = num;
        }
        if (com[0] != com[1] && com[0] != com[2] && com[1] != com[2]) {
//            System.out.println(com[0] + str + com[1] + str + com[2]);
            return com; //리턴해서 바로 종료시키니까 브레이크가 필요없다
        }
        }
    }

    public static void main(String[] args) {
        String str = " ";
        int[] ComRandomNumber = Print();
        System.out.println(ComRandomNumber[0] + str + ComRandomNumber[1] + str + ComRandomNumber[2]);
    }
}
