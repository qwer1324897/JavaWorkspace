public class P4 {
    public static void main(String[] args) {
        
        // 실수 타입: float, double(실제 사용)  두 개는 정밀도 차이. double이 더 정밀하게 값을 담는다.
        // 사실상 연산을 위해서라면, int 나 long으로 변환해서 연산해야한다.


        // double a = 10.3;   이런 식으로 실수를 변수로 선언할 수 있다.
        // float b = 10.3;   << 타입 미스매치 오류   float b = 10.3f;   << 이렇게 써야함

        // double   64bit = 8byte
        // float   32bit = 4byte

        double c = 0.123456789123456789;
        float d = 0.123456789123456789f;

        System.out.println(c);
        System.out.println(d);  // 출력해보면  float은 근사값이라 잘린다.

        
        // 실수 리터럴

        double e = 0.00000003;   // 이런 숫자를 쓰게 될 경우, 가독성이 떨어지기 때문에 지수로 표현할 수 있다.
        e = 3e-7;   // 이런 식으로.

        System.out.println(e);

    }
}
