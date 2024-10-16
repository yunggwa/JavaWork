package Day2;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int dan = 2; dan <= 9; dan++){
            System.out.println(dan + "단!!!");

            for (int times = 1; times <= 9; times++){
                System.out.println(dan + "*" + times + "=" + dan * times);
            }
            System.out.println();
        }
    }
}
