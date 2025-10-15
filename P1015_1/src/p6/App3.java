package p6;

public class App3 {
    public static void main(String[] args) {
        Test.a = 10;
        Test.b = 20;    // 원래 이렇게 안 된다. 알지? 원래는 위에 Test 변수 = new Test(); 써야지 쓸 수 있다.
        Test.qqqq();
    }
}

class Test {
    int c;
    static int a;
    static int b;
    
    static void qqqq() {
        c = 40;     // 여기서 static 메서드는 인스턴스 없이 호출되기 때문에, 인스턴스 변수(c)를 직접 접근할 수 없다.
        a = 20;
    }
    
    void qwer() {
        c = 30;     // 반면 여기에는 가능하다. 왜? 정상적으로 인스턴트 변수가 생성되었기 때문에 c를 사용할 수 있다.
        a = 20;
    }
}