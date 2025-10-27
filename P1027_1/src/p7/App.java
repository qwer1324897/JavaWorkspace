package p7;

import java.io.FileOutputStream;

public class App {
    public static void main(String[] args) {
        /*
         * throw
         */
        int result = new SumCalculator().sum(10, 20);
        System.out.println(result);
    }
}

class SumCalculator {
    public int sum(int a, int b) {
        if(b < a) {
            throw new RuntimeException("b는 a보다 클 수 없습니다.");
            // 이렇게 throw를 던지면 프로그램이 즉시 종료된다.
            // 그래서 사용하는 쪽에서 이 throw가 나지 않도록 try catch로 핸들링을 해야 한다.
        }
        int sum = 0;
        for (int i = a ; i<=b ; i++) {
            sum += i;
        }
        return sum;
    }
}


