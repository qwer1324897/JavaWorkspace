package service;

import repository.Repository;
import util.IoManager;

public class Service {
    
    private Repository repository = new Repository();

    public void addToDo() {
        IoManager.print("\n========= 할 일 목록 입력 =========\n");
        
    
        IoManager.print("================================");
    }

    public void showAllToDoList() {
        repository.allToDoList();
    }

    public void completeTodo() {

    }

    public void showListByNotDone() {

    }

    public void showListByDone() {

    }

    public void searchByKeyword() {

    }

    public void remove() {
        repository.remove(null);
    }
}

// 할일 관리(To Do) 프로그램을 기획하고 구현하세요.
// Map을 사용하는 것이 문제의 핵심입니다.

// 하나의 데이터 구성은
// 할일(제목) String
// 등록일 Date or LocalDate
// 완료일 Date or LocalDate (Null 가능) 
// 완료 여부 boolean
// 후기 String (Null 가능)
// 입니다.

// * 데이터 구조
// Map<String, Todo> - String(키)은 할일, Todo(값)는 그외 추가 정보

// * 화면 예시
// ==== ToDo ====
// 1. 할 일 추가
// 2. 전체 목록 보기
// 3. 완료 처리
// 4. 미완료만 보기
// 5. 완료만 보기
// 6. 제목 키워드 검색
// 7. 삭제
// 0. 종료
// 선택 >