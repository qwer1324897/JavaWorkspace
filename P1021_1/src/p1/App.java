package p1;

public class App {
    public static void main(String[] args) {
        // 상속, 다형성, 오버라이딩 >> 인터페이스

        /** 인터페이스는 생성할 수 없다.
         * Flyable flyable = new Flyable();  << 이런거 안 된다.
         * 따라서 다형성으로 인터페이스를 상속받은 녀석을 생성한다. 아래처럼.
         */

        Walkable walker = new Duck();
        walker.walk();
        // walker.fly();   이건 안 된다. 문법은 타입을 따라가기 때문에 walker는 Walkable에 의존한다.

    }
}

interface Flyable {
    public abstract void fly();
}

interface Walkable {
    public void walk();  // interface에서 public과 abstract 말고는 다 안되기 때문에 기본값이라서, 생략해도 컴파일 오류 뜨지 않는다.
}

class Person implements Walkable {  
    public void walk() {
        System.out.println("사람의 로직으로 걷습니다.");
    }
} 

class Duck implements Flyable, Walkable {   // 자바에서 클래스의 상속(extends)은 부모가 둘 이상인 것이 불가능하지만, 인터페이스(implements)는 가능하다.
    public void fly() {
        System.out.println("오리의 로직으로 날아갑니다.");
    }
    public void walk() {
        System.out.println("사람의 로직으로 걷습니다.");
    }
}

