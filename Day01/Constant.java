package Day01;

public class Constant {
    public static void main(String[] args) {
        final  int MAX_NUM = 100;
        final  int MIN_NUM; //에러가 나지않는다 자바가 최신화가 되면서..
        MIN_NUM = 0;
//        MIN_NUM = 20; //이건 에러가 난다!

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);
    }
}
