public class P7 {
    public static void main(String[] args) {
        Worker w1 = new Worker("철수");
        Worker w2 = new Worker("영희");

        w1.test1();     // 메서드 호출 문법

        w2.test2(-3, -1);

        int aaa = w2.test2(5,7);
        System.out.println("aaa=" + aaa);
        System.out.println("프로그램 종료");
    }
}

class Worker {
    // 속성(필드)

    String name;
    int money;

    // 생성자

    Worker(String name) {
        this.name = name;
    }

    // 기능 - 메서드  주로 메서드의 변수명은 동사로 쓰고, 카멜케이스(소문자로 시작, 띄어쓰기 대문자로 표기)로 쓴다.



    void test1() {      // 메서드 정의 문법  void는 호출타입이라서 단독으로 이렇게 써도 된다.
        // 실행될 코드. 여기는 모든 코드가 다 가능하다. 논리코드, 알고리즘, if문 for문 등등
        System.out.println("test1 호출됨");
    }
    int test2(int a, int b) {      
    // int, String 같은 타입은 리턴타입. 리턴타입은 반환할 값을 선언을 해주어야 한다. 무조건 리턴을 해줘야 하고, 리턴을 하는 즉시 코드가 종료된다. return 밑에 코드를 작성하면 오류가 뜬다.

    if(a < 0 || b < 0) {
        System.out.println("음수는 허용되지 않습니다");
        return -1;
    }
    System.out.println("test2 호출됨");
    return a + b;
    }

    void test3(String text) {
        if(text.contains("바보")) {
            System.out.println("비속어 출력 불가");
            return;
        }
    }

    void test3() {     // 메서드는 파라미터가 다르면 이름이 같아도 상관 없다. 

    }
}