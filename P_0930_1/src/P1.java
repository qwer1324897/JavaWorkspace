public class P1 {
    public static void main(String[] args) {
        // 변수의 선언과 활용
        int a = 10;
        a = 30;

        System.out.println(a);


        // 명명 규칙은 반드시 지킨다.  변수 = 카멜 케이스

        int studentScore = 70 ;

        
        // 사실상 사용하는 타입은 몇 개 없다.  int, long, double, boolean, String(!기본타입 아님!)
        // 실제 프로젝트에서 기본타입의 변수는 5% 정도 밖에 안 된다. 나머지는 참조타입.

        // 프로모션, 캐스팅  기본타입 7가지(정수 4개, 실수 2개, char 하나)는 서로 변환이 되는데
        // 프로모션은 단방향. 캐스팅은 강제로 가능하지만 주의


        // 지역 변수는 stack에 쌓인다. 블록(중괄호{}) 내에서 선언된 변수는 블록이 끝날 떄 즉시 소멸된다.



        
    }

}
