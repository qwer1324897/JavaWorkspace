package com.joongang.stm.controller;

import com.joonang.stm.util.IoManager;
import com.joongang.stm.service.Service;

/* 지금은 전체 흐름을 담당하고 있지만
* 나중에 스프링 들어가면 그 때는 사용자 입출력 담당(최전방) */

public class Controller {

    private Service service = new Service();   // 컨트롤러는 서비스를 포함하고 있다.

    public void run() {
        welcome();
        while(true) {
            showmenu();
            String command = selectcommand();
            if(isExitCommand(command)) {
                break;
            }
            processOption(command);
            pause();
        }
        programExit();
    }


    private void welcome() {
        IoManager.print("*************************");
        IoManager.print("    학생 관리 프로그램     ");
        IoManager.print("       version2         ");
        IoManager.print("      2025.10.17        ");
        IoManager.print("*************************");
    }

    private void programExit() {
        IoManager.print("\n\n프로그램을 종료합니다");
        IoManager.print("이용해 주셔서 감사합니다.");
    }

    private void showmenu() {
        IoManager.print("\n*[ Main ]\n");
        IoManager.print("1. 학생 정보 등록");
        IoManager.print("2. 학생 정보 목록");
        IoManager.print("3. 학생 정보 검색");
        IoManager.print("4. 학생 정보 삭제");
        IoManager.print("5. 학생 정보 수정");
        IoManager.print("6. 학생 정보 통계");
        IoManager.print("\n0. 프로그램 종료");
        }

    private String selectcommand() {
        String command = IoManager.input("선택 > ");
        return command;
    }

    private boolean isExitCommand(String command) {
        return command.equals("0");
    }

    private void processOption(String command){

        if(command.equals("1")) {
            service.addStudent();
        } else if(command.equals("2")){
            service.listStudent();
        } else if(command.equals("3")){
            service.serchStudent();
        } else if(command.equals("4")){
            service.removeStudent();
        } else if(command.equals("5")){

        } else if(command.equals("6")){
            service.statistize();
        } else {
            IoManager.print("\n유효하지 않은 값 입니다.");
            IoManager.print("다시 입력해주세요.");
        }
    }

    private void pause(){
        IoManager.pause();
    }
}


