package p2;
import java.util.*;

public class App {
    public static void main(String[] args) {
        List<StudentDto> list = new ArrayList<>();
        list.add(new StudentDto("철수1"));
        list.add(new StudentDto("철수2"));
        list.add(new StudentDto("철수3"));
        list.add(new StudentDto("철수4"));  // 추가

        list.add(2, new StudentDto("끼워넣기"));    // 삽입 - ArrayList 사용시에는 상당한 주의를 요함.
        list.remove(1); // 삭제 - ArrayList 사용시에는 상당한 주의를 요함.

        System.out.println(list.size());


        // for (int i = 0 ; i < list.size() ; i++) {
        //     System.out.println(list.get(i).name);
        // }

        // 이렇게 반복 돌리면 연산이 제곱으로 돌아가기 때문에 하면 안 된다.

        for (StudentDto studentDto : list) {
            System.out.println(studentDto.name);
        }
        // 배열은 항상 이렇게 향상된 for문으로 반복문을 돌려야 한다.

    }
}

class StudentDto {
    StudentDto(String name) {
        this.name = name;
    }
    String name;
    int age;
    int score;
}

