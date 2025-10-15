package p4;

public class App {
    public static void main(String[] args) {
        SumCalc1 sc1 = new SumCalc1();
        int result1 = sc1.sum(1, 10);
        // 이 result1 값은 값을 계속 저장한다. 즉, 다회용으로 사용

        int result2 = new SumCalc2(1, 10).getResult();
        // 이렇게 코드를 짜면 생성하자마자 바로 소멸되기 때문에 1회용으로 사용한다.
    }
}

class SumCalc1 {
    int sum(int s, int e) {
        int sum = 0;
        for(int i = s ; i <= e ; i++) {
            sum += i;
        }
        return sum;
    }
}

class SumCalc2 {
    int sum = 0;

    SumCalc2(int start, int end) {
        for(int i = start ; i <= end ; i++) {
            sum += i;
        }
    }
    

}