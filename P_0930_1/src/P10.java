public class P10 {
    public static void main(String[] args) {
        
        // 논리 연산자 && || !  순서대로 and, or, not
        // 논리 연산자의 피연산자는 boolean이고 결과도 boolean 이다. 당연한 소리다.
    {
        int a = 10;
        int b = 20;

        // boolean r1 = a && b;    // 이런거 안 된다. a랑 b가 정수니까. 당연한 소리다.

        boolean r1 = a > 5 && b > 5;    // and: ~이고, 논리곱
        boolean r2 = a > 5 || b > 5;    // or: ~이거나, 논리합

        // &&(and) 랑 ||(or) 는 연산순위 최하위다. 알아두자.


        // ! 는 not에 해당하고, 연산순위 최우선이다. 이건 어찌보면 당연하다.
        boolean r3 = !(a>5 || b>5);     // 이거 예측해보자


    }

    }
}
