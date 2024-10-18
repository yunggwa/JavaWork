package Day04;

import java.util.Random;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();


        int com1 = r.nextInt(10)+1;
        int com2 = r.nextInt(10)+1;
        int com3 = r.nextInt(10)+1;

        while (true){
            if(com1 == com2 || com1 == com3 || com2 == com3){
                com1 = r.nextInt(10)+1;
                com2 = r.nextInt(10)+1;
                com3 = r.nextInt(10)+1;
            }else {
                System.out.println(com1 + " + "+ com2 + " + "+ com3);
                break;
            }
        }

    }
}
