
// 1. 패키지 선언 (선택적, 클래스 파일의 위치를 나타냄)
package prac;

// 2. 필요한 라이브러리 임포트 (여기서는 없음, 기본만 사용)

public class Car {  // 3. 클래스 정의 시작: Car라는 이름의 공용(public) 클래스 선언
    // 4. 필드(속성) 정의: 클래스 내부에 저장되는 변수들
    private String color;  // 5. 색상 필드: String 타입, private(외부 접근 제한)
    private int speed;     // 6. 속도 필드: int 타입, private(외부 접근 제한)

    // 7. 생성자: 객체 생성 시 초기화하는 특수 메서드
    public Car(String initialColor) {  // 8. 생성자 정의: 매개변수 initialColor를 받아 초기화
        this.color = initialColor;     // 9. this.color에 initialColor 값을 대입 (this는 현재 객체 자신 참조)
        this.speed = 0;                // 10. this.speed에 0을 대입 (초기 속도 0으로 설정)
    }

    // 11. 메서드 정의: 객체의 동작을 나타내는 함수들
    public void drive() {              // 12. drive 메서드: 반환값 없음(void), 주행 동작
        System.out.println("차가 " + this.color + "색으로 " + this.speed + "km/h 속도로 달립니다!");  // 13. 출력: color와 speed 값을 문자열로 연결해 콘솔에 출력
    }

    public void accelerate(int increase) {  // 14. accelerate 메서드: increase만큼 속도 증가
        this.speed += increase;             // 15. this.speed에 increase 값을 더해서 다시 저장 (현재 속도 + 증가분)
    }

    // 16. main 메서드: 프로그램 실행 진입점 (클래스 내부에 두는 예시, 보통 별도 클래스)
    public static void main(String[] args) {  // 17. main 메서드 선언: static(클래스 메서드), args는 명령줄 인자 배열
        Car myCar = new Car("빨강");          // 18. myCar 변수에 new Car("빨강")으로 생성된 Car 객체의 참조(주소)를 저장
        myCar.accelerate(50);                 // 19. myCar 객체의 accelerate 메서드에 접근해서 50을 매개변수로 전달 (속도 50 증가)
        myCar.drive();                        // 20. myCar 객체의 drive 메서드에 접근해서 호출 (주행 출력)
    }
}