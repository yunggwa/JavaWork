package Day05;

import java.util.Random;
import java.util.Scanner;

public class fishing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int[][] sea = new int[5][5];
        int a = 1;

        int top;
        int left;
        int right;
        int down;
        while (true){
            int fish = r.nextInt(3)+1;
            for (int i = 0; i < sea.length; i++){
                for (int j = 0; i < sea[i].length; j++){
                    System.out.print("○ ");


                }
            }
            for (int i = 0; i < sea.length; i++){
                for (int j = 0; j < sea[i].length; j++){
                    System.out.println(sea[i][j] + "\t");
                }
            }
            System.out.println();
        }

    }
}
