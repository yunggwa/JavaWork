package YungClass04;

import java.util.Random;
import java.util.Scanner;

class BallGame {
    BallUser user;
    BallCom com;

    BallGame() {
        user = new BallUser();
        com = new BallCom();
    }

    int st() {
        int s = 0;
        int[] comN = com.comreturn();
        int[] userN = user.userturn();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (comN[i] == userN[j] && i == j) {
                    s++;
                }
            }
        }
        return s;
    }

    int ball() {
        int b = 0;
        int[] comN = com.comreturn();
        int[] userN = user.userturn();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (comN[i] == userN[j]) {
                    if (i != j) {
                        b++;
                    }
                }
            }
        }
        return b;
    }

    void start(Scanner sc) {
        while (true) {
            user.setUser();
            int st = st();
            int ball = ball();
            user.userprint();
            com.comprint();
            printballst(st, ball);

            if (st == 3) {
                System.out.println("홈런입니다");
                break;
            }
        }


    }

    void printballst(int st, int ball) {
        if (st == 0 && ball == 0) {
            System.out.println("아웃입니다~");
//        } else if (st == 3) {
//            System.out.println("홈런입니다");
        }
        else {
            System.out.println(st + " 스트라이크, " + ball + " 볼 입니다!!");
        }

    }
}

    class BallUser {
        int[] user;

        BallUser() {
        }

        void setUser() {
            int[] user = new int[3];
            Scanner sc = new Scanner(System.in);

            while (true) {
                for (int i = 0; i < user.length; i++) {
                    System.out.print((i + 1) + " 번째 숫자를 입력해주세요 : ");
                    user[i] = sc.nextInt();
                }
                if (sc.nextInt() > 10 || sc.nextInt() < 0) {
                    System.out.println("다시 입력해주세요");
                }
            }
        }

        int[] userturn() {
            return user;
        }

        void userprint() {
            System.out.println(user[0] + " " + user[1] + " " + user[2]);
        }


    }

    class BallCom {
        int[] com;

        BallCom() {
        }

        void comrandom() {
            int[] com = new int[3];
            Random r = new Random();
            while (true) {
                for (int i = 0; i < com.length; i++) {
                    int num = r.nextInt(9) + 1;
                    com[i] = num;
                }
                if (com[0] != com[1] && com[0] != com[2] && com[1] != com[2]) {
                    break;
                }
            }
        }

        int[] comreturn() {
            return com;
        }

        void comprint() {
            System.out.println("com의 숫자는 : " + com[0] + " " + com[1] + " " + com[2]);
        }
    }
        public class Baseball {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                BallGame bg = new BallGame();
                bg.start(sc);
            }
        }


