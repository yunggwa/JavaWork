package OnToOneSocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
    public static void main(String[] args) {
        //TODO Auto-fenerated method stub

        try {
            ServerSocket a_socket = new ServerSocket(9000); //ServerSocket 객체 생성
            Socket c_socket = a_socket.accept(); //ServerSocket accept 메소드, 변수 c_socket에 대입

            ReceiveThread receive_thread = new ReceiveThread(); //Receive Thread객체생성
            receive_thread.setSocket(c_socket);//Receive Thread Socket 전당
            SendThread send_thread = new SendThread(); //Seed Thread 객체 생성
            send_thread.setSocket(c_socket);//Send Thread Socket 전달
            receive_thread.start();
            send_thread.start(); //Send Thread 시작
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
