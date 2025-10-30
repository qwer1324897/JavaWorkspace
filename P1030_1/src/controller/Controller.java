package controller;

import java.util.ArrayList;
import java.util.List;

import service.Animal;
import service.Bird;
import service.Cat;
import service.Dog;

public class Controller {
    
    public void run() {
        System.out.println("=== 동물원 관리 시스템: 행동 테스트 ===");
        List<Animal> animals = new ArrayList<>();

        animals.add(new Dog("누렁이"));
        animals.add(new Cat("검둥이"));
        animals.add(new Bird("공룡의 후손"));

        for (Animal animal : animals) {
            animal.makeSound();
            animal.move();
        
            if (animal instanceof Bird) {
                ((Bird) animal).fly();
            }
            System.out.println(animal);
            System.out.println();
        }
    }
}
