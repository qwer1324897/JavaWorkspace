package p2;

public class App {
    public static void main(String[] args) {
        // 클래스 설계 원칙
        // 캡슐화(정보의 은닉), 응집도를 높인다.
        
        // SOLID
        // SRP - 단일 책임 원칙
        // 1개의 클래스는 추상화 레벨에 맞는 1개의 역할만, 1개의 메서드는 추상화 레벨에 맞는 1개의 기능만 해야 한다. 즉, 이름이 중요.
        // 1개의 메서드가 3줄 이상이면 의심해보자
    }
}

class Sumcalculator {

    public void showResult() {
        int result = calculate();
        printResult(result);
    }

    private void printResult(int result) {
        System.out.println("결과: " + result);
    }

    private int calculate() {
        int sum = 0;
        for(int i = 1 ; i < 10 ; i++) {
            if(!isMultipleOfThree(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private boolean isMultipleOfThree(int number) {
        return number%3==0;
    }
}