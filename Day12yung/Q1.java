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
public class Q1 {
    public static void main(String[] args) {
        // 동물 객체 생성
        Animal monkey = new Animal("원숭이", "바나나");
        Animal dog = new Animal("개", "뼈다귀");
        Animal chicken = new Animal("닭", "모이");
        Animal pig = new Animal("돼지", "여물");

        // 초기 상태 출력
        System.out.println("초기 상태:");
        monkey.printFood();
        dog.printFood();
        chicken.printFood();
        pig.printFood();

        // 먹이 전달
        String tempFood = monkey.getFood(); // 원숭이의 바나나 임시 저장
        monkey.setFood(pig.getFood());      // 돼지의 여물을 원숭이에게
        pig.setFood(chicken.getFood());     // 닭의 모이를 돼지에게
        chicken.setFood(dog.getFood());     // 개의 뼈다귀를 닭에게
        dog.setFood(tempFood);              // 임시 저장한 바나나를 개에게 전달

        // 먹이 전달 후 상태 출력
        System.out.println("\n먹이 전달 후 상태:");
        monkey.printFood();
        dog.printFood();
        chicken.printFood();
        pig.printFood();
    }
}
