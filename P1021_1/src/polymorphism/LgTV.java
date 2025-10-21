package polymorphism;

public class LgTV implements TV{
    public void powerOn() {
        System.out.println("LG TV의 전원을 켭니다.");
    }
    public void powerOff() {
        System.out.println("LG TV의 전원을 켭니다.");
    }
    public void volumeUp() {
        System.out.println("LG TV의 볼륨을 올립니다.");
    }
    public void volumeDown() {
        System.out.println("LG TV의 볼륨을 내립니다.");
    }

}
