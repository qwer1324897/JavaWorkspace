package p3;

public class App {
    public static void main(String[] args) {
        // 오버라이딩(재정의)
        
        AAA aaa = new BBB();
        aaa.test(); 
        // 위의 경우, 다형성으로인해 허용된다. 또한 aaa는 문법적으론 AAA 를 따라가지만, 런티암시에는 BBB를 따라간다.
        // 따라서 aaa.test() 가 실행될 때 하단의 AAA를 상속받은 BBB클래스에서 오버라이딩으로 재정의한 test가 실행된다.  
        // 만약 BBB에서 오버라이딩으로 재정의를 하지 않았으면, AAA클래스에 있는 test() 가 실행된다.
        // 이게 부모 클래스로부터 결합을 낮추는 방법. 부모 클래스에 모든 경우의수를 다 몰아 넣는게 아니라,
        // 높은 추상화레벨로 비슷한 클래스들끼리의 틀만 잡고, 스페시픽한 부분은 자식의 클래스들에서 오버라이딩으로 재정의를 하는 것.
    }
}

class AAA {

    void test() {
        System.out.println("AAA의 test 호출됨");
    }
}

class BBB extends AAA {
    // 이게 오버라이딩. 메서드를 재정의 - 상속받은 메서드의 형태 그대로 재정의한다.
    void test() {
        
    }
}