package p3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // 1번 (잘못된 예시)
        Calculator calculator = new Calculator();
        calculator.sumOnetoTenAndPrintResult();   

        // 이렇게 하면 이 한 줄만 읽어도 바로 이해가 가능하다. 이게 클래스의 의미
        // 그러나, 이 코드는 일반화(제네러레이션)이 안 된 코드다. 1~10까지만 더한 값을 출력하는 매우 한정된 코드다
        // 또한 클래스에서 출력까지 담당하고 있다. 역할 분리가 안 되어 있다.

        // ======================================================================== //

        // 2번

        System.out.print("두 숫자 사이의 총 합을 구할 두 숫자를 각각 입력하세요 > ");                                                    

        
        // 이렇게 일반화된 코드로 만들 수 있다.
        // 근데 이렇게 만들어보면 어떨까. 이 스캐너로 값 받고 출력하는것도 클래스를 분리해보는 거다.
        // p4 패키지로 가보자.



    }
}

class Calculator {

    // 1번
    void sumOnetoTenAndPrintResult() {
        // 1부터 10까지의 합
        int sum = 0;
        for(int i = 1 ; i <= 10 ; i++) {
            sum += i ;
        }
        System.out.println(sum);
    }
    // 1번 클래스의 문제가 뭘까. 출력을 담당하고 void로 사실상 강제한다는 것이다. 클래스는 이렇게 만들면 안 된다.


    // 2번
    int totalRangeSum(int start, int end) {
        // 입력받은 두 숫자 사이의 합
        int sum = 0;
        for(int i = start ; i <= end ; i++){
            sum += i ;
        }
        return sum;
    }
        // 이렇게 리턴타입으로 출력과 상호작용에는 관여하지 않는다. 이래서 리턴타입이 있는 것.
}

class IoManager {   // Io는 Input과 Output 줄임말이다.

    String input(String text) {
        Scanner scanner = new Scanner(System.in) ;
        String inputValue = scanner.nextLine();
        return inputValue;
    }
}

class InputManger {


    
    Scanner scanner = new Scanner(System.in);
    int inputStart = scanner.nextInt();
    int inputEnd = scanner.nextInt();          

    Calculator calculator2 = new Calculator();
    calculator2.totalRangeSum(inputStart, inputEnd);  
    int result = calculator2.totalRangeSum(inputStart, inputEnd) ;
    System.out.println(result);
    
}