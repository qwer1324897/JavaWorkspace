package service;

import java.util.Scanner;

import util.IoManager;

public class Ui {
    
    Service service = new Service();
    Scanner scanner = new Scanner(System.in);

    public void Welcome() {
        IoManager.print("\n\n******* 할 일 관리 프로그램 *******");
        IoManager.print("           Ver.1.0.1            ");
        IoManager.print("       개발자: qwer1324897       ");
        IoManager.print("*********************************\n");
        IoManager.pause();
    }

    public void Menu() {
        IoManager.print("\n============ Menu ============\n");
        IoManager.print("1. 할 일 추가");
        IoManager.print("2. 전체 목록 보기");
        IoManager.print("3. 완료 처리");
        IoManager.print("4. 미완료만 보기");
        IoManager.print("5. 완료만 보기");
        IoManager.print("6. 제목 키워드 검색");
        IoManager.print("7. 삭제");
        IoManager.print("\n0. 프로그램 종료");
    }

    public Integer UserInputCommand() {
        Integer userInput = IoManager.printAndInputInteger("\n원하시는 항목을 선택하세요. > ");
        return userInput;  
    }

    public boolean inputExit(Integer userInput) {
        Integer s = userInput;
        if (s.equals(0)) {
            return true;
        }
        return false;
    }

    public void ProgramExit() {
        IoManager.print("\n프로그램을 종료합니다. 이용해주셔서 감사합니다.");
        System.exit(0);
    }

    public void executeService(Integer userInput) {  
        if(userInput.equals(1)) {
            service.addToDo();
        } else if(userInput.equals(2)){
            service.viewAllToDo();
        } else if(userInput.equals(3)){
            service.finishTodo();
        } else if(userInput.equals(4)){
            service.viewNotFinishedToDo();
        } else if(userInput.equals(5)){
            service.viewFinishedToDo();
        } else if(userInput.equals(6)){
            service.searchToDoByKeyword();
        } else if(userInput.equals(7)){
            service.remove();
        } else {
            IoManager.print("\n유효하지 않은 값 입니다.");
            IoManager.print("다시 입력해주세요.");
        }        
    }
}
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
