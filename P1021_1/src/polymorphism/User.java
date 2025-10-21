package polymorphism;

public class User {

    public void watchTV() {
        System.out.println("사용자의 티비 시청 시작");
        TV tv = new SamsungTV();
        tv.powerOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.powerOff();
        System.out.println("사용자의 티비 시청 끝");
    
        // 인터페이스 없이 용어를 삼성tv 따로 lgtv 따로 짜버리면(ex. powerOn, turnOn 이런식으로 같은 기능의 메서드명을 다르게) 삼성tv를 lgtv로 고칠때 저걸 싹 다 고쳐야된다.
        // 예시의 경우고, 만약에 어떤 어플에서 최적화된 길을 찾는 알고리즘을 쓰고 있는데 이걸 결합도를 높여서 앱에 적용해놓으면
        // 더 좋은 길 최적화 알고리즘이 개발되면, 이걸 다 뜯어고쳐야 된다.
    }
}
