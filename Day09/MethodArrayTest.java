package Day09;

public class MethodArrayTest {
    static void abc(int[][] c){

    }

    static  int[] def(int[][][][] d){
        return d[0][0][0];
    }

    public static void main(String[] args) {
            int [][][][] a = new int[3][3][3][3];
            abc(a[0][0]);
    }
}
