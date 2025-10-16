package p5;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person();
    }
}

class Person {
    Eye left = new Eye();
    Eye rigEye = new Eye();
    Car car;

    // 의존 주입(Dependency Injection, DI) 코드(생성자 주입)
    Person(Car car) {
        this.car = car;
    }

    // 의존 주입(Dependency Injection, DI) 코드(생성자 주입)
    void setCar(Car car) {
        this.car = car;
    }
}

class Eye {

}

class Car {

}