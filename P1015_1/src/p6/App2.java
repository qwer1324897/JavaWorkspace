package p6;

public class App2 {
    public static void main(String[] args) {
        Test.c = 10;
        Test t1 = new Test();
        t1.a = 10;

        new Ex().qqqq();  
    }
}


class Test {
    int a;  // 인스턴스 변수
    int b;  // 인스턴스 변수
    static int c;   // 클래스 변수 - static을 붙이면 '인스턴스 생성과 관계없이' 처음부터 존재했다고 생각하면 된다. 또한 소멸되지 않는다.

}

class Ex{
    void qqqq(){
        System.out.println(Test.c);    // 여기서 t1.a 넣어봐야 Ex클래스에서 받을 매개변수가 없기 때문에 컴파일 오류가 뜨지만 Test.c는 static 이라서 가능.
    }
}
