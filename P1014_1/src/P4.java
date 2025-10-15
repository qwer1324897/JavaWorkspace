public class P4 {
    public static void main(String[] args) {
        StudentDto3 s1 = new StudentDto3();     // s1 이라는 변수에 StudentDto3라는 인스턴스 메모리를 생성.

        s1.name = "홍길동";     // 이거는 문제 없다.

        s1.additionalInfo.gender = "남";    // 이건 안 된다. StudentDto3 인스턴스 메모리는 생성됐지만, additionalInfo의 인스턴스 메모리까지 연쇄적으로 생성해주지 않기 때문에,

        s1.additionalInfo = new AdditionalInfo();   // 이렇게 먼저 선언을 해줘야(엮어줘야) additinoalInfo의 인스턴스 메모리가 생성된다. 

    }
}

class StudentDto3{
    String name;
    int age;
    int score;   
    AdditionalInfo additionalInfo;  // << 이렇게 클래스에 클래스를 엮어서 쓸 수 있고, 코딩할땐 다 이렇게 쓴다.
}

class AdditionalInfo{
    String gender;
    String birth;
}