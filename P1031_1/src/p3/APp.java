package p3;

public class APp {
    public static void main(String[] args) throws Exception{
    // 비동기 코드 작성 시 주의 사항
    // 상당수는 데이터를 공유하지 않기 때문에 신경쓰지 않아도 되지만,
    // 여러 쓰레드(비동기 코드)가 메모리를 공유한다면... 버그가 발생할 가능성이 있기 때문에 동기화를 필수로 해야 한다.
    // 하지만 비동기 코드를 동기화 하면 할 수록, 그럴거면 애초부터 동기화로 만들지, 왜 비동기화로 만들어서 계속 동기화 작업을 넣어야 하냐는 모순이 발생됨.
    // 그래서 동기화는, 결과적으로 최소한으로만 범위를 지정해서 해야 의미가 있다. 그게 아니면 그냥 애초부터 설계 자체가 잘못된 것.

    Test t1 = new Test();
    t1.start();
    Test t2 = new Test();
    t2.start();

    // System.out.println(Data.count);  여기서 이걸 카운트 조회하면 0뜬다. 왜냐면 비동기식으로 코드가 돌기 때문에
    // t1.start 실행하고 끝나기 전에 t2.start실행하고. 끝나기 전에 sysout 실행하고 이렇게 따로따로 실행되기 때문에

    t1.join(); // api를 써서 해결. join 동기화 메서드 - t1 쓰레드가 끝날 때 까지 기다림
    t2.join(); // unhandled exception 어쩌구 뜨기때문에 try catch 써줘야 하지만 지금은 그냥 throw로 해결

    System.out.println(Data.count);
    }
}

class Test extends Thread {
    @Override
    public void run() {
        for (int i = 0 ; i < 100 ; i++) {
            Data.increaseCount();
        }        
    }
}

class Data {
    public static int count = 0;
    public synchronized static void increaseCount() {
        int temp = count;

        int a = 10;
        a++;
        a++;
        a++;
        // 오버헤드(작업지연) 발생 목적

        temp ++;
        count = temp;
    }   // 이 코드 synchronized 지우고 돌리면 count가 가끔 200이 안 나올 수도 있다. 왜냐면 동시에 실행되어야 하는데 a++에서 오버헤드가 걸려서 t1 코드가 다 실행되기 전에
        // t2가 실행돼서 count가 메모리를 공유하게 된다. 그래서 가끔 200이 안 나오는 것. 하지만 synchronized를 쓰는 메서드는 그 메서드가 실행될 때는 동기화로 실행된다. > 병목현상 유발.

        // 여기서 궁금증이 오버헤드와 차이점인데, 둘 다 프로그램을 느리게 만들 수 있지만, 여러 스레드가 동시에 못 들어가서 "기다리는 현상"이 진짜 병목(bottleneck)이다.
        // 오버헤드는, 처리는 하는 중인데 그냥 오래걸려서 지연되는 것. 병목은 멈춰서 기다리느라 지연되는 것. 그냥 궁금증 해결용.

}
