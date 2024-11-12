package OnToOneSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientThread extends Thread {
    private Socket m_Socket;

    @Override
    public void run() {
        super.run();
        try {
            BufferedReader tmpbuf = new BufferedReader(new InputStreamReader(System.in));
            //BufferedReader 이용해 입력 객체 생성
            PrintWriter sendWriter = new PrintWriter(m_Socket.getOutputStream());
            //PringWriter 객체 생성
            //객체 생성시, Socket의 출력 스트림 인자로 받아서 생성
            String sendString;
            while (true) {
                sendString = tmpbuf.readLine();
                if (sendString.equals("quit")) {
                    break;
                } else {
                    sendWriter.println(sendString);
                    sendWriter.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //메인문에서 Socket 객체 받아 내 변수에 대입
    public void setSocket(Socket _socket){m_Socket = _socket; }
}

