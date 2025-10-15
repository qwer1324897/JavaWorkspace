package p9;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        IoManager ioManager = new IoManager();
        Calculator calculator = new Calculator();

        String value = ioManager.input("값 입력");
        ioManager.output("입력된 값 = " + value);

    }
}

class Calculator {

    int totalRangeSum(int start, int end) {
        // 입력받은 두 숫자 사이의 합
        int sum = 0;
        for(int i = start ; i <= end ; i++){
            sum = accumulate(sum, i);    // 이때 accumualte도 this.accumulate 다. 내부에서만 쓰기때문에. sum은 return값으로 외부에 반환해주기 때문에 그냥 sum 이다.
        }
        return sum;
    }
    int accumulate(int sum, int i) {
        sum += i;
        return sum;
    }
    // 이렇게 sum 값을 계속 totalRangeSum 에 리턴하면서 sum을 누적시키는 것 조차 분리할 수 있다.
}

class IoManager {   // Io는 Input과 Output 줄임말이다.

    // 속성(필드)
    Scanner scanner = new Scanner(System.in) ;
    // 여기다가 넣으면 계속 스캐너하는게 아니라 초기에만 한 번 스캐너된다.

    // 기능
    String input(String text) {
        System.out.println(text);

        String inputValue = scanner.nextLine();
        return inputValue;
    }
    void output(String text) {
        System.out.println(text);
    }
}

