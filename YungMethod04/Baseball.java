package YungMethod04;

import java.util.Random;

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

static void print(int[] com){
    String str = " ";
    System.out.println(com[0] + str + com[1] + str + com[2]);
}
//사용자 입력
    public static void main(String[] args) {
//        print(Com());
        Com();
    }
}
