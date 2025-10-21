package p4;

public class App {
    public static void main(String[] args) {
        // 하루 일과 프로그램
    }
}

class Controller {
    private Service service = new Service();

    public void run() {
        System.out.println("하루 일과를 시작합니다.");
        service.wakeUp();
        service.eat();
    }
}

class Service {
    public void wakeUp() {
        System.out.println("일어납니다.");
    }
    public void eat() {
        System.out.println("먹습니다.");
    }
}

// 이렇게 짜면 Service에 새로운 기능을 넣거나 로직을 수정할 때마다 컨트롤러에 매번 메서드를 넣어주고 수정해줘야 한다.
// 이거를 분리해서 짜보면, > 5번 패키지로