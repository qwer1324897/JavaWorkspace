package p3;

import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
        // Queue
        // 큐. 롤 큐돌린다 할 때 큐. 그냥 선입선출(FIFO) or 막입막출(LILO)

        // 큐는 쫙쫙 넣은 걸 먼저 넣은거 순으로 뽑아낸다.
        // 자료구조 특성상 당연히 ArrayLIst 보다 LinkeList가 더 좋겠지?

        Queue<OrderDto> queue = new LinkedList<>();
        queue.offer(new OrderDto("햄버거"));
        queue.offer(new OrderDto("피자"));
        queue.offer(new OrderDto("치킨"));

        System.out.println(queue.poll().name);
        System.out.println(queue.poll().name);
        System.out.println(queue.poll().name);


    }
}

class OrderDto {
    OrderDto (String name) {
        this.name = name;
    }

    String name;

}
