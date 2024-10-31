package Day13;

import java.util.Random;

class Pokemon{
    String name;
    String color;
    String size;

    Pokemon(String name, String color, String size){
        this.name = name;
        this.color = color;
        this.size = size;
    }
}
class Dr5{
    Pokemon[][] p = new Pokemon[3][4];
    Random r = new Random();

    void pokeinfo(){
        String[] name = {"피카츄", "파이리", "꼬부기", "이상해씨"};
        String[] color = {"노란색", "빨간색", "파란색", "초록색"};
        String[] size ={"대", "중", "소", "미니"};

        for (int i = 0; i < p.length; i++){
            for (int j = 0; j < p[i].length; j++){
                String randomname = name[r.nextInt(name.length)];
                String randomcolor = color[r.nextInt(color.length)];
                String randomsize = size[r.nextInt(size.length)];

                p[i][j] = new Pokemon(randomname, randomcolor, randomsize);
            }
        }
    }
    Pokemon getRandomPokemon() {
        int randomRow = r.nextInt(p.length);
        int randomCol = r.nextInt(p[0].length);
        return p[randomRow][randomCol];
    }
}
class Jiwoo{
    Pokemon receivedPokemon;

    // Dr5에서 랜덤한 Pokemon 하나를 받는 메서드
    void RandomPokemon(Pokemon pokemon) {
        receivedPokemon = pokemon;
    }

    // 받은 포켓몬 정보 출력
    void displayPokemon() {
        if (receivedPokemon != null) {
            System.out.println("이름 : " + receivedPokemon.name + ", 색깔 : " + receivedPokemon.color + ", 크기 : " + receivedPokemon.size);
        }
    }

}
public class poke {
    public static void main(String[] args) {
        Dr5 dr5 = new Dr5();
        dr5.pokeinfo();

        Jiwoo jiwoo = new Jiwoo();

        // Dr5에서 랜덤한 Pokemon 하나를 받아옴
        jiwoo.RandomPokemon(dr5.getRandomPokemon());

        // 지우가 받은 랜덤한 포켓몬 정보 출력
        jiwoo.displayPokemon();
    }
}
