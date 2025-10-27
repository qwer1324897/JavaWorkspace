package p1;

public class App {
    public static void main(String[] args) {
        // Wrapper 클래스

        // 많은 개발자들이 숫자를 다룰 때
        int a = 10;  // 이거보다
        
        Integer b = 20;  // 이렇게 쓴다. 

        int c = Integer.parseInt("333");   // 이건 엄청 많이 쓰인다. 문자열을 숫자로 변환

        Integer.toBinaryString(1091);   // 이진수 변경 API
        Integer.toHexString(13508); // 16진수 "

        String result = 10 + "";
        String result2 = String.valueOf(20);
        String result3 = Integer.toString(30);
        // 문자열에 숫자를 담는 방법.

        
        
    }
}
