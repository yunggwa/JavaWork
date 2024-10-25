package yungafter;

public class arry01 {
    public static void main(String[] args) {
        int[] arry = new int[10];
        String str = " ";

        for (int i = 0; i < arry.length; i++){
            arry[i] = i + 1; //인덱스는 0부터 시작이기 때문에 +1값
            System.out.print(arry[i] + str);
        }
    }
}
