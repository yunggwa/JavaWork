package Day01;

public class ExplicitConversion {
    public static void main(String[] args) {
        double dNum1 = 1.2;
        float fNum2 = 0.9F; // float는 뒤에 F표시를 해줘야 에러가 나지않는다.

        int iNum3 = (int)dNum1 + (int)fNum2;
        int iNum4 = (int)(dNum1 + fNum2);
        System.out.println(iNum3);
        System.out.println(iNum4);
    }
}
