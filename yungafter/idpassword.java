package yungafter;

import java.util.Scanner;

public class idpassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = "yungyung";
        String password = "1234";

        System.out.print("id를 입력해주세요 :");
        String idinput = sc.next();
        System.out.print("password를 입력해주세요 :");
        String pwinput = sc.next();


            if (!(idinput.equals(id) || pwinput.equals(password))){
                System.out.println("id와 password 둘 다 올바르지 않습니다");
            }else {
            }if (!(idinput.equals(id))){
                System.out.println("id가 올바르지않습니다");
            }else if(!(pwinput.equals(password))) {
                System.out.println("password가 올바르지않습니다");
            }else {
                System.out.println("환영합니다" + id + "님!");

            }






    }
}
