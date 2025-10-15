public class P7 {
    public static void main(String[] args) {
        
        // 엄밀한 연산을 double로 하면 안 되는 이유 (귀찮을때나 적당히 할 때는 해도 됨)

    {
        int apple = 1;
        double piece = 0.1;
        int count = 7;

        double result = apple - (piece * count) ;
        System.out.println(result);
    }

        // 이 경우 계산하면 1 - 0.7 이니까 0.3이 나와야 하지만, 출력해보면 0.3이 안 나온다.
        // 실수는 근사값이기 때문이다. 그래서 적당히 반올림 하면 되거나 대충 할때는 double로 계산해도 되지만,
        // 세밀한 계산 시에는 정수로 계산한다.(double은 최소한으로 사용한다)
        // 어떻게? 10이나 100등 곱으로 정수로 변환해서 계산한다
    {
        int weight = 10;  // 정수 보정에 쓰이는 곱셈값.

        int apple = 1 * weight ;
        int piece = (int)(0.1 * weight) ;  // 여기도 정수값으로 계산하기 위해 리터럴에 (int)를 붙인다.
        int count = 7 ;
        int result = apple - (piece * count) ;

        double finalResult = result / (double)weight ;   // 결과는 실수값이 나와야 하므로 다시 실수로 전환
        System.out.println(finalResult) ;
    }
        // 이런식으로.



       

    }
}
