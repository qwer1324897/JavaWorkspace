package p11;

// final

public class App {
    public static void main(String[] args) {
        final String database = ("211.112.332.134");    // 이렇게 고정된 ip값으로만 뭔가 코드를 짜야할 때, final을 붙이면 상수로서 바뀌지 않는다. 뒤에다가 추가로 선언해도 안 된다.
        database = ("233");     // 이렇게 안 된다.

        String local = ("seoul");
        local = ("busan");      // 이건 되잖여? final 붙이면? 상수로서 정해졌기 때문에 안 된다.
    }
}

