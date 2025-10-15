public class P5 {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;

        if(a==b) {
            // 위 코드는 true다.
        }

        String s1 = "안녕하세요";
        String s2 = "안녕하세요";

        if(s1 == s2) {
            // 자바는 문자열은 == 으로 비교하면 안됨. String 값이 기본변수가 아니라서 heap에 새로 생성돼서 저장되기 때문에? 책에 나와있다.
            // 위의 코드를 실행시키면 false로 나온다.
        }

        if(s1.equals(s2)) {
            // 이런식으로 문자열은 equals 메서드로 비교해야함 (위는 API다)
        }
    }
}
