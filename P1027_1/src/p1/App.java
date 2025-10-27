package p1;


public class App {
    public static void main(String[] args) {
        // 제너릭
        // 클래스에서 변수를 선언할 때, 타입이 미정일 경우 활용. 나중가면 프레임워크가 알아서 해준다.

        StudentDto<String, Integer> dto = new StudentDto<>();
        dto.name = 20;

        // new 뒤에 있는 제너릭은 생략 가능하다.
        StudentDto<Integer, String> dto2 = new StudentDto<>();
        dto2.age = "20";
    }
}

class StudentDto<N, T> {
    T name;
    T age;
    T score;
}

// 사실 이 문법은 99% 안 쓰인다.
// 정말 가끔 쓰이는데, 그 때가 바로 자료구조.