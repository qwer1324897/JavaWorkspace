package p2;

public class App {
    public static void main(String[] args) {
        // String은 불변객체. 즉, 한 번 세팅되면 그 메모리는 값이 변하지 않는다.
        // 값을 변경시키는 메서드 혹은 그 기능을 하는 연산자 수행 시, 새로운 메모리를 생성시킨다.
        // 이러한 연유로 String + 연사은 많이 발생했을 시에 퍼포먼스에 영향을 준다.

        String text = "hi";

        long time = System.currentTimeMillis(); // 1970년 1월 1일 0시 0분 0초 000ms 부터 지금까지
        // System.out.println(time/1000/60/60/24/365.25); 이렇게 하면 1970년부터 현재 연도가 대충 나온다

        for (int i = 0 ; i < 100 ; i ++) {
            text += "there!!";
        }

        System.out.println("첫 번째: " + (System.currentTimeMillis() - time) + "ms");
        System.out.println(text);

        // 그래서 나온 API가 StringBuilder, StringBuffer
        // buffur 는 여유공간. 배열같이 자리를 여러개 만들고 값을 앞부터 담으면 남는 배열들이 buffer다.
        // 그래서 버퍼링은 buffer을 만들고 있는 중 뭐 이런 뜻이다.                                    
        // StringBuilder strignbuiler = "안녕하세요";  이거 안 된다. String하고 wrapper 클래스 제와하면 반드시 new로 생성해줘야 사용 가능

        StringBuilder stringbuilder = new StringBuilder(1000);
        stringbuilder.append("hi");
        for (int i = 0 ; i < 100 ; i ++) {
            stringbuilder.append("there!!");
        }
        String resultTexxt = stringbuilder.toString();

        System.out.println("첫 번째: " + (System.currentTimeMillis() - time) + "ms");
        System.out.println(resultTexxt);
        


    }
}

/*
 * 
 */