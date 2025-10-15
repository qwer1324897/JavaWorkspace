public class P6 {
    public static void main(String[] args) {

        // P5의 코드를 깔끔하게 정리해서 값을 할당하게 코드를 짜보면,

        System.out.println("프로그램 시작");

        Student2 s1 = new Student2("철수",20,70);    
        Student2 s2 = new Student2("영희",10,80);     
        Student2 s3 = new Student2("길동",15);      // *1* 이렇게 길동의 score 부분은 공란으로 남기고 싶을때,
                                                   // *1* ("길동",15,0) 이렇게 넣으면 안된다. 클래스는 개발자의 의도, 가독성이 전부이기 때문에
   
        System.out.println(s1.name);
        System.out.println(s2.name);     
        System.out.println(s3.name);               // 위에서 아규먼트를 다 넣었기 때문에 P5 코드처럼 잘 출력된다.

        System.out.println("프로그램 종료");
    }
}

class Student2 {
    // 속성(필드), 멤버변수, 인스턴스 변수
    String name;
    int age;
    int score;


    // 생성자 - 일반적으로는 초기화 목적
    // 인스턴스 생성시에만 딱 1회 호출된다.
    Student2(String name, int age, int score) {   
        System.out.println("매개변수 3개짜리 호출 됨");
        this.name = name;
        this.age = age;
        this.score = score;   
    }

    Student2(String name, int age) {        // *1* 이렇게 생성자를 하나 더 생성해서 2개값만 파라미터를 넣어놓아서 해결한다.
        System.out.println("매개변수 2개짜리 호출 됨");
        this.name = name;
        this.age = age;
    }

    Student2() {}       // *1* 이렇게 생성자를 생성만 해놓아서 매개변수 0개짜리로 해놓는 경우도 있다. 실제 코드 짜다보면.
}

