public class P6 {
    public static void main(String[] args) {
        
        // 문자열 연산.  자바는 + 만 지원한다
    {
        String a = "안녕하세요";
        String b = "반갑습니다";
        String c = a + b;

        System.out.println(c);
    }
        // 이 경우 출력하면 안녕하세요반갑습니다 가 출력된다. 자주 쓴다.

    {
        int a = 10;
        int b = 30;
        String c = "Hi!";

        String result = c + b + a ;

        System.out.println(result); // 이 경우 출력해보면 Hi!3010이 된다. 자바에선 String 안의 변수값이 정수일경우 문자열로 전환해서 계산한다.
        
                                    // 이때 String result의 변수값들을 덧셈이 아닌 곱셈(*)으로 연산하면 문법오류가 난다.
                                    // 자바는 문자열 덧셈만 가능해서.
    }
    }

}
