package Yung04;

import java.util.Random;
import java.util.Scanner;

public class ComRandom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int[] com = new int[3];
        String str = " ";

        while (true){
            for (int i = 0; i < com.length; i++){
                int num = r.nextInt(10)+1;
                com[i] = num;
            }
            if (com[0] != com[1] && com[0] != com[2] && com[1] != com[2]){
                System.out.println(com[0] + str + com[1] + str + com[2]);
                break;
            }
        }
    }
}
