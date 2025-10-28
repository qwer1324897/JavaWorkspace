package p1;

public class App {
    public static void main(String[] args) {
        MylinkedList list = new MylinkedList();
        list.add(new StudentDto("철수"));
        list.add(new StudentDto("영희"));
        list.add(new StudentDto("길동"));
        list.add(new StudentDto("아영"));

        list.add(new StudentDto("명훈"),2);

        list.remove(1);

        System.out.println(list.get(0).name);
        System.out.println(list.get(1).name);
        System.out.println(list.get(2).name);
        System.out.println(list.get(3).name);
        
    }
}

class StudentDto {
    StudentDto(String name) {
        this.name = name;
    }

    String name;
    int age;
    int score;
}


/* 
 * 학생 정보를 담을 수 있는 알고리즘 - 클래스 정의
 * 링크드 리스트
 * 
 * 목적: 구현 방식을 통해서 알고리즘 동작의 장점과 단점을 이해.
 * 이미 남들이 다 구현해 놨기 때문에 구현할 필요 없이 그냥 갖다 쓰면 된다.
 */


class Node {
    StudentDto data;
    Node next;
}

class MylinkedList {
    private Node firstNode;
    // 추가 (맨뒤)
    public void add(StudentDto data) {
        Node newNode = new Node();
        newNode.data = data;

        if (firstNode == null) {
            firstNode = newNode;
            return;
        }
        // 꼬리 잡기
        Node tempNode = firstNode;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        // 마지막 노드에 새로운 노드 붙이기
        tempNode.next = newNode;
    }   

    // 삽입
    public void add(StudentDto data, int index) {
        Node newNode = new Node();
        newNode.data = data;

        if (index == 0) {
            newNode.next = firstNode;
            firstNode = newNode;
            return;
        }

        Node tempNode = firstNode;
        for (int i = 0; i < index-1 ; i++) {
            tempNode = tempNode.next;
        }

        newNode.next = tempNode.next;
        tempNode.next = newNode;


    }

    // 삭제(최상)
    public void remove(int index) {
        if (index == 0) {
            firstNode = firstNode.next;
            return;
        }

        Node tempNode = firstNode;
        for (int i = 0 ; i < index-1 ; i++) {
            tempNode = tempNode.next;
        }

        tempNode = tempNode.next.next;
    }

    // 접근 (최악. 얘 때문에 링크드리스트 안 쓰고 ArrayList, map hashmap 쓴다.)
    public StudentDto get(int index) {
        if (index == 0) {
            return firstNode.data;
        }

        // 링크드 리스트의 최대 약점 코드
        Node tempNode = firstNode;
        for (int i = 0 ; i < index ; i++) {
            tempNode = tempNode.next;
        }

        return tempNode.data;
    }
}