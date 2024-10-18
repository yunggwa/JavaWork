package Day04;

import java.util.Random;
import java.util.Scanner;

public class Q2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int[] com = new int[3];
        int j;

        while(true){
            for (j = 0; j < 3; j++){
                int num = r.nextInt(9)+1;
                com[j] = num;
            }
            if (com[0] != com[1] && com[0] != com[2] && com[1] != com[2]){
                System.out.print(com[0]+ "," + com[1] +","+ com[2]);

                break;
            }

        }
    }

}


