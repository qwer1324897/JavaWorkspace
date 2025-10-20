package prac;

public class App {
    public static void main(String[] args) {

        Animal[] animals = new Animal[4];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Monkey();
        animals[3] = new Horse();
        
        for(Animal animal : animals) {
            animal.legsCount();
            animal.sound();
            animal.sizeThanPeople();
            animal.animalSpecies();
        }
    }
}

abstract class Animal {
    int legsCount;
    String sound;
    String sizeThanPeople;

    abstract void legsCount();
    abstract void sound();
    abstract void sizeThanPeople();

    final void animalSpecies(){
        System.out.println("종은 포유류 입니다.\n");
    }
}

class Dog extends Animal {
    Dog () {
        this.sound = "멍멍";
        this.legsCount = 4;
        this.sizeThanPeople = "작습니다.";
    }
    void legsCount() {
        System.out.println("\n강아지 다리의 개수는 " + this.legsCount + "개,");
    }
    void sound() {
        System.out.println("울음 소리는 '" + this.sound + "'이며,");
    }
    void sizeThanPeople () {
        System.out.println("크기는 사람보다 " + this.sizeThanPeople );
    }
    
}

class Cat extends Animal {
    Cat () {
        this.sound = "냐옹";
        this.legsCount = 4;
        this.sizeThanPeople = "작습니다.";
    }
    void legsCount() {
        System.out.println("고양이 다리의 개수는 " + this.legsCount + "개,");
    }
    void sound() {
        System.out.println("울음 소리는 '" + this.sound + "'이며,");
    }
    void sizeThanPeople () {
        System.out.println("크기는 사람보다 " + this.sizeThanPeople );
    }
}

class Monkey extends Animal {
    Monkey () {
        this.legsCount = 2;
        this.sound = "우끼익 우끼끼익";
        this.sizeThanPeople = "작습니다.";
    }

    void legsCount() {
        System.out.println("원숭이 다리의 개수는 " + this.legsCount + "개,");
    }
    void sound() {
        System.out.println("울음 소리는 '" + this.sound + "'이며,");
    }
    void sizeThanPeople () {
        System.out.println("크기는 사람보다 " + this.sizeThanPeople );
    }
}

class Horse extends Animal {
    Horse () {
        this.legsCount = 5;
        this.sound = "이히히히히히힝";
        this.sizeThanPeople = "큽니다.";
    }
        void legsCount() {
        System.out.println("말의 다리 개수는 " + this.legsCount + "개,");
    }
    void sound() {
        System.out.println("울음 소리는 '" + this.sound + "'이며,");
    }
    void sizeThanPeople () {
        System.out.println("크기는 사람보다 " + this.sizeThanPeople );
    }
}
