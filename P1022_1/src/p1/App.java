package p1;

public class App {
    public static void main(String[] args) {
        // 람다식 - 현재 함수형 프로그래밍 기법의 주요 문법
        AAA a1 = new AAA() {
        public int test(int a, int b) {
            return a+b;
            }
        };
        int result = a1.test(10, 20);
        System.out.println(result);



    }
}

interface AAA {
    public int test(int a, int b);
}

class AAAImpl implements AAA {
    public int test(int a, int b) {
        return a + b;
    }
}