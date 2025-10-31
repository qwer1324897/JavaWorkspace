package p4;

public class App {
    public static void main(String[] args) throws Exception{
        long time = System.currentTimeMillis();

        SumThread s1 = new SumThread(1, 250000000);
        SumThread s2 = new SumThread(250000001, 500000000);
        SumThread s3 = new SumThread(500000001, 750000000);
        SumThread s4 = new SumThread(750000001, 1000000000);

        s1.start();
        s2.start();
        s3.start();
        s4.start();

        s1.join();
        s2.join();
        s3.join();
        s4.join();

        long sum = s1.getSum() + s2.getSum() + s3.getSum() + s4.getSum();

        System.out.println(sum);
        System.out.println("총 시간: " + (System.currentTimeMillis() - time) + "ms");
    }
}

// class SumThread extends Thread {

//     @Override
//     public void run() {
//         long sum = 0;
//         for (long i = 1 ; i <= 1000000000L ; i ++) {
//             sum += i;
//         }        
//     }
// }
// 이 코드를 i 10 억을 4개로 나눠서 return값을 뱉는 형태로 쓰려고 하면, 
// 기본적으로 불가능하다. 타입도  void고 값을 4개로 나누면 0~25000000, 250000001~500000000 이렇게 범위 값을 두개를 넣어야 하는데
// 이 경우 결국 Thread도 클래스로 우리가 정의를 한 거기 때문에 클래스 문법을 이해하고 있다면,
// 아래처럼 필드와 생성자를 만들고(파라미터 넣을 수 있음), 게터 세터를 만들어서(리턴값 받을 수 있음) 해결 가능.

class SumThread extends Thread {

    private long start;
    private long end;
    private long sum = 0;


    public SumThread(long start, long end) {
        this.start = start;
        this.end = end;
    }

    public long getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (long i = start; i <= end; i++) {
            sum += i;
        }  
    }
}

