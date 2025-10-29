package p2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Map<String, TodoAdditionalData> todos = new HashMap<>();
        
        todos.put("미라클 모닝", new TodoAdditionalData());
        todos.put("운동하기", new TodoAdditionalData());
        todos.put("공부하기", new TodoAdditionalData());

        // map 반복 돌리기. 일반적으로 하지 않지만 지금은 이걸 안하고 하려면 코드가 너무 방대해지기 때문에...
        Set<String> keys = todos.keySet();
        for (String key : keys) {
            TodoAdditionalData data = todos.get(key);
            System.out.println("키: " + key + ", 값: " + data.review);
        }
    }
}

class TodoAdditionalData {
    LocalDate startDate;
    LocalDate endDate;
    boolean isDone;
    String review;
}
// 할 일 관리.
// 데이터: 할 일, 등록일, 완료일, 완료여부, 후기.