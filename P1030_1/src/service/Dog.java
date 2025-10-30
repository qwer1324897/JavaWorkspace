package service;

public class Dog extends Animal {
    
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + "가 멍멍 짖습니다!");
    }

    @Override
    public void move() {
        System.out.println(name + "가 달립니다.");
    }

    @Override
    public void sleep() {
        System.out.println(" ... 꼬리를 흔들며.");
    }



}
