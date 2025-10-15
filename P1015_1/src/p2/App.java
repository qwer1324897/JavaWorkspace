package p2;

public class App {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.plus(0, 0);      // 0, 0 값을 Test 클래스의 plus 메서드에 넣고, 메서드의 코드 결과값을 반환한다.
                            // 따라서 이렇게만 쓰면 그냥 값만 받는거고 그 받은값을 활용을 못 한 거기 때문에
        int z = t1.plus(0, 0);      // 이렇게 test클래스의 plus메서드로부터 반환된 값을 z에 넣는다.
    }
}

class Test {
    int a;
    int b;

    int plus(int c, int d) {
        if(a < 0) return -1;

        int result = a + b + c + d;     // 여기서 a, b는 this.a this.b 다. c,c는 외부에서 받은 값이고, a,b는 클래스 내의 값이다. 항상 인지할 것
        return result;  
    }
}