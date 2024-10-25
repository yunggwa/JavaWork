package Day08;
class puppy{
    String color;
    int weight;
    void showpuppy(){
        System.out.println ("강아지의 색깔은 " + color + "이고, 무게는 " + weight + "kg 이고 왈왈 짖는다");
    }
}
class cat{
    String color;
    int weight;
    void showcat(){
        System.out.println("고양이의 무게는 " + weight + "kg 이고 색깔은" +color + "이고, 야옹하고 운다");
    }
}
class bird{
    String color;
    int weight;
    void showbird(){
        System.out.println("새의 무게는 " + weight + "kg 이고, 색깔은" + color + "이며, 날라다닌다");
    }
}

public class Q4 {
    public static void main(String[] args) {
        puppy pink = new puppy();
        puppy blue = new puppy();
        pink.color = "핑크";
        pink.weight = 40;
        blue.color = "파랑";
        blue.weight = 20;
        pink.showpuppy();
        blue.showpuppy();

        cat orange = new cat();
        cat green = new cat();
        orange.color = "주황";
        orange.weight = 30;
        green.color = "초록";
        green.weight = 15;
        orange.showcat();
        green.showcat();

        bird white = new bird();
        white.color = "하얀";
        white.weight = 5;
        white.showbird();
    }
}
