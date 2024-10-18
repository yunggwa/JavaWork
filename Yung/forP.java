package Yung;

public class forP {
    public static void main(String[] args) {
        //규칙찾기
        //피라미드
        // 별 1 3 5 7 9
        // 행마다

        for (int i = 0; i < 5; i++){
             for (int j = 4; j >= 0; j--){
                 if (i < j){
                     System.out.println(" ");
                 }
                 else {
                     for (int k = 0; k <= i*2; k++){
                         System.out.print("*");
                     }
                     break;
                 }

             }
            System.out.println();
        }


    }
}// 9 7 5 3 1
// 0 1 2 3 4 //i*2를 하면