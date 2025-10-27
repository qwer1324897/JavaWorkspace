package test.house.account.book.ui;

import test.house.account.book.IoManager.IoManager;
import test.house.account.book.service.Service;

public class UI {

    private Service service = new Service();

    public void welcome() {
        IoManager.print("\n\n******* 가계부 관리 프로그램 *******");
        IoManager.print("           Ver.1.0.1            ");
        IoManager.print("       개발자: qwer1324897       ");
        IoManager.print("*********************************\n");
        IoManager.pause();
    }

    public void showMainMenu() {
        IoManager.print("\n============ Main ============\n");
        IoManager.print("1. 수입/지출 내역 등록");
        IoManager.print("2. 수입/지출 내역 목록 및 합계");
        IoManager.print("3. 수입/지출 내역 삭제");
        IoManager.print("4. 카테고리별 합계");
        IoManager.print("5. 금액 내림차순 보기");
        IoManager.print("6. 검색(메모 키워드)");
        IoManager.print("\n0. 프로그램 종료");
    }
    
    public Integer userInputCommand() {
    Integer userinput = IoManager.printAndInputInteger("\n원하시는 항목의 번호를 입력하세요.\n > ");
    return userinput;
    }

    public void showSubMenu(int userinput) {
        if (userinput==1) {
            service.addTransaction();
        } else if (userinput==2) {
            // service 매서드로 기능 구현
        } else if (userinput==3) {
            // service 매서드로 기능 구현
        } else if (userinput==4) {
            // service 매서드로 기능 구현
        } else if (userinput==5) {
            // service 매서드로 기능 구현
        } else if (userinput==6) {
            // service 매서드로 기능 구현
        }
    }

    public void exitProgram() {
        IoManager.print("\n프로그램을 종료합니다. 이용해주셔서 감사합니다.");
        System.exit(0);
    }

    public boolean commandIsExit(Integer userinput){
        return userinput.equals(0);
        
        
    }
}
