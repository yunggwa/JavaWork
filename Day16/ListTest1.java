package Day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ListTest1 {
    /*
    Arrays.asList(name) Arrays(class)
    자료형 -> 기본, 참조
    Arrays.메소드 or 멤버변수
    Arrays.asList() 메소드
    static
     */
    public static void main(String[] args) {
        String[] name = {"kim", "lee", "pack", "jung", "oh"};
        ArrayList<String> lname = new ArrayList<>(Arrays.asList(name));
        System.out.println("초기 값 : " + lname);
        lname.add("ha");//ArrayList에 변수이름 lname에 문자열 "ha"라는 데이터 추가
        System.out.println("ha 추가된 후의 값 : " + lname);
        lname.set(0,"김");
        lname.set(0,"곽"); //수정
        System.out.println("김 곽으로 변경된 값 : " + lname);
        Collections.shuffle(lname);
        System.out.println("셔플 값 : " + lname);
        Collections.sort(lname);
        System.out.println("정렬 값 : " + lname);
        System.out.println("5번째 요소의 값 : " + lname.get(4));
        Collections.fill(lname, "김");
        System.out.println("모두 김으로 변경 : " + lname);
        System.out.println("리스트 크기 : " + lname.size());
    }
}
