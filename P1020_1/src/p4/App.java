package p4;

public class App {
    public static void main(String[] args) {

        // 유닛은 scv, 마린, 탱크
        // 이 유닛들은 모두 작동 알고리즘이 다 다른데, 하나로 묶어서(부대지정해서) 공격 및 이동이 가능하다.
            
        Unit[] unitList = new Unit[6];
        unitList[0] = new Tank(); 
        unitList[1] = new Marine();
        unitList[2] = new Marine();
        unitList[3] = new Marine();
        unitList[4] = new SCV();
        unitList[5] = new SCV();

        for(Unit unit : unitList) {
            unit.move();
        }
        for(Unit unit : unitList) {
            unit.attack();
        }
        for(Unit unit : unitList) {
            unit.stop();
        }
        
    }
}

abstract class Unit {   // 이 유닛 클래스는 말 그래도 상속을 위한 클래스이기 때문에, main에서 생성하거나 하면 안되기 때문에, abstrack를 붙이면 이 클래스는 추상 클래스가 되며
                        // 문법적으로 생성(new Unit)이 불가능해진다. private과는 다르다. 또한 abstract는 상속을 강제하기 때문에
                        // 반드시 메서드 구현과 오버라이딩이 강제된다.
    int hp;
    int ap;
    int speed;

    abstract void move();
    abstract void attack();

    final void stop() {
        System.out.println("유닉의 로직으로 정지합니다.");
    }   // stop()같은 경우는 abstract가 안 붙었기 때문에 오버라이딩이 강제되진 않는다. + final을 붙여서 마지막임을 표시하기도 한다.
}


class Tank extends Unit {
    Tank() {
        this.hp = 100;
        this.ap = 20;
        this.speed = 10;
    }
    void move() {
        System.out.println("탱크만의 고유 로직으로 " + this.speed + "의 속도로 이동합니다");
    }
    void attack() {
        System.out.println("탱크만의 고유 로직으로 " + this.ap + "의 데미지로 공격합니다");
    }
}

class Marine extends Unit {
    Marine() {
        this.hp = 50;
        this.ap = 5;
        this.speed = 5;
    }
    void move() {
        System.out.println("마린만의 고유 로직으로 " + this.speed + "의 속도로 이동합니다");
    }
    void attack() {
        System.out.println("마린만의 고유 로직으로 " + this.ap + "의 데미지로 공격합니다");
    }
}

class SCV extends Unit {
    SCV() {
        this.hp = 30;
        this.ap = 1;
        this.speed = 1;
    }
    void move() {
        System.out.println("SCV만의 고유 로직으로 " + this.speed + "의 속도로 이동합니다");
    }
    void attack() {
        System.out.println("SCV만의 고유 로직으로 " + this.ap + "의 데미지로 공격합니다");
    }
}
