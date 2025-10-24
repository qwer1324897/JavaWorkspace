package p5;

import java.time.LocalDateTime;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        // Date 날짜 API
        
        Date/*이거 java util로 해야 함. import 주의.*/ date = new Date(); // 현재 시간(날짜)
        System.out.println(date);

        // Date > LocalDate, LocalDateTime, LocalTime

        Date aaa = new Date(0);
        System.out.println(aaa);

        // 아무튼 이거 구닥다리라 안 쓴다. 가끔 옛날 프로그램 쓰는 회사는 쓰기도 한다. 혹시 보더라도 당황하지 말자.


        // 아무튼 LocalDate 를 사용하자!

        LocalDateTime today = LocalDateTime.now();
        LocalDateTime when = LocalDateTime.of(2024, 10, 24, 15, 28);
        System.out.println(today);
        System.out.println(when);
    }
}
