public class P2 {
    public static void main(String[] args) {
        
        // 특정 구간의 수를 랜덤하게 생성하는 API

        int value = (int)(Math.random()*6) + 1;
        
        // 위는 공식처럼 생각하자. Math.random()*x 는 0부터 x-1 까지의 실수가 출력된다.
        // 40부터 60까지 출력을 원하면 어떻게 해야할까?  40,41, ... 60 총 21가지 출력을 원하는 거니까,
        // (Math.random()*21) + 40  이렇게 하고 정수로 캐스팅하면 된다. 계산하지 말고 공식처럼 외우면 된다. 쓰다보면 외워진다.

    }
}
