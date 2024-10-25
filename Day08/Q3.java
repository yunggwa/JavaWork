package Day08;

import javax.management.InstanceAlreadyExistsException;

class  mungu {
    String name1 = "연필";
    String name2 = "지우개";
    String name3 = "펜";
    String pencilcolor;
    String getPencil() {
        return pencilcolor;
    }

    void showpencil() {
        System.out.println(pencilcolor + "색 " + name1 + "로 적습니다");
    }
}
class eraser {
    String name = "지우개";
    String kk;
    String getkk(){
        return kk;
    }
    void showeraser(){
        System.out.println(name + "를" + "의 제품으로 지웁니다");
    }
}

class pen {
    String name = "펜";
    String pencolor;
    String getPencolor(){
        return pencolor;
    }
    void showepen(){
        System.out.println(name + "을" + "의 제품의" + pencolor + "로 지웁니다");
    }
}


//void showpencil(){
//    System.out.println(color + "색 " + name + "적습니다");
//}



public class Q3 {
    public static void main(String[] args) {
    mungu color1 = new mungu();
    color1.pencilcolor = "빨강";



//    pencil color3 = new pencil();
//    color3.color = "주황";
//    color3.showpencil();
//
//    pencil color4 = new pencil();
//    color4.color = "노란";
//    color4.showpencil();



    }
}
