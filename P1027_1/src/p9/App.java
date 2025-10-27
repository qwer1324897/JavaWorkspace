package p9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        
        // 자료구조: Collection Framework

        List<String> list = new ArrayList<>();
        list.add("이름1");
        list.add("이름2");
        list.add("이름3");
        list.add("이름4");
        list.add("이름5");

        System.out.println(list.size());

        for(String e : list) {
            System.out.println(e);
        }

        /////////////////////////////////////////////////////
        
        Map<String, Object> map = new HashMap<>();
        map.put("이름", "이름1");
        map.put("나이", 20);
        map.put("점수", 90);

        System.out.println(map.get("이름") + ": " + map.get("점수"));

    }
}
