public class P1 {
    public static void main(String[] args) {
        
        System.out.println("Hi there!!");
        // 자바 주석은 슬래쉬 슬래쉬      
        /* 
        여러줄 주석은
        슬래쉬 별
        */
        // 여러줄 주석처리는 단축키가 편함. 하는 법은 드래그하고 컨트롤 + 슬래쉬



        // 자바는 3가지 형태의 오류가 있다.
        
        // 1. 문법 오류 > 컴파일 불가능. 빨간 밑줄로 오류지점을 알려줌. 노란 밑줄은 문법오류는 없지만 실행이 안될경우
        

        // 2. 런타임 오류

        int a = 10;
        int result = a/0;

        System.out.println(result);

        // 위의 코드는 정수를 0으로 나누는 것이 불가능하기 때문에
        // 문법오류, 즉 컴파일 오류는 없지만 실행시에 exception(예외)가 발생. 터미널에 Exception in thread ~ 라고 어디가 어떻게 잘못됐는지 출력됨.


        // 3. 버그 > 논리 오류. 코드 자체는 문제가 없지만 잘못짜셔 원하는 출력이 안 나옴 (프로그램이 안 알려주기 때문에 일일이 찾아야 함)

        int score = 95;
        
        if(score >= 90) {
            System.out.println("90점 이상입니다.");
        } else {
            System.out.println("90점 미만입니다.");
        }














    }   

}
