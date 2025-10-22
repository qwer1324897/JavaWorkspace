package p4;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        
        // 배열 대신 사용하는 api

        List<StudentDto> list = new ArrayList<>();

        list.add(new StudentDto("철수"));
        list.add(new StudentDto("영희"));
        list.add(new StudentDto("길동"));
        list.add(new StudentDto(""));
        list.add(new StudentDto(""));

        // 리스트(위 배열 대체 api)에서 값을 뽑아 오는 방법

        list.get(2);    // 이러면 길동이 호출
        StudentDto studentDto = list.get(2);
        System.out.println(studentDto.getName());   // 이러면 길동이 출력

        for(StudentDto element : list) {
            System.out.println(element.getName());
        }
    }
}

class StudentDto {
    private String name;
    
    public StudentDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
