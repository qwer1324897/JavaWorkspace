package p8;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("클라리언트 시작");

        System.out.println("서버 접속 시도");
        Socket socket = new Socket("172.30.1.71", 7777);
        System.out.println("서버 접속 완료");

        while (true) {
            System.out.print("\n전달 값 입력 (종료하시려면 0을 입력하세요.) > ");
            String dm = sc.nextLine();

            if (dm.equals("0")) break;
            
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF(dm);  
            System.out.println("서버로 메세지 전달 완료.");
        }

        System.out.println("클라이언트 종료");
    }
}
