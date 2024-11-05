package Day16;

class Box<T>{
    T vol;

    void setVolume(T v){
        vol = v;
    }
    T getVolume(){
        return vol;
    }
}

public class GenericTest {
    public static void main(String[] args) {
        Box<Integer> ibox = new Box<>();
        ibox.setVolume(200);
        System.out.println("<Intger>박스의 부피는 : " + ibox.getVolume());
        Box<String> sbox = new Box<>();
        sbox.setVolume("권윤경");
        System.out.println(sbox.getVolume());
        Box<Double> dbox = new  Box<>();
        dbox.setVolume(50.7);
        System.out.println("<Double>박스의 부피는 : " + dbox.getVolume());
    }

}
