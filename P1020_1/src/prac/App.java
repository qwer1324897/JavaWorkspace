package prac;

public class App {
    public static void main(String[] args) {
        Animal Dog = new Dog();
        Animal Cat = new Cat();
        Animal Bird = new Bird();

        Dog.legsCount();
        Dog.sound();
        Dog.sizeThanPeople();
        Cat.legsCount();
        Cat.sound();
        Cat.sizeThanPeople();
        Bird.legsCount();
        Bird.sound();
        Bird.sizeThanPeople();
    }
}

abstract class Animal {
    int legsCount = 4;
    String sound;
    String sizeThanPeople = "작습니다.";

    abstract void legsCount();
    abstract void sound();
    final void sizeThanPeople() {
        System.out.println("크기는 사람보다 " + this.sizeThanPeople);
    }
}

class Dog extends Animal {
    String sound = "멍멍";

    void legsCount() {
        System.out.println("다리는 " + this.legsCount + "개 입니다.");
    }
    void sound() {
        System.out.println("울음 소리는 '" + this.sound + "'입니다.");
    }
}

class Cat extends Animal {
    String sound = "냐옹";

    void legsCount() {
        System.out.println("다리는 " + this.legsCount + "개 입니다.");
    }
    void sound() {
        System.out.println("울음 소리는 '" + this.sound + "'입니다.");
    }
}

class Bird extends Animal {
    int legsCount = 2;
    String sound = "짹짹";

    void legsCount() {
        System.out.println("다리는 " + this.legsCount + "개 입니다.");
    }
    void sound() {
        System.out.println("울음 소리는 '" + this.sound + "'입니다.");
    }
}
