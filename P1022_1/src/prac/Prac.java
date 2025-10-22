package prac;

import java.util.ArrayList;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("null");

    }
}

/* 이건 인터페이스 할 때 쓰는건데,(p4패키지에 App 처럼) 기본적으로 이렇게 쓰는게 좋다.
 * 프로그래밍 원칙 > 인터페이스 우선.
 * 그냥 ArrayList 쓰면 나중에 클래스 바꾸면 다 바꿔야 하니까
 * List로 추상화 레벨을 높여서 쓴다.
 */
