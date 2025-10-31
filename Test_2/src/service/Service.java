package service;

import java.time.LocalDate;
import java.util.Map;

import dto.ToDoDto;
import repository.Repository;
import util.IoManager;

public class Service {
    
    private Repository repository = new Repository();

    public void addToDo() {
        IoManager.print("\n============== 할 일을 추가합니다. ==============\n");
        String title = IoManager.printAndInputString("\n해야할 일의 제목을 입력해주세요.\n > ");
        
        if (title.trim().isEmpty()) {
            IoManager.print("제목이 비었습니다. 추가가 취소됩니다.\n");
            return;
        }
        title = title.trim();

        if (repository.findByTitle(title) != null) {
            IoManager.print("이미 동일한 항목이 존재합니다. 추가가 취소됩니다.\n");
            return;
        }

        LocalDate startDay = LocalDate.now();
        repository.saveTodo(title, startDay, null, false, null);
        IoManager.print("\n할 일이 추가되었습니다: '"+ title + "'\n등록일: " + startDay);
        IoManager.pause();
    }

    public void viewAllToDo() {
        Map<String, ToDoDto> allListMap = repository.allToDoList();
        if (allListMap.isEmpty()) {
            System.out.println("\n등록된 할 일이 없습니다.");
            return;
        }
        IoManager.print("\n\n=============== 전체 목록 ===============");
        for (String key : allListMap.keySet()) {
            ToDoDto dtoKey = allListMap.get(key);
            IoManager.print("\n할 일: " + key);
            IoManager.print("\n  등록일: " + dtoKey.getStartDay());
            IoManager.print("  완료일: " + dtoKey.getFinishDay());
            IoManager.print("  완료여부: " + dtoKey.getDoneStatus());
            IoManager.print("  후기: " + dtoKey.getReview());
        }
        IoManager.pause();
    }

    public void finishTodo() {
        String title = IoManager.printAndInputString("완료 처리할 할 일의 제목을 입력하세요\n> ");
        ToDoDto dto = repository.findByTitle(title.trim());

        if (dto == null) {
            IoManager.print("해당 제목의 할 일을 찾을 수 없습니다.");
            return;
        }
        dto.setFinishDay(LocalDate.now());
        dto.setdone(true);
        String review = IoManager.printAndInputString("후기를 입력하세요. (없으면 공란으로 두세요.)\n> ");
        if (review == null || review.isBlank()) {
            dto.setReview(null);
        } else {
            dto.setReview(review.trim());
        }
        IoManager.print("\n완료 되었습니다.");
        IoManager.pause();
    }

    public void viewNotFinishedToDo() {
    IoManager.print("\n\n=============== 미완료 목록 ===============");
    }

    public void viewFinishedToDo() {
    IoManager.print("\n\n=============== 완료 목록 ===============");
    }

    public void searchToDoByKeyword() {
    IoManager.print("\n\n=============== 키워드로 검색 ===============");
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