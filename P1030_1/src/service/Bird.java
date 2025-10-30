package service;

public class Bird extends Animal{
   
    public Bird(String name) {
        super(name);
    }


    @Override
    public void makeSound() {
        System.out.println(name + "이 짹짹! 하고 지저귑니다.");
    }

    @Override
    public void move() {
        System.out.println(name + "이 날아갑니다.");
    }

    @Override
    public void sleep() {
        System.out.println(" ... 아무 소리도 내지 않으며.");
    }

    public void fly() {
        System.out.println(name + "이 날아갑니다!");
    }

}
