package p3;

public class App {
    public static void main(String[] args) {
        // 예외 처리 문법 try catch. - 정말 중요한 문법. 프로그램 안정성 확보.
        // 그러나, 기능 구현(기본 실력)이 가능해야, 의미가 있기 때문에...
        // 먼저 기능구현부터 할 줄 아는 게 중요하다.

        // System.out.println("시작");

        // int a = 10;
        // int b = 0;

        // System.out.println(a/b);    이 경우, 컴파일 오류는 없지만(빨간 밑줄) runtime error 가 뜬다.

        // System.out.println("종료");

        System.out.println("정상적으로 시작");

        int a = 10;
        int b = 0;

        try {
            System.out.println("logic 1");
            System.out.println(a/b);    // 여기서 Exception이 발생하면, catch {} 안쪽의 코드 실행. 이후 나머지 코드 정상적으로 실행.
            System.out.println("logic 2");
        } catch (Exception exception) {
            System.out.println("에러가 났지만, 프로그램이 뻗어버리지는 않습니다.");
        }

        System.out.println("정상적으로 종료");
    }
}
