package service;

public abstract class Animal {
    
    protected String name;

    public Animal(String name) {
        this.name = name;
    }


    public abstract void makeSound();

    public abstract void move();

    public void sleep() {
        System.out.println(name + "가 잠을 잡니다.");
    }


    public String toString() {
        return "Animal(이름: " + name + ")";
    }
}


