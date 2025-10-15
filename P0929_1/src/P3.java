public class P3 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // 기본 타입(Primitive type) 종류
        // 정수: byte, short, int, long
        
        // byte a = 10;
        // short a = 10;  << 불가능. 변수명은 같아도 리터럴은 달라야 한다.
        // short b = 10;
        // int c = 10;
        // long d = 10;

        // 이 4개는 정수만 입력 가능. 차이는 메모리의 크기가 다르다.

        // byte a = 10;   8bit = 1byte 
        // short b = 10;   16bit = 2byte
        // int c - 10;   32bit = 4byte
        // long d = 10;   64bit = 8byte

        // byte 는 비트가 8개. 즉, 경우의 수가 256.  따라서 byte a = 10000;  << 이건 문법 오류가 난다.
        // short 는 경우의 수: 65536
        // int 는 경우의 수 : 40억
        // long 은 경우의 수 : 2의 64승. 매우 큰 값.

        // 결론: 그냥 int를 쓴다. 성능 최적화가 중요하거나 특정 API가 요구하지 않는 한, 일반적인 개발 환경에서는 int를 쓴다.
        // 20억 이상의 값을 다룰 땐 long 사용. 연산의 기본 단위가 int 다.


        
        // 정수 리터럴 = 정수를 표현하는 문법적 방식

        // int e = 10;   // 여기서 10 에 해당   ("10")  << 이건 정수 리터럴이 아니라 문자열 리터럴
        
        // e = 10;
        // e = 0xA;   // 16진법으로 A = 10. 따라서 둘 다 10이다.

        // long f = 1000000000;   // 10억까지만 정수 리터럴 입력 가능 그 이상 입력하고 싶으면 L을 붙인다.
        // long f = 10000000000L;   // 이런식으로.

        



    }
}
