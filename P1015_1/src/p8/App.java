package p8;

public class App {
    public static void main(String[] args) {
        StudentDto s1 = new StudentDto();

        s1.name = ("철수");     // 이거 안 된다. 만약에 name 이 private 이 아니라 public 이었다면 가능하겠지만, 클래스 필드는 무조건 private으로 한다.
        s1.setName("철수"); 
        System.out.println(s1.name);   // 이렇게는 안 된다.
        System.out.println(s1.getName());   // 이런식으로 메서드(주로 조건이나 검사를 함)를 통해서 접근할 수 있다.
        
        // 왜 이렇게 할까. main에서 바로 수정 못하게 하려 하는거다. 메서드에 조건문이나 검사문을 덕지덕지 달아서, 메서드를 통해서만 접근하게 만들어서 안정성, 보안성을 높이는 것.
    }
}

// Dto = 기능 없음. 데이터 묶는 용도의 클래스
class StudentDto {
    private String name;
    private int age;
    private int score;

    // setter - write
    public void setName(String name) {
        this.name = name;
    }

    // getter - read 권한
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void getScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
