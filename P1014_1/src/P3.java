public class P3 {
    public static void main(String[] args) {
        StudentDto2[] arr = new StudentDto2[5];      // arr이라는 변수에 StudentDto2(대문자로 시작하니까 클래스) 타입의 배열을 5개 생성한다. 인덱스는 0~4까지.
        // 5개의 빈 슬롯(상자 자리)만 만듦. 각 슬롯(arr[0] ~ arr[4])은 null (아무것도 안 가리킴)로 초기화됨. 따라서 이렇게만 해서는 값을 접근해서 쓸 수가 없다.

        arr[0].name = "홍길동";     // 이거 오류 뜬다. 왜? 아직 arr로 만든 배열이 각각의 클래스에 할당이 안되어있기 때문

        arr[0] = new StudentDto2();
        arr[1] = new StudentDto2();
        arr[2] = new StudentDto2();
        arr[3] = new StudentDto2();
        arr[4] = new StudentDto2();      // 이렇게 객체를 생성해야지 그 다음부터 선언이 가능하다
        
        arr[0].age = 20;
        arr[3].score = 70;
        arr[4].name = "철수";       // 이런식으로 . 이래야 오류가 안 뜬다.

            // 주의. 배열만 그렇고 배열아닌건 바로 된다 P4 를 확인해보자.
    }
}

class StudentDto2{
    String name;
    int age;
    int score;   
}

