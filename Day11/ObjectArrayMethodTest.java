package Day11;

class D{}

public class ObjectArrayMethodTest {
    static D[] senD(D[][] d, int i, int j){
        d[i][j] = new D();
        return d[i];
    }

    public static void main(String[] args) {
        D[][] d1 = new D[3][3];
//        D[] d2 = sendD(d1, 0,2);
    }
}
