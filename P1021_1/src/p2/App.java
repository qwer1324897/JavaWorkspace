package p2;

public class App {
    public static void main(String[] args) {
        /* 자바문법의 interface = 클래스들간의 상호작용을 위한 표준
         * 입출력 담당 코드
         */
        int valueA = 40;
        int valueB = 70;
        /* 여기다가 먼저 짤 수 있다 */
        Calculator calculator = new CalculatorMock();  // 다형성. 나중에 진짜 CalculatorImpl이 개발되면, 여기서 CalculatorMock만 CalculatorImpl로 바꿔주면 끝.
        int result = calculator.sum(valueA, valueB);
        System.out.println(result);
    }
}


interface Calculator {
    public int sum(int a, int b);
}

/* 일을 나눠서 한다던가 할 때, 아래 클래스가 완성되어야 다음단계를 시작해야하지만, 인터페이스를 정의하고 아래처럼 가짜 클래스(mock)를 만들어서 먼저 시작할 수 있다. */

class CalculatorMock implements Calculator {
    public int sum(int a, int b) {
        return 70;
    }
}

class CalculatorImpl implements Calculator {
    public int sum(int a, int b) {
        int sum = 0;
        for(int i = a ; i <= b; i++){
            sum += i;
        }
        return sum;
    }
}
