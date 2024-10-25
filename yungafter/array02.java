package yungafter;

public class array02 {
    public static void main(String[] args) {
        int[] array = new int[10];
        String str = " ";
        int num = array.length;

        for (int i = 0; i < array.length; i++){
            num--;
            array[i] = num + 1;
            System.out.print(array[i] + str);
        }
    }
}
