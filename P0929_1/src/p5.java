public class p5 {
    public static void main(String[] args) {
        
        // 문자 타입(주의: 사실상 숫자 타입)
        // char 
        // 사실상 char은 일반적인 응용프로그램 기준으로 거의 안 쓴다.
        // String(문자열, 기본타입이 아니다.)을 실제로 사용
        
        char a = 'A';   // 쌍 따옴표가 아니다. 또한 한 글자만 가능.
        a = 68; //  이것도 가능하다. 하지만 출력하면 A가 65로 지정되어 있는 고유값이기 떄문에 D로 출력된다.

        // 만약 안녕하세요 를 출력하려면 5번 값을 지정해야한다. 따라서

        // String(!!!기본타입아님!!!) 을 사용한다. 따라서 대문자로 첫 글자를 기입.
        String b = "안녕하세요";


        












        System.out.println(b); 
        System.out.println(a);   
    }
}
