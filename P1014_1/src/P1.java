public class P1 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;     // 얘네는 지역 변수. 하단의 class Qwer 안에 선언한 인스턴스 변수와는 다르다. 얘네는 Stack에 쌓인다.

        Qwer asdf = new Qwer();   // asdf 는 (지역)변수  클래스(Qwer)는 변수를 선언할 수 있다. 
                                  // new Qwer() 은 Qwer이라는 클래스의 인스턴스 변수 메모리를 생성한다는 뜻. 
                                  // 즉, Qwer asdf; 이렇게만 하면 인스턴스 메모리는 생성되지 않는다. 그냥 변수선언 문법이다.
                                  // new Qwer();  <<  이게 인스턴스 메모리 생성 문법이다. 당연히 이렇게만 쓰진 않고, Qwer 변수 = new Qwer(); 이렇게 같이 선언을 해줘야만 한다.
        // 이렇게 생성된 인스턴스 메모리는, 초기값이 없으면 
        // b, score 는 int임으로 0, name 은 String 이기 때문에 null 값으로 초기화 된다.
        
        // 따라서 값을 새로 정의해서 쓸 수 있다.
        // asdf.   .은 접근연산자 - 인스턴스 메모리에 접근한다.
        asdf.a = 10;      // a는 1에서 10으로 바뀐다.
        asdf.b = 20;      // 이렇게 값을 정의한다. 왜냐면 불러다 쓸 값이 초기화 됐기 때문에              


        System.out.println("hi there");   
    }
}

class Tttt{

}



// 클래스 정의 문법   (대문자로 시작하면 다 클래스. System.out.println , Scanner, String 등등)


class Qwer {    // 클래스는 정의, 즉 변수 선언만 가능하다. for문, if문, Sysout 이런거 안 된다.

    // 속성 - 변수 선언
    
    int a = 1 ;    
    int b;
    int score;
    String name;     // 얘네는 멤버변수, '인스턴스 변수'라 한다.



    // 생성자
    

    // 기능

}