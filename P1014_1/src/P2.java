public class P2 {
    public static void main(String[] args) {
        StudentDto s1 = new StudentDto();     // s1이라는 변수에 StudentDto라는 인스턴스 메모리를 생성
        StudentDto s2 = new StudentDto();

        s1.name = "홍길동";     // 이렇게 클래스에 선언한 인스턴스 변수에 접근해서 값을 정의한다
        s1.age = 20;
        s1.score = 70;

        s2.name = "철수";       
        s2.age = 30;
        s2.score = 80;      

    }
}

class StudentDto {   // Dto는 자료구조라는 뜻
    String name;
    int age;
    int score;
}
