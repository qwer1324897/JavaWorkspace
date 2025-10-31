package p6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) throws Exception {
        
        Thread.ofVirtual().start(() -> {
            System.out.println("hello");
        });

        // 가상 쓰레드. 작업 끝나면 그 즉시 바로 종료.

        ExecutorService ex = Executors.newFixedThreadPool(10);

        ex.submit(() -> {
            System.out.println("실행 코드");
        });

        Thread.sleep(3000);
        System.out.println("메인 쓰레드 종료");
        
        ex.shutdown();
        
        // 얘는 닫아줘야댐.
    }
}
