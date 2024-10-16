package Day01;

public class CharacterEx1 {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1);

        char ch2 = 66;
        System.out.println(ch2); //B가 나온다

        int ch3 = 67;
        System.out.println(ch3); //67
        System.out.println((char)ch3); // C

        char kor = '각';
        System.out.println((int)kor); // 44033

//        char t1 = -65; //에러 char는 음수는 불가능하다


    }
}
