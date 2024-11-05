package Day16;

import java.util.HashMap;

class C{
    int k;
}
class D{
    String str;
}
public class MapTest2 {
    public static void main(String[] args) {
        //key 는 Integer만 되는거 아닙니다. 아무거나 다 됩니다.
        HashMap<C,D> map = new HashMap<>();
        C c = new C();
        C c1 = new C();
        map.put(c,new D());
        System.out.println(map.get(c1));
        System.out.println(map.get(c).str);
    }
}
