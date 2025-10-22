package p2;

public class App {
    public static void main(String[] args) {
        BBB bbb = (a) -> {System.out.println(a); };    // -> {원하는 명령;}; 람다식 사용 문법
                                                       // 근데 이걸 한 줄일경우,(람다식은 대부분 한 줄) -> 원하는 명령; 이렇게 표현할 수 있다.

        bbb.test(3);
    }
}

interface BBB {
    public void test(int a) ;    
}

class Some implements BBB {
    public void test(int a) {
        System.out.println(a);
    }
}