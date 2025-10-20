package p5;

public class App {
    public static void main(String[] args) {
        
        // interface -  추상화의 끝

        AAA aaa;
    }
}
/**
 * 인터페이스는 인스턴트 변수 생성이 되지 않는다.
 * AAA aaa = new AAA(); 이거 안 된다.
 * 
 * 추상화 메서드(abstract)만 생성 가능.
 * 애초에 디폴트값이 public abstract 다.
 *  
 *  public abstract void test1();
    public void test2();
    void text3();

    이거 3개 다 같다. public은 관행상 붙이기도 한다.
 */

interface AAA {
    void test();
    public void foo();
    
    // 추가내용 (중요하지 않음)

    default void yyyy(){}
    // 이렇게 상속에서의 final처럼 default를 붙이면 abstract가 안 붙은(오버라이딩을 해도되고 안해도 되는) 것처럼 쓸 수 있다.
    // 원래 인터페이스는 abstract가 강제되는데 편의를 위해 예외로 풀어둔 것.
    // 별로 중요하진 않다.

    int SOME_VALUE = 10;
    // 인터페이스는 인스턴트 변수 생성 안 되는데 이것도 되는 이유가 디폴트값이 public static final 이기 때문에 이게 가능하다.
    public static final int a = 10; // 이렇게. 이거랑 같은거다. 별로 중요하진 않음.

    public static void qqqq() {}
    // 이거는 static 이라 가능. 자식 클래스에서 오버라이딩 불가.
    // 이것도 별로 중요하진 않다.
}

class QWER implements AAA {    // AAA(인터페이스)를 implements(구현한) 클래스니까 메서드가 당연히 생성되어 있어야 한다.
    public void test() {
    }
    public void foo() {
    }
}