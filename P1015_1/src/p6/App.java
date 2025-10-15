package p6;

public class App {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        t1.a = 10;
        t2.a = 20;

        t1.c = 10;
        t2.c = 20;

        System.out.println(t1.c);
        System.out.println(t2.c);

        // 이거 출력하면 10, 20이 아니라 20 20이 출력된다. static 메모리기 때문에.
        // 또한 c는 처음부터 존재하기 때문에 굳이 인스턴스 변수를 생성하기 위해 Test t1 = new Test();
        // 이렇게 쓸 필요 없이 그냥 바로 맨 위에다가
        // Test.c = 10; 이런식으로 원래 있던 변수마냥 쓸 수 있다.
    }
}

class Test {
    int a;  // 인스턴스 변수
    int b;  // 인스턴스 변수
    static int c;   // 클래스 변수 - static을 붙이면 '인스턴스 생성과 관계없이' 처음부터 존재했다고 생각하면 된다. 또한 소멸되지 않는다.

}