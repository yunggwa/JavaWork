package YungMethod04;

import java.util.Random;
import java.util.Scanner;

public class Baseball {
    //com의 중복되지않는 3개 숫자 만들기
static int[] Com() {
    Random r = new Random();
    int[] com = new int[3];
    for (int i = 0; i < com.length; i++) {
        int num = r.nextInt(9) + 1;
        com[i] = num;
    }
    if (com[0] != com[1] && com[0] != com[2] && com[1] != com[2]){
        System.out.println(com[0] + " " + com[1] + " " + com[2]);
    }
    return com; //이거 나중에 메인문에
}

//user입력값받기
static int[] User(Scanner sc){
    int[]user = new int[3];
    for (int i = 0; i < user.length; i++){
        System.out.println((i + 1) + "번째 숫자를 입력하세요");
        user[i] = sc.nextInt();
    }
    return user;
}
//com입력출력
static void comprint(int[] com){
    String str = " ";
    System.out.println(com[0] + str + com[1] + str + com[2]);
}
//user입력출력
static void userprint(int[] user){
    String str = " ";
    System.out.println(user[0] + str + user[1] + str + user[2]);
}

static int stcnt(int[] com, int[] user){
    int st = 0;
    for (int i = 0; i < 3; i++){
        if (user[i] == com[i]){
            st++;
        }
    }
    return st;
}

static int ballcnt(int[] com, int[] user){
    int ball = 0;
    for (int i = 0; i < 3; i++){
        for (int j = 0; j < 3; j++){
            if (user[i] == com[j] && i != j){
                ball++;
            }
        }
    }
    return ball;
}

static void stballprint(int st, int ball){
    if (st == 0 && ball == 0){
        System.out.println("아웃입니다~");
    } else if (st == 3) {
        System.out.println("홈런~~");
    } else {
        System.out.println(st + " 스트라이크, " + ball + " 볼 입니다!!");
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] com = Com();
        while (true){
            int st = 0;
            int ball = 0;
            int[] user = User(sc);
            comprint(com);
            userprint(user);
            stballprint(stcnt(com, user), ballcnt(com, user));
//            if (st == 3){
//                System.out.println("홈런~~");
//                break;
//            }
        }
    }
}
