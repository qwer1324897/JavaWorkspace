package p7;

public class App {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.a = 10;
        t1.d = 10;  // d는 메모리는 생성 됐지만 private이라서 외부에서 호출할 수 없다.
        
    }
}

// 접근 제한자 - 캡슐화, 정보의 은닉
class Test {
    public int a;   // 중요
    private int d;  // 중요  - 여기서 d는 Test 내부에서만 쓸 수 있다.

    void qqqq() {
        this.a = 10;
        this.d = 20;    // 여기서 Test 내부이기 때문에 사용 가능하다.
    }
    protected int b;
    int c;

}