package OnToOneSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiveThread extends Thread {
    private Socket m_Socket; //소켓 객체와 연결 시킬 수 있는 변수 생성
    //start() -> run() 메소드 실행

    @Override
    public void run() {
        super.run(); //큰 으ㅣ의 x

        try {
            //getInputStream -> InputStreamReader -> BufferedReader
            BufferedReader tmpbuf = new BufferedReader(new InputStreamReader(m_Socket.getInputStream()));
            //Soket을 이용한 BuffetReader 생성
            String receiveString;
            //무한루프
            while (true){
                receiveString = tmpbuf.readLine(); //문자열 한줄을 읽어 옵니다
                //BufferedReader ReadKine 저장

                if (receiveString == null){
                    System.out.println("상대방 연결이 끊겼습니다.");
                    break;
                }
                else {
                    System.out.println("상대방: " + receiveString);
                }
            }
            tmpbuf.close();
            }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    //메인문에서 Socket 객체 받아 내 변수에 대입

    public void setSocket(Socket _socket){m_Socket = _socket; }
}
