package p2;

public class App {
    public static void main(String[] args) {
        // String API
        // API를 쓰고 마우스를 올렸을 때, 리턴 타입에 따라 활용하는 게 다르다.
        // 가령,

        String str1 = "aaa, bbb, ccc";
        str1.toUpperCase();     // 이 경우 마우스를 올려보면 리턴타입이 String이다.
        // String을 받았으니까 리턴값을 새로 변수에 할당해줘야 활용이 가능하다.
        String str2 = str1.toUpperCase();
        System.out.println(str2);   // 이렇게 해야 의도한 기능을 구현하는 것.
        
        // 리턴타입이 void일 수도, string일 수도, boolean일 수도 있다.
        // 결론은 리턴타입을 항상 확인하자. 그냥 API는 리턴타입부터 봐라.

        // split() api 는 () 안의 문자열을 기준으로 분리해서 '배열로 리턴한다'
        str2.split(",");  // 이렇게하면 AAA BBB CCC 배열로 리턴하는거고, 이걸 받아야 의미가 있으니까
        String[] arr = str2.split(",");     // 이렇게 쓴다.

        "qwer".startsWith("qw");  // qw로 시작하냐? > 불리언 리턴이니까 if문에 사용.

        "qwerewq".substring(3);  // 이러면 0번째~3번째 즉, qwer을 의미하고, 당연히 값을 받아줘야한다.

        int result = "qwerewq".indexOf("q"); 
        System.out.println(result);
        
        ////////////////////////////////////////////////////////////////
        
        int a = 10;  // 이 정수값을 문자열로 반환하는 API
        String.valueOf(a);  // 당연히 String 변수로 값 반환 받아야 쓸 수 있다.

        int b = 20;
        String str3 = a + "X" + b + "=" + a*b;   // 이렇게 쓰면 길어질 때 가독성 너무 떨어진다.
        String.format("%d 곱하기 %d 는%d 입니다.", a,b,a*b);    // 이것도 역시 리턴 받아줘야 쓸 수 있다.
        str3 = String.format("%d 곱하기 %d 는%d 입니다.", a,b,a*b);    // 이런 API도 있다. 알아만 둬라. 어차피 나중가면 다르게 쓴다.




    }
}
