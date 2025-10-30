package service;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + "가 야옹~ 하고 웁니다.");
    }

    @Override
    public void move() {
        System.out.println(name + "가 뛰어갑니다.");
    }

    @Override
    public void sleep() {
        System.out.println(" ... 그르릉 소리를 내며.");
    }

}
