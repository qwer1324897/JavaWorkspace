public class P3 {
    public static void main(String[] args) {
        
        // 문자열 (!기본 타입 아님!)

        String a = "Hi, There!";

        System.out.println(a);

        // 이때 특수문자를 출력하고 싶을땐 역슬래쉬 \ 를 쓰면 되고, 역슬래쉬를 출력하고 싶을땐(파일위치 등) \\ 이렇게 두 번 쓴다.

        String b = "안녕하세요\n반갑습니다.";

        System.out.println(b);

        // 이렇게 \n 을 쓰면 줄바꿈이 되고,

        String c = """
                안녕하세요
                반갑습니다
                """;

        System.out.println(c);

        // 이렇게도 쓸 수 있으나, 최근에 나온 문법이라 예전 자바버전으로 빌드된 프로젝트는 사용 못하므로, \n을 사용하는 걸 습관하하자.






    }

}
