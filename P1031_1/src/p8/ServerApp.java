package p8;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerApp {
    public static void main(String[] args) throws Exception{
        System.out.println("서버 시작");
        ServerSocket serverSocket = new ServerSocket(7777);

        while (true) {
            Socket socket = serverSocket.accept(); // 클라이언트로 부터 접속 대기
            System.out.println(socket.getInetAddress().getHostAddress());
            new RecvThread(socket).start();
        }
    }
}

class RecvThread extends Thread {
    
    private Socket socket;

    public RecvThread(Socket socket) {
        this.socket = socket;
    }
    
    @Override
    public void run() {
        try {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            String userIp = socket.getInetAddress().getHostAddress();
            while (true) {
                String message = dis.readUTF();
                System.out.println("ㅇㅇ (" + userIp + ") 메세지: " + message);
            }
        } catch (IOException e) {
            System.out.println("누군가가 접속을 종료했습니다.");
        }
    }
}
