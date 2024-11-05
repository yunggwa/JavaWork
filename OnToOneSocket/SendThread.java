package OnToOneSocket;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SendThread extends Thread{

    private Socket m_Socket; //변수 선언

    @Override
    public void run() { //Thread 에 있는 run 메소드를 오버라이딩
        super.run(); //부모 run메소드호출
        try {
            //키보드입력
            BufferedReader tmpbuf = new BufferedReader(new InputStreamReader(System.in));
            //bufferReader 이용해 입력객체 생성
            //소켓에 out쏘려고
            PrintWriter sendWriter = new PrintWriter(m_Socket.getOutputStream());
            //PrintWriter객체 생성
            //객체 생성시 Socket의 출력 스트림 인자로 받아서 생성
            String sendString;
            while (true){
                sendString = tmpbuf.readLine(); //키보드 입력

                if (sendString.equals("종료")){
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                else {
                    //입력받은값 sendString에 대입
                    sendWriter.println(sendString);
                    //PrintWriter의 println 메소드에 sendString 대입
                    sendWriter.flush(); //소켓에 전속
                    //PrintWriter의 flush 함수 호출 시, 문자열 데이터 전송
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    //메인문에서 Socket 객체 받아 내 변수에 대입
    public void setSocket(Socket _socket){m_Socket = _socket;}
}
