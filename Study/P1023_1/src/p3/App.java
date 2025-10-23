package p3;

public class App {
    public static void main(String[] args) {
        /* Wrapper 클래스 : 기본타입을 보조하는 클래스
         * 편하게 사용 가능하지만, 사용시 주의.(연산만 하지 말 것. 아주 약간(?)은 가능)
         */

        int a = 10;
        Integer b = 20; // 이거 말이 안 된다. 일단 기본타입도 아닌데 쌩 정수값을 넣어버리고, new로 선언도 안 했다.
                        // 이건 String처럼 특수한 Wrapper 클래스다. heap메모리에 저장하고 그 주소값을 할당하는 것.
                        // 이걸 개념적으로 boxing 이라 한다.
        int c = b;      // 이것도 말도 안 된다. b를 어떻게 int c 기본에다가 넣냐? 특수한 wrapper 클래스라 허용을 해놓은 것. like String
                        // 이걸 개념적으로 unboxing 이라 한다.
        // 그냥 Integer int 편하게 쓰라고 상호보완적으로 넣어놓은 것.

        Integer qq = 10;
        qq = qq + 20;   // 단, 이렇게 진짜 int 취급을 해서 연산을 해버리면 문제가 된다.
        // 계속 메모리가 생성되고 소멸하기 때문에 cpu 부하가 걸린다.
        // 물론 요즘 cpu가 좋아서 이 정도는 괜찮은데, for문같은거로 반복돌려버리면 진짜 문제가 된다. 

        // Wrapper 클래스는 기본타입 8개. short byte int long double boolean char float 이거 8개 다 된다.

        
        // Wrapper 클래스의 장점은 기본타입처럼 맘대로 쓸 수 있는데, 참조타입이라 null값도 넣어지고, 심지어 api도 바로 사용 가능하다.
        qq.intValue(); // 이런식으로. 개꿀이다.
    }
}
