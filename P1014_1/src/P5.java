public class P5 {
    public static void main(String[] args) {

        int a = 10;     // *1* 이렇게 main안에서 선언한 변수를 클래스에서도 사용하고 싶으면

        System.out.println("프로그램 시작");
        System.out.println("인스턴스 생성 전");
        Student1 s1 = new Student1(a);     // s1이라는 변수.(첫번째 학생)에게 인스턴스 메모리를 생성한 것.  *3* 이렇게 생성자에 a값(10)(아규먼트)을 넘겨줄 수 있다
                                          // 인스턴스 메모리가 생성되면, 해당 클래스의 생성자가 호출된다. 출력을 해보자
        System.out.println("인스턴스 생성 후");
        s1.name = "철수";
        s1.age = 20;
        s1.score = 70;      // s1이라는 변수(첫 번째 학생)의 인스턴스 메모리에 값을 지정했다.


        Student1 s2 = new Student1(10);     // s2라는 변수(두 번째 학생)에게 클래스에 해당하는 인스턴스 메모리를 생성.
                                          // 마찬가지로 인스턴스 메모리가 생성되면, 해당 클래스의 생성자가 호출된다. 출력을 해보자

        s2.name = "영희";
        s2.age = 10;
        s2.score = 80;      // s2라는 변수(두 번째 학생)에게 값을 지정.
        System.out.println("프로그램 종료");
    }
}

class Student1 {
    // 속성(필드), 멤버변수, 인스턴스 변수
    String name;
    int age;
    int score;

    // 생성자 - 일반적으로는 초기화 목적
    Student1(int b) {    // *2* 이렇게 매게변수(파라미터)를 선언할 수 있다 *4* 여기서 생성자가 실행될 때 int b (아규먼트)값은 10이다
        // 인스턴스 메모리가 생성될 때 실행되는 코드 부분
        System.out.println(b);
        

    }
}
