package p1;

public class App2 {
    public static void main(String[] args) {
        
    }
}


// 하기 클래스들은 전부 사람이네? 어 그럼 일반화(추상화 레벨을 높임) 해보자
class Person {
    String name;
    int age;
}

// ================================================================ //

class Student extends Person {
    // String name;
    // int age;
    int score;
}

class FireMan extends Person {
    // String name;
    // int age;
    int height;
}

class PoliceMan extends Person {
    // String name;
    // int age;
    int weight;
}
// 이렇게 여러개의 클래스들의 공통된 부분을, 높은 추상화레벨을 가진 하나의 클래스로 묶어서 코드를 압축할 수 있다. 사실 이게 주 목적은 아니다. 주 목적은 to be continue...