package p2;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        StudentDto s1 = new StudentDto();
        StudentDto s2 = new StudentDto();

        // 앞으로 배열을 만들 때는 이렇게 쓴다. List(자동완성 쓰면 import 알아서 됨)타입 선언하고, 꺽쇄 열고 사용할 class 쓰고, 변수 쓰고, new AraayList 쓴다.
        // 값 추가할 때는 변수.add 쓰면 알아서 배열 크기 늘려주면서 값을 넣는다.

        List<StudentDto> studentDtos = new ArrayList<>();
        studentDtos.add(s1);
        studentDtos.add(s2);
    }
}


class StudentDto {
    String name;
    Integer age;
    Integer score;
}

class school {
    String name;
    // ...
}
