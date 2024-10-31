package gpt;
import java.util.Random;

class Dice {
    private String color;   // 주사위의 색상
    private int score;      // 누적 점수

    // 생성자: 주사위의 색상을 초기화하고 점수는 0으로 시작
    public Dice(String color) {
        this.color = color;
        this.score = 0;
    }

    // 주사위 색상 반환 (getter)
    public String getColor() {
        return color;
    }

    // 주사위 점수 반환 (getter)
    public int getScore() {
        return score;
    }

    // 주사위 점수 설정 (setter)
    public void setScore(int score) {
        this.score = score;
    }

    // 주사위 굴리기 (1부터 6까지 랜덤 값 추가)
    public void roll() {
        Random random = new Random();
        int rollValue = random.nextInt(6) + 1;  // 1 ~ 6 사이의 랜덤 값
        setScore(getScore() + rollValue); // 점수 누적
        System.out.println(color + " 주사위가 " + rollValue + "가 나왔습니다. 현재 점수: " + getScore());
    }
}

public class gptQ2 {
    public static void main(String[] args) {
        // 두 개의 주사위를 배열로 생성
        Dice[] dices = { new Dice("파란"), new Dice("빨간") };

        boolean gameEnded = false;

        while (!gameEnded) {
            for (Dice dice : dices) {
                dice.roll();  // 주사위 굴리기

                // 각 주사위가 50점 이상이면 게임 종료
                if (dice.getScore() >= 50) {
                    System.out.println("\n" + dice.getColor() + " 주사위가 먼저 50점 이상이 되었습니다!");
                    gameEnded = true;
                    break;
                }
            }
        }
    }
}
