package gpt;
class Animal {
    private String name;
    private String food;

    // 생성자: 동물의 이름과 먹이를 초기화
    public Animal(String name, String food) {
        this.name = name;
        this.food = food;
    }

    // 동물의 이름 반환
    public String getName() {
        return name;
    }

    // 먹이 반환
    public String getFood() {
        return food;
    }

    // 먹이 설정
    public void setFood(String food) {
        this.food = food;
    }

    // 동물과 먹이를 출력
    public void printFood() {
        System.out.println(name + " - " + food);
    }
}
public class gptQ1 {
    public static void main(String[] args) {
        // 동물 배열 생성 및 초기화
        Animal[] animals = {
                new Animal("원숭이", "바나나"),
                new Animal("개", "뼈다귀"),
                new Animal("닭", "모이"),
                new Animal("돼지", "여물")
        };

        // 초기 상태 출력
        System.out.println("초기 상태:");
        for (Animal animal : animals) {
            animal.printFood();
        }

        // 먹이 전달 (순환 이동) - getter와 setter 사용
        String tempFood = animals[0].getFood(); // 첫 번째 동물의 먹이 임시 저장
        for (int i = 0; i < animals.length - 1; i++) {
            animals[i].setFood(animals[i + 1].getFood()); // 다음 동물의 먹이를 현재 동물에게 설정
        }
        animals[animals.length - 1].setFood(tempFood); // 마지막 동물에 첫 번째 동물의 먹이 설정

        // 먹이 전달 후 상태 출력
        System.out.println("\n먹이 전달 후 상태:");
        for (Animal animal : animals) {
            animal.printFood();
        }
    }
}
