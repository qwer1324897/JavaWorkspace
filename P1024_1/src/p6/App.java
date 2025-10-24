package p6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        /* 각 데이터간 변환
         * 문자 <> 숫자
         * 숫자 <> 날짜
         * 날짜 <> 문자
         */

        // 1. 숫자 > 문자
        {
            int a = 10;
            String A = a + "";
            String B = String.valueOf(a);
            String C = Integer.toString(a);
        }
        // 2. 문자 > 문자
        {
            String a = "20";
            int A = Integer.parseInt(a);
        }
        // 3. 숫자 > 날짜
        {
            int a = 000101;
            Date A = new Date(a);
        }
        // 4. 날짜 > 숫자
        {
            Date a = new Date();
            long A = a.getTime();
        }
        // 5. 날짜 > 문자
        {
            LocalDateTime today = LocalDateTime.now();
            
        }
    }
}
