package Yung;

class Person{
    String name;
    int age;

    public Person(){
        this.name = "권윤경";
        this.age = 0;
    }
    public Person(String name){
        this.name = name;
        this.age = 0;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class overloading {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("김윤경");
        Person p3 = new Person("박윤경", 32);
    }
}
