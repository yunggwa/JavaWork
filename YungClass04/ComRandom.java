package YungClass04;

import java.util.Random;

class ComR{
   int[] com;
   ComR(){
//       Random r = new Random();
//       int[] coms = com[r.nextInt(10)+1()];
       com = new  int[3];
   }

   //중복없는 3개 메소드
    void GoodRandom(){
       Random r = new Random();
       String str = " ";

       while (true){
           for (int i = 0; i < com.length; i++){
               int num = r.nextInt(10)+1;
               com[i] = num;
           }
           if (com[0] != com[1] && com[0] != com[2] && com[1] != com[2]){
               System.out.println(com[0] + str + com[1] + str + com[2]);
               break;
           }
       }
    }
}





public class ComRandom {
    public static void main(String[] args) {
        ComR comr = new ComR();
        comr.GoodRandom();
    }
}
