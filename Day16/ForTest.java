package Day16;

public class ForTest {
    public static void main(String[] args) {
        int[] a = {5,6,7,8,9};
        for(int i = 0; i < a.length; i++){
            System.out.print(i + " ");
        }
//        i = index
//                =========================================

        System.out.println();
        for(int i : a){
            System.out.print(i + " ");
        }

//        i = value
    }
}
