package p3;

public class App {
    public static void main(String[] args) {
        SomeComponent sc = SomeComponent.getInstance();
        sc.func();

        SomeComponent sc2 = SomeComponent.getInstance();
        sc2. func();
    }
}



/** 
 * 싱글톤
 * Component = 기능 위주의 클래스.  대부분의 경우 한 번만 생성하고 재활용 함
 * Dto, vo = 데이터 구조의 클래스.  많이, 자주 생성됨
*/

class SomeComponent{

    // 싱글톤 패턴 코드
    private static SomeComponent instance = null;

    public static SomeComponent getInstance() {
        if(instance == null) {
            instance = new SomeComponent() ;
        }
        return instance;
    }   // SomeComponent를 main에서 한 번만 호출하고 싶을때, 이렇게 간접적으로 getInstance로 접근하게 만들어서 생성하게 만든다.
        // 그 다음부터는 getInstance에 접근해도 instance가 null 값이 아니니까 생성을 못하게 막는다.

    private SomeComponent() {}

    // 실제 기능
    public void func() {
        System.out.println("기능이 실행됩니다.");
    }
}