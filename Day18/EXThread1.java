package Day18;

class ThreadTest extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<=10;i++){
            System.out.println("재미있는 자바 : "+i);
        }
    }
}

public class EXThread1 {
    public static void main(String[] args) {
        ThreadTest t = new ThreadTest();
        t.start();
        for(int i = 1;i<=10;i++){
            System.out.println("Main 쓰레드 : "+i);
        }
    }
}
