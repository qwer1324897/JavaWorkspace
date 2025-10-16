package p4;

public class App {
    public static void main(String[] args) {
        Test t1 = new Test();   // App은 Test를 의존(디펜던스)한다. 역은 성립하지 않는다. 의존은 단방향.
        t1.test1();;
    }
}   


class Test {
    private static int c;
    private int b;

    public void test1(AAA a){

    }
    private static void test2(){}
}


class AAA {
    BBB b = new BBB();

    public void aaa() {
        BBB b = new BBB();
    }
}

class BBB {

}

class CCC {
    
}