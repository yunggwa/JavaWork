import java.util.Random;

class Dice{
    String color;
    Dice(String color){
        this.color = color;
    }
    int trrowDice(){
        Random r = new Random();
        return r.nextInt(6)+1;
    }
}


public class Q2_T {
    public static void main(String[] args) {
        Dice red = new Dice("빨간색");
        Dice blue = new Dice("파란색");

        int redResult = 0;
        int blueResult = 0;
        int turn = 0;

        while(redResult < 50 && blueResult < 50){
            System.out.println("======"+(turn++)+"=======");
            redResult += red.trrowDice();
            blueResult += blue.trrowDice();

            System.out.println(red.color + "주사위 : " + redResult);
            System.out.println(blue.color + "주사위 : " + blueResult);

            if (redResult > blueResult){
                System.out.println(red.color + "주사위 승리");
            } else if (redResult == blueResult) {
                System.out.println("무승부");

            }else {
                System.out.println(blue.color + "주사위 승리");
            }
        }
    }
}
