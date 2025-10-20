package p1;

public class App {
    public static void main(String[] args) {
        /**
         * 상속 - 다형성 - 오버라이딩 = 다형성
         * 문법 의도: 결합도를 낮춘다 => 컴포넌트를 조립식으로 만든다.
         * 
         * 결국 상속, 다형성, 오버라이딩은 인터페이스(자바의 꽃)를 위한 것이다.
         *  */ 

        AAA ref1 = new AAA();
        ref1.a1 = 10;

        BBB ref2 = new BBB();
        ref2.b1 = 10;
        ref2.a1 = 10;
        ref2.testA();   // 이렇게 AAA안에 있는 메서드도 호출가능.

        CCC ref3 = new CCC();
        ref3.a1 = 10;
        ref3.testA(); 
        ref3.c1 = 10;

        DDD ref4 = new DDD();
        ref4.a1 = 10;   // 이렇게 BBB에게 상속한 AAA까지도 연쇄적으로 사용 가능하다.
    }
}

class AAA {
    int a1;
    int a2;
    
    void testA() {

    }
}

class BBB extends AAA {  
    // 상속시키려면 이렇게 쓰면 된다. extends = 자바에선 확장한다는 뜻. 즉, AAA를 확장해서 BBB를 정의한다 라는 뜻. > BBB클래스는 AAA클래스를 확장해서 정의했기 때문에
    // BBB는 자식, AAA는 부모라고 한다. 즉 BBB bbb = new BBB(); 로 생성해도 AAA의 인스턴스 메모리까지 같이 생성된다.
    int b1;
    int b2;
}   
    // 정리하면 BBB는 AAA의 메모리들을 상속받아서 생성되었다. 따라서 BBB가 자식, AAA가 부모
    // 이때 부모는 하나만 상속할 수 있다. class BBB extends AAA,CCC  << 이런거 안된다. 나중에 이걸 해결하기위해 인터페이스에서는 가능하다. 

class CCC extends AAA {
    int c1;
    int c2;
}

class DDD extends BBB {
    int d1;
    int d2;
}