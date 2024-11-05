//package Day16;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//class Aniaml{
//    Aniaml(String name, String color){
////        String[] colors = {"갈색", "검은색","흰색","노란색","점박이"};
//        this.name = name;
//        this.color = color;
//    }
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    private String color;
//    void print(){}
//}
//class Dog extends Aniaml{
//
//    Dog(String name, String color){
////        String[] name = {"말티즈","요크셔테리어","포메라니안","시바","웰시코기"};
//        super(name, color);
//    }
//
//
//    @Override
//    void print() {
//        super.print();
//        System.out.println(color + "의 " + name + "는 짖는다");
//    }
//}
//class Cat extends Aniaml{
//    Cat(String name, String color){
////        String[] name = {"먼치킨","스핑크스","뱅갈","샴","폴드"};
//        super(name, color);
//    }
//
//    @Override
//    void print() {
//        super.print();
//        System.out.println(color + "의 " + name + "는 야옹한다");
//    }
//}
//class Bird extends Aniaml{
//    Bird(String name, String color){
////        String[] name = {"앵무새","참새","닭","까마귀","비둘기"};
//        super(name, color);
//    }
//
//    @Override
//    void print() {
//        super.print();
//        System.out.println(color + "의 " + name + "는 날아다닌다");
//    }
//}
//public class Q2 {
//    public static void main(String[] args) {
//        Random r = new Random();
//        List<Aniaml> aniamls = new ArrayList<>();
//
//        String[] dogs = {"말티즈", "요크셔테리어", "포메라니안", "시바", "웰시코기"};
//        String[] cats = {"먼치킨", "스핑크스", "뱅갈", "샴", "폴드"};
//        String[] birds = {"앵무새", "참새", "닭", "까마귀", "비둘기"};
//        String[] colors = {"갈색", "검은색", "흰색", "노란색", "점박이"};
//
//        for (int i = 0; i < 3; i++) {
//            String name = dogs[r.nextInt(dogs.length)];
//            String color = colors[r.nextInt(colors.length)];
//            aniamls.add(new Dog(name, color));
//        }
//        for (int i = 0; i < 2; i++) {
//            String name = cats[r.nextInt(cats.length)];
//            String color = colors[r.nextInt(colors.length)];
//            aniamls.add(new Cat(name, color));
//
//        }
//
//        String name = birds[r.nextInt(birds.length)];
//        String color = colors[r.nextInt(colors.length)];
//        aniamls.add(new Bird(name, color));
//
//        Dog d = new Dog(name, color);
//        Cat c = new Cat(name, color);
//        Bird b = new Bird(name, color);
//
//        d.print();
//        c.print();
//        b.print();
//
//
//    }
//}