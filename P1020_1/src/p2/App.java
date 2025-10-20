package p2;

public class App {
    public static void main(String[] args) {
        /** 
         * 다형성 */
        AAA a1 = new AAA();
        BBB b1 = new BBB();
        AAA b2 = new BBB();    // 이게 가능하다. 이게 다형성. BBB a1 = new AAA(); 이건 안 된다. 부모가 자식타입은 가질 수 있어도, 자식이 부모의 타입을 가질 순 없다.
        // 특정 타입(AAA)의 변수는 특정타입(AAA)을 상속받는 모든 형태의 타입을 변수로 만들 수 있다.

        b2.a1 = 10; // 그러나 문법적으로 b2는 타입이 AAA
        // b2.testB(); // 따라서 이것도 안 된다. 그래서 지금으로서는 사실상 의미가 없다.

        // 추가 (중요하지 않음)
        if(b2 instanceof BBB) {
            BBB tempB = (BBB)b2; // 캐스팅 가능. 상속 관계일 경우에만.
            tempB.testB();
        }

    }
}

class AAA {
    int a1;
    int a2;

}

class BBB extends AAA {
    int b1;
    int b2;

    void testB() {

    }
}

